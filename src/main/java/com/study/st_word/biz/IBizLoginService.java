package com.study.st_word.biz;


import com.study.st_word.bo.LoginBo;
import com.study.st_word.bo.Response;

/**
 * @author bianbian
 * @date 2021-04-21 17:33
 */
public interface IBizLoginService {
    Response studyLogin(LoginBo loginBo);

    Response studyRegister(LoginBo loginBo);

    Response studyEdit(LoginBo loginBo);
}
