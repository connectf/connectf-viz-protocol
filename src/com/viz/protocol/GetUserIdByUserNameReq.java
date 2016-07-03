package com.viz.protocol;

/**
 * Created by kzkaizhao on 2015/12/28.
 */
public class GetUserIdByUserNameReq extends Request {

    private String userName;

    public GetUserIdByUserNameReq(String userName) {
        super(RequestId.GetUserIdByUserNameReq_Id);
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
