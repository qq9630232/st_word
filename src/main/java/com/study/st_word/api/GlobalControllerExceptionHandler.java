package com.study.st_word.api;


import com.study.st_word.bo.Response;
import com.study.st_word.common.exception.GlobalException;
import com.study.st_word.enums.ResponseEnum;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.FieldError;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * 全局Controller异常处理
 * Created by wangyubing on 2019/11/20.
 */
@RestControllerAdvice
public class GlobalControllerExceptionHandler {

    private static final Logger logger = LoggerFactory.getLogger(GlobalControllerExceptionHandler.class);

    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public Response messageHandler(HttpServletRequest request, MethodArgumentNotValidException e) {
        String path = request.getRequestURL().toString();
        FieldError fieldError = e.getBindingResult().getFieldError();
        String error = null;
        if (fieldError != null) {
            error = e.getBindingResult().getFieldError().getDefaultMessage();
        }
        if (error == null) {
            error = ResponseEnum.PARAM_ERROR.getMessage();
        }
        logger.error("messageHandler服务错误,接口=[{}],错误原因=[{}]", path, e.getMessage());
        return Response.error(ResponseEnum.PARAM_ERROR.getCode(), error);
    }

    @ExceptionHandler(value = Exception.class)
    public Response exceptionHandler(HttpServletRequest request, Exception e) {
        String path = request.getRequestURL().toString();
        logger.error("exceptionHandler服务错误,接口=[{}],错误原因=[{}]", path, e.getMessage());
        e.printStackTrace();
        return Response.error();
    }


    @ExceptionHandler(value = GlobalException.class)
    public Response globalHandler(HttpServletRequest request, GlobalException e) {
        String path = request.getRequestURL().toString();
        logger.error("globalHandler预计中的错误,接口=[{}],错误信息=[{}]", path, e.getMessage());
        e.printStackTrace();
        return Response.error(e.getCode(), e.getMessage());
    }

    @ExceptionHandler(value = HttpRequestMethodNotSupportedException.class)
    public Response globalHandler(HttpServletRequest request, HttpRequestMethodNotSupportedException e) {
        String path = request.getRequestURL().toString();
        logger.error("HttpRequestMethodNotSupportedException错误,接口=[{}],错误信息=[{}]", path, e.getMessage());
        e.printStackTrace();
        return Response.error(ResponseEnum.PARAM_ERROR.getCode(), e.getMessage());
    }

    @ExceptionHandler(value = InvalidFormatException.class)
    public Response invalidFormatException(HttpServletRequest request, InvalidFormatException e) {
        String path = request.getRequestURL().toString();
        logger.error("InvalidFormatException,接口=[{}],错误信息=[{}]", path, e.getMessage());
        e.printStackTrace();
        return Response.error(ResponseEnum.PARAM_ERROR.getCode(), "参数填写有误，请重新输入");
    }

    @ExceptionHandler(value = HttpMessageNotReadableException.class)
    public Response httpMessageNotReadableException(HttpServletRequest request, HttpMessageNotReadableException e) {
        String path = request.getRequestURL().toString();
        logger.error("InvalidFormatException,接口=[{}],错误信息=[{}]", path, e.getMessage());
        e.printStackTrace();
        return Response.error(ResponseEnum.PARAM_ERROR.getCode(), "参数填写有误，请重新输入");
    }

}
