package com.study.st_word.api.login;


import com.study.st_word.biz.IBizLoginService;
import com.study.st_word.bo.LoginBo;
import com.study.st_word.bo.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * @author songdechuan
 * @date 2021-04-21 16:50
 */
@RestController
@CrossOrigin("*")
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private IBizLoginService loginService;

    /**
     * 用户登录
     * @param loginBo
     * @return
     */
    @RequestMapping(value = "/study/login", method = RequestMethod.POST)
    public Response studyLogin(@RequestBody LoginBo loginBo) {
        return loginService.studyLogin(loginBo);
    }

    /**
     * 用户注册
     * @param loginBo
     * @return
     */
    @RequestMapping(value = "/study/register", method = RequestMethod.POST)
    public Response studyRegister(@RequestBody LoginBo loginBo)  {
        return loginService.studyRegister(loginBo);
    }

    /**
     * 用户修改密码
     * @param loginBo
     * @return
     */
    @RequestMapping(value = "/study/edit", method = RequestMethod.POST)
    public Response studyEdit(@RequestBody LoginBo loginBo)  {
        return loginService.studyEdit(loginBo);
    }
}
