package com.example.demo.Advice;

import com.example.demo.until.JsonResult;
import org.springframework.messaging.handler.annotation.support.MethodArgumentNotValidException;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.ConstraintViolationException;


/**
 * @Author:linjunbo
 * @Description:  参数校验拦截器
 * @Date: 2020/3/18 14:31
 */
@RestControllerAdvice
public class CheckOutAdvice {

    /**
     * post请求参数校验抛出的异常
     * @param e
     * @return
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public JsonResult methodArgumentNotValidExceptionHandler(MethodArgumentNotValidException e){
        //获取异常中随机一个异常信息
        String defaultMessage = e.getBindingResult().getFieldError().getDefaultMessage();
        return JsonResult.fail(defaultMessage);
    }

    /**
     * get请求参数校验抛出的异常
     * @param e
     * @return
     */
    @ExceptionHandler(BindException.class)
    public JsonResult bindExceptionHandler(BindException e){
        //获取异常中随机一个异常信息
        String defaultMessage = e.getBindingResult().getFieldError().getDefaultMessage();
        return JsonResult.fail(defaultMessage);
    }

    /**
     * 请求方法中校验抛出的异常
     * @param e
     * @return
     */
    @ExceptionHandler(ConstraintViolationException.class)
    public JsonResult constraintViolationExceptionHandler(ConstraintViolationException e){
        //获取异常中第一个错误信息
        String message = e.getConstraintViolations().iterator().next().getMessage();
        return JsonResult.fail(message);
    }

    /**
     * 全局异常处理
     * @param e
     * @return
     */
    @ExceptionHandler(Exception.class)
    public JsonResult Exception(Exception e){
        //获取异常中第一个错误信息
        String message = e.getMessage();
        return JsonResult.fail("请求错误");
    }
}