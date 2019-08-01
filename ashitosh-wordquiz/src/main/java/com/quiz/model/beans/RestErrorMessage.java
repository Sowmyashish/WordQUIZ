package com.quiz.model.beans;

import org.springframework.http.HttpStatus;

/**
 * Created by ashitosh on 10/05/18.
 */
public class RestErrorMessage<T> extends RestMessage<T> {

    public RestErrorMessage() {
        this.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase());
    }

    public RestErrorMessage(ErrorMessagePayload error) {
        this.setError(error);
        this.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase());
    }

    public RestErrorMessage(String status, ErrorMessagePayload error) {
        this.setStatus(status);
        this.setError(error);
    }

}
