package com.blogApp.newblogapp.errors;

import com.blogApp.newblogapp.entity.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@ResponseStatus
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {
        @ExceptionHandler(UserNotFoundException.class)
        public ResponseEntity<ErrorMessage> userNotFoundException(UserNotFoundException exception, WebRequest request){
                String msg = exception.getMessage();
                ErrorMessage message = new ErrorMessage(HttpStatus.NOT_FOUND,msg);
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
        }
}
