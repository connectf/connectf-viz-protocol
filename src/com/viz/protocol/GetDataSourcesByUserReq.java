package com.viz.protocol;

/**
 * Created by Kai on 2015/12/13.
 */
public class GetDataSourcesByUserReq extends Request{
    private String userId;

    public GetDataSourcesByUserReq( String userId) {
        super(RequestId.GetDataSourcesByUserReq_Id);
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}

