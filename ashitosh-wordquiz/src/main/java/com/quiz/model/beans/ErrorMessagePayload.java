package com.quiz.model.beans;

/**
 * Created by ashitosh on 10/05/18.
 */
public class ErrorMessagePayload {
    private String message;

    public ErrorMessagePayload() {
    }

    public ErrorMessagePayload(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
