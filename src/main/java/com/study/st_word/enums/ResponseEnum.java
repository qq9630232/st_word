package com.study.st_word.enums;

/**
 * 返回状态枚举
 * @author wangyubing
 * @emil 1326124948@qq.com
 */
public enum ResponseEnum {
	SUCCESS(200, "success"),
	ERROR(500, "请联系管理员"),
	PARAM_ERROR(400, "请输入正确的参数"),
	UNKNOWN(-1, "unknown"),
	NO_LOGIN(-2, "用户未登录"),
	ERROR_TEMPLATE(-3, "请上传正确的模板"),
	OFTEN_REQUEST(-4,"请求过于频繁,请10分钟后再试"),
	LOGIN_ERROR(-5,"账号或密码错误"),
	LOGIN_NO_PERMISSION(-6,"当前域账号未开通权限"),
	ERROR_AND_NOT_CLOSE(-7,"错误并关闭窗口")
	;

	private int code;
	private String message;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	ResponseEnum(int code, String message) {
		this.code = code;
		this.message = message;
	}
}
