package com.study.st_word.mysql.core.cc.dao;

import com.study.st_word.mysql.domain.cc.po.Word;
import com.study.st_word.mysql.domain.cc.po.WordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WordMapper {
    int countByExample(WordExample example);

    int deleteByExample(WordExample example);

    int deleteByPrimaryKey(Integer wordId);

    int insert(Word record);

    int insertSelective(Word record);

    List<Word> selectByExample(WordExample example);

    Word selectByPrimaryKey(Integer wordId);

    int updateByExampleSelective(@Param("record") Word record, @Param("example") WordExample example);

    int updateByExample(@Param("record") Word record, @Param("example") WordExample example);

    int updateByPrimaryKeySelective(Word record);

    int updateByPrimaryKey(Word record);
}