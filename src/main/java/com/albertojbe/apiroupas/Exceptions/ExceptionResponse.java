package com.albertojbe.apiroupas.Exceptions;

import java.io.Serializable;
import java.time.LocalDateTime;

public class ExceptionResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    private String message;
    private LocalDateTime date;
    private String details;

    public ExceptionResponse(String message, LocalDateTime date, String details) {
        this.message = message;
        this.date = date;
        this.details = details;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
