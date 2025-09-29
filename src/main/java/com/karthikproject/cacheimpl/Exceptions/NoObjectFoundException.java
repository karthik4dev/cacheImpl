package com.karthikproject.cacheimpl.Exceptions;

import org.springframework.web.bind.annotation.ControllerAdvice;

public class NoObjectFoundException extends RuntimeException{
    public NoObjectFoundException(String message){
        super(message);
    }

}
