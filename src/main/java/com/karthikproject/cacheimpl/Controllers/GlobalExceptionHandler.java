package com.karthikproject.cacheimpl.Controllers;

import com.karthikproject.cacheimpl.Exceptions.NoObjectFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(NoObjectFoundException.class)
    public ResponseEntity notFount(){
        return ResponseEntity.notFound().build();
    }

}
