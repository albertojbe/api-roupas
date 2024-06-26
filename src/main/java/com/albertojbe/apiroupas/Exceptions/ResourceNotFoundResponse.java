package com.albertojbe.apiroupas.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundResponse extends RuntimeException {

    public ResourceNotFoundResponse(String message) {
        super(message);
    }
}
