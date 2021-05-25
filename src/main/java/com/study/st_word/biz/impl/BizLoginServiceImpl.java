package com.study.st_word.biz.impl;


import com.study.st_word.biz.IBizLoginService;
import com.study.st_word.bo.LoginBo;
import com.study.st_word.bo.Response;
import com.study.st_word.common.exception.GlobalException;
import com.study.st_word.enums.ResponseEnum;
import com.study.st_word.mysql.domain.cc.po.Admin;
import com.study.st_word.mysql.domain.cc.po.AdminExample;
import com.study.st_word.mysql.service.ILoginService;
import com.study.st_word.utils.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * @author songdechuan
 * @date 2021-04-21 17:33
 */
@Service
public class BizLoginServiceImpl implements IBizLoginService {
//    @Autowired
//    private IUserAdminService userAdminService;
    @Autowired
    private ILoginService loginService;

    @Override
    public Response studyLogin(LoginBo loginBo) {
        //获取请求传来的用户名和密码
        String username = loginBo.getUsername();
        String password = loginBo.getPassword();
        //对用户名和密码进行判空操作
        if(StringUtil.isEmpty(username) || StringUtil.isEmpty(password)){
            throw new GlobalException(ResponseEnum.PARAM_ERROR.getCode(),"用户名或者密码不能为空");
        }
        //判断有没有此用户名
        AdminExample example = new AdminExample();
        example.createCriteria().andUsernameEqualTo(username);
        List<Admin> admins = loginService.selectByExample(example);
        if(CollectionUtils.isEmpty(admins)){
            throw new GlobalException(ResponseEnum.PARAM_ERROR.getCode(),"用户名错误");
        }
        //判断密码是否正确
        AdminExample passwordEx = new AdminExample();
        passwordEx.createCriteria().andUsernameEqualTo(username).andPasswordEqualTo(password);
        List<Admin> psAdmin = loginService.selectByExample(passwordEx);
        if(CollectionUtils.isEmpty(psAdmin)){
            throw new GlobalException(ResponseEnum.PARAM_ERROR.getCode(),"密码错误");
        }
        // 返回用户id
        return Response.success(psAdmin.get(0).getId());
    }

    @Override
    public Response studyRegister(LoginBo loginBo) {
        //获取请求传来的用户名和密码
        String username = loginBo.getUsername();
        String password = loginBo.getPassword();
        //判空操作
        if(StringUtil.isEmpty(username) || StringUtil.isEmpty(password) ){
            throw new GlobalException(ResponseEnum.PARAM_ERROR.getCode(),"用户名或者密码不能为空");
        }
        //判断此用户是否已被注册
        AdminExample example = new AdminExample();
        example.createCriteria().andUsernameEqualTo(username);
        List<Admin> admins = loginService.selectByExample(example);
        if(!CollectionUtils.isEmpty(admins)){
            throw new GlobalException(ResponseEnum.PARAM_ERROR.getCode(),"此用户名已存在");
        }
        //插入用户名和密码讯息
        Admin admin = new Admin();
        admin.setUsername(username);
        admin.setPassword(password);
        admin.setIs_active(1);

        loginService.insertSelective(admin);
        List<Admin> adminList = loginService.selectByExample(example);

//        //对用户做默认信息插入
//        OfflineText record = new OfflineText();
//        record.setType(100);
//        record.setRecordId(adminList.get(0).getId());
//        record.setUpdateTime(new Date());
//        record.setCreateTime(new Date());
//        record.setIsActive(1);
//        record.setChannel("");
//        record.setContent("");
//        record.setUrl("测试");
//        record.setTaskId("男");
//        iOfflineTextService.insertSelective(record);
        return Response.success("注册成功");
    }

    @Override
    public Response studyEdit(LoginBo loginBo) {
        //获取请求传来的用户名和密码
        Integer adminId = loginBo.getAdminId();
        String password = loginBo.getPassword();
        //判空操作
//        if(StringUtil.isEmpty(adminId) || StringUtil.isEmpty(password) ){
//            throw new GlobalException(ResponseEnum.PARAM_ERROR.getCode(),"用户名或者密码不能为空");
//        }
        AdminExample example = new AdminExample();
        example.createCriteria().andIdEqualTo(adminId);
        List<Admin> admins = loginService.selectByExample(example);
        if(CollectionUtils.isEmpty(admins)){
            throw new GlobalException(ResponseEnum.PARAM_ERROR.getCode(),"没有此用户");
        }
        //设置修改的密码
        Admin admin = new Admin();
//        admin.setName(username);
        admin.setId(adminId);
        admin.setPassword(password);
        admin.setIs_active(1);
        //更新数据login
        loginService.updateByPrimaryKeySelective(admin);
        return Response.success("修改密码成功");
    }
}
