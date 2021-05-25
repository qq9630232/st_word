package com.study.st_word.biz.impl;


import com.study.st_word.biz.IBizDataService;
import com.study.st_word.bo.DataBo;
import com.study.st_word.bo.ProgressBo;
import com.study.st_word.bo.WordBo;
import com.study.st_word.bo.WordProgressBo;
import com.study.st_word.mysql.core.cc.dao.BookMapper;
import com.study.st_word.mysql.core.cc.dao.ProgressMapper;
import com.study.st_word.mysql.core.cc.dao.VideoMapper;
import com.study.st_word.mysql.core.cc.dao.WordMapper;
import com.study.st_word.mysql.domain.cc.po.*;
import com.study.st_word.utils.StringUtil;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author songdechuan
 * @date 2021-04-21 18:48
 */
@Service
public class BizDataServiceImpl implements IBizDataService {

    @Autowired
    private VideoMapper videoMapper;
    @Autowired
    private WordMapper wordMapper;
    @Autowired
    private ProgressMapper progressMapper;
    @Autowired
    private BookMapper bookMapper;
    @Override
    public Object videoList() {
        //查询视频列表的数据
        VideoExample example = new VideoExample();
        List<DataBo> datas = new ArrayList<>();
        List<Video> videos = videoMapper.selectByExample(example);
        //对数据对象重新解析

        //返回参数
        return videos;
    }

    @Override
    public Object wordList() {
        WordExample example = new WordExample();
        List<Word> records = wordMapper.selectByExample(example);

        return records;
    }

    @Override
    public Object editPro(ProgressBo progressBo) {
        Integer id = progressBo.getId();
        Integer adminId = progressBo.getAdminId();
//        progressMapper.
        return null;
    }

    @Override
    public Object unknow(WordBo wordBo) {
        Integer adminId = wordBo.getAdminId();
        Integer type = wordBo.getType();
        Integer wordId = wordBo.getWordId();
        ProgressExample example = new ProgressExample();
        example.createCriteria().andAdmin_idEqualTo(adminId)
                .andWord_idEqualTo(wordId);
//                .andTypeEqualTo(type);
        List<Progress> progresses = progressMapper.selectByExample(example);
        if(CollectionUtils.isEmpty(progresses)){
            Progress progress = new Progress();
            progress.setAdmin_id(adminId);
            progress.setType(type);
            progress.setWord_id(wordId);
            progressMapper.insertSelective(progress);
        }else {
            Progress progress = progresses.get(0);
            progress.setType(type);
            progressMapper.updateByPrimaryKey(progress);
        }
        return null;

    }

    @Override
    public Object know(WordBo wordBo) {
        Integer adminId = wordBo.getAdminId();
        Integer type = wordBo.getType();
        Integer wordId = wordBo.getWordId();
        ProgressExample example = new ProgressExample();
        example.createCriteria().andAdmin_idEqualTo(adminId)
                .andWord_idEqualTo(wordId);
//                .andTypeEqualTo(type);
        List<Progress> progresses = progressMapper.selectByExample(example);
        if(CollectionUtils.isEmpty(progresses)){
            Progress progress = new Progress();
            progress.setAdmin_id(adminId);
            progress.setType(type);
            progress.setWord_id(wordId);
            progressMapper.insertSelective(progress);
        }else {
            Progress progress = progresses.get(0);
            progress.setType(type);
            progressMapper.updateByPrimaryKey(progress);
        }
        return null;
    }

    @Override
    public Object getProgress(WordBo wordBo) {
        Integer adminId = wordBo.getAdminId();
        ProgressExample example = new ProgressExample();
        example.createCriteria().andAdmin_idEqualTo(adminId);
        List<Progress> progresses = progressMapper.selectByExample(example);
        WordProgressBo wordProgressBo = new WordProgressBo();
        int knowCount = 0;
        int unKnowCount = 0;
        for (Progress progress : progresses) {
            Integer type = progress.getType();
            if(type.equals(1)){
                knowCount ++;
            }else {
                unKnowCount++;
            }
        }
        wordProgressBo.setKnowCount(knowCount);
        wordProgressBo.setUnKnowCount(unKnowCount);
        return wordProgressBo;
    }

    @Override
    public Object bookList() {
        return bookMapper.selectByExampleWithBLOBs(new BookExample());
    }
}
