package com.study.st_word.mysql.core.cc.dao;

import com.study.st_word.mysql.domain.cc.po.Progress;
import com.study.st_word.mysql.domain.cc.po.ProgressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProgressMapper {
    int countByExample(ProgressExample example);

    int deleteByExample(ProgressExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Progress record);

    int insertSelective(Progress record);

    List<Progress> selectByExample(ProgressExample example);

    Progress selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Progress record, @Param("example") ProgressExample example);

    int updateByExample(@Param("record") Progress record, @Param("example") ProgressExample example);

    int updateByPrimaryKeySelective(Progress record);

    int updateByPrimaryKey(Progress record);
}