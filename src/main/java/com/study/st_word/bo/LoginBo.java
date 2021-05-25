package com.study.st_word.bo;

/**
 * @author bianbian
 * @date 2021-04-21 17:22
 */
public class LoginBo {

    private Integer adminId;

    private String username;

    private String password;

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public LoginBo() {
    }

    public LoginBo(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
