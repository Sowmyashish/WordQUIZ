package com.quiz.model.beans;

/**
 * Created by ashitosh on 10/05/18.
 */
public class RestMessage <T> {
    private String status;
    private T data;
    private ErrorMessagePayload error;

    public RestMessage() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public ErrorMessagePayload getError() {
        return error;
    }

    public void setError(ErrorMessagePayload error) {
        this.error = error;
    }
}
