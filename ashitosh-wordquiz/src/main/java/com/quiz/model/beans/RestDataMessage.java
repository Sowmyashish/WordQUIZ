package com.quiz.model.beans;

import org.springframework.http.HttpStatus;

/**
 * Created by ashitosh on 10/05/18.
 */
public class RestDataMessage<T> extends RestMessage<T> {

    public RestDataMessage() {
        super.setStatus(HttpStatus.OK.getReasonPhrase());
    }

    public RestDataMessage(T data) {
        this.setData(data);
        this.setStatus(HttpStatus.OK.getReasonPhrase());
    }

    public RestDataMessage(String status, T data) {
        this.setStatus(status);
        this.setData(data);
    }
}
