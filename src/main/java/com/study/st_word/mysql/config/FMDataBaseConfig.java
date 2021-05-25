package com.study.st_word.mysql.config;

import com.alibaba.druid.filter.Filter;
import com.alibaba.druid.filter.logging.Log4j2Filter;
import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

@Configuration
@MapperScan(basePackages = "com.study.st_word.mysql.core.cc.dao", sqlSessionFactoryRef = "PFSqlSessionFactory")
@PropertySource("${mysql.mybatis.properties}")
public class FMDataBaseConfig {
    static final String MAPPER_LOCATION = "classpath:mapper/*.xml";

    @Value("${fm.datasource.url}")
    private String url;

    @Value("${fm.datasource.username}")
    private String user;

    @Value("${fm.datasource.password}")
    private String password;

    @Value("${fm.datasource.driverClassName}")
    private String driverClass;

    @Bean(name = "PFDataSource")
    @Primary
    public DataSource PFDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setTestOnBorrow(true);
        dataSource.setDriverClassName(driverClass);
        dataSource.setUrl(url);
        dataSource.setUsername(user);
        dataSource.setPassword(password);
        List<Filter> filters = new ArrayList<>();
        Log4j2Filter log4j2Filter = new Log4j2Filter();
        log4j2Filter.setStatementExecutableSqlLogEnable(true);
        filters.add(log4j2Filter);
        dataSource.setProxyFilters(filters);
        return dataSource;
    }

    @Bean(name = "PFTransactionManager")
    @Primary
    public DataSourceTransactionManager PFTransactionManager() {
        return new DataSourceTransactionManager(PFDataSource());
    }

    @Bean(name = "PFSqlSessionFactory")
    @Primary
    public SqlSessionFactory PFSqlSessionFactory(@Qualifier("PFDataSource") DataSource PFDataSource)
            throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(PFDataSource);
//        Interceptor interceptor = new PageInterceptor();
        Properties properties = new Properties();
        properties.setProperty("helperDialect", "mysql");
        properties.setProperty("offsetAsPageNum", "true");
        properties.setProperty("rowBoundsWithCount", "true");
        properties.setProperty("reasonable", "true");
        properties.setProperty("supportMethodsArguments", "true");
//        properties.setProperty("params", "pageNum=pageNumKey;pageSize=pageSizeKey;");
//        interceptor.setProperties(properties);
//        sessionFactory.setPlugins(new Interceptor[]{interceptor});
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources(MAPPER_LOCATION));
        return sessionFactory.getObject();
    }
}