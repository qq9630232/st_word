package com.study.st_word.bo;


import com.study.st_word.enums.ResponseEnum;

/**
 * 返回bean
 * Created by wangyubing on 2019/2/12.
 * @see ResponseEnum
 */
public class Response {

	private Integer code;

	private String message;

	private Object data;

	public Response() {
	}

	public Response(Integer code, String message, Object data) {
		this.code = code;
		this.message = message;
		this.data = data;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public static Response success(Object data) {
		return new Response(ResponseEnum.SUCCESS.getCode(), ResponseEnum.SUCCESS.getMessage(), data);
	}

	public static Response success() {
		return new Response(ResponseEnum.SUCCESS.getCode(), ResponseEnum.SUCCESS.getMessage(), null);
	}

	public static Response success(String message, Object data) {
		return new Response(ResponseEnum.SUCCESS.getCode(), message, data);
	}

	public static Response error() {
		return error(null);
	}

	public static Response error(Object data) {
		return error(ResponseEnum.ERROR.getCode(), ResponseEnum.ERROR.getMessage(), data);
	}

	public static Response error(Integer code, String message, Object data) {
		return new Response(code, message, data);
	}

	public static Response error(Integer code, String message) {
		return new Response(code, message, null);
	}

	public static Response noLogin() {
		return new Response(ResponseEnum.NO_LOGIN.getCode(), ResponseEnum.NO_LOGIN.getMessage(), null);
	}

}
