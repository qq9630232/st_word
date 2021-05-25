package com.study.st_word.mysql.service.Impl;

import com.study.st_word.mysql.core.cc.dao.AdminMapper;
import com.study.st_word.mysql.domain.cc.po.Admin;
import com.study.st_word.mysql.domain.cc.po.AdminExample;
import com.study.st_word.mysql.service.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author songdechuan
 * @date 2021-05-21 20:32
 */
@Service
public class LoginServiceImpl implements ILoginService {
    @Autowired
    private AdminMapper mapper;
    @Override
    public int insertSelective(Admin record) {
        return mapper.insertSelective(record);
    }

    @Override
    public List<Admin> selectByExample(AdminExample example) {
        return mapper.selectByExample(example);
    }

    @Override
    public Admin selectByPrimaryKey(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(Admin record, AdminExample example) {
        return mapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(Admin record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Admin record) {
        return 0;
    }
}
