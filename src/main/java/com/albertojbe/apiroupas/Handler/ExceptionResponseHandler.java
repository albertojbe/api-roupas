package com.albertojbe.apiroupas.Handler;

import com.albertojbe.apiroupas.Exceptions.ExceptionResponse;
import com.albertojbe.apiroupas.Exceptions.ResourceNotFoundResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;

@ControllerAdvice
@RestController
public class ExceptionResponseHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ExceptionResponse> HandleAllExceptions(Exception ex, WebRequest request){
        ExceptionResponse response = new ExceptionResponse(ex.getMessage(),
                 LocalDateTime.now(),
                request.getDescription(false));
        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }
    @ExceptionHandler(ResourceNotFoundResponse.class)
    public ResponseEntity<ExceptionResponse> HandleNotFoundExceptions(Exception ex, WebRequest request){
        ExceptionResponse response = new ExceptionResponse(ex.getMessage(),
                LocalDateTime.now(),
                request.getDescription(false));
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }
}
