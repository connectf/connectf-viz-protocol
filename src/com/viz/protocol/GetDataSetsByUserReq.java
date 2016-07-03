package com.viz.protocol;

/**
 * Created by Kai on 2015/12/13.
 */
public class GetDataSetsByUserReq extends Request{

    private String userId;
    private String dataSourceId;

    public GetDataSetsByUserReq(String userId, String dataSourceId) {
        super(RequestId.GetDataSetsByUserReq_Id);
        this.userId = userId;
        this.dataSourceId = dataSourceId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getDataSourceId() {
        return dataSourceId;
    }

    public void setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
    }
}