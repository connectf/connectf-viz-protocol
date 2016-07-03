package com.viz.protocol;

/**
 * Created by kzkaizhao on 2015/12/28.
 */
public class GetUesrIdByUserNameResp extends Response {
    private String userName;
    private String userId;

    public GetUesrIdByUserNameResp(String userName, String userId) {
        super(ResponseId.GetUesrIdByUserNameResp_Id);
        this.userName = userName;
        this.userId = userId;
    }

    public GetUesrIdByUserNameResp(Integer bSuccess, String errorMessage) {
        super(ResponseId.GetUesrIdByUserNameResp_Id, bSuccess, errorMessage);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
