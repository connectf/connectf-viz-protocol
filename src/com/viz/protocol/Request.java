package com.viz.protocol;

/**
 * Created by Kai on 2015/12/13.
 */
public class Request {

    private Integer requestId;

    public Request(Integer requestId) {
        this.requestId = requestId;
    }

    public Integer getRequestId() {
        return requestId;
    }

    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }
}
