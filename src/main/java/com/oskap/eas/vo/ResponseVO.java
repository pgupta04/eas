package com.oskap.eas.vo;

/**
 * Created by ZNE45571 on 4/14/18.
 */
public class ResponseVO<T> {
    private T results;

    public ResponseVO(T results) {
        this.results = results;
    }

    public T getResults() {
        return this.results;
    }
}