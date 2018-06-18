package com.example.demo;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.http.HttpStatus;

public class ResponseObject {

    @JsonProperty(value = "status")
    private HttpStatus status;

    @JsonProperty(value = "message")
    private String message;

    public ResponseObject(HttpStatus status, String message) {
        this.status = status;
        this.message = message;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
