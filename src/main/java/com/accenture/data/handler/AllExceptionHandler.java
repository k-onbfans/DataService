package com.accenture.data.handler;

import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class AllExceptionHandler {

    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    @ResponseBody
    private Map<String, Object> handleMethodArgumentNotValidException(MethodArgumentNotValidException error){
        Map<String, Object> map = new HashMap<>();
        ObjectError e = error.getBindingResult().getAllErrors().get(0);
        map.put("defaultMessage",e.getDefaultMessage());
        map.put("error","Bad Request");
        map.put("status",400);
        return map;
    }

    @ExceptionHandler(value = InterruptedException.class)
    @ResponseBody
    private Map<String, Object> handleInterruptedException(InterruptedException error){
        Map<String, Object> map = new HashMap<>();
        map.put("defaultMessage",error.getMessage());
        map.put("error","Bad Request");
        map.put("status",400);
        return map;
    }
}
