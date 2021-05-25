package com.study.st_word.mysql.service;

import com.study.st_word.mysql.domain.cc.po.Admin;
import com.study.st_word.mysql.domain.cc.po.AdminExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author songdechuan
 * @date 2021-05-21 20:32
 */
public interface ILoginService {

    int insertSelective(Admin record);

    List<Admin> selectByExample(AdminExample example);

    Admin selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Admin record, @Param("example") AdminExample example);


    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);
}
