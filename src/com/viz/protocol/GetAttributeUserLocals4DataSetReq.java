package com.viz.protocol;

/**
 * Created by Kai on 2015/12/13.
 */
public class GetAttributeUserLocals4DataSetReq extends Request{

    private String userId;
    private String dataSourceId;
    private String dataSetId;

    public GetAttributeUserLocals4DataSetReq(String userId, String dataSourceId, String dataSetId) {
        super(RequestId.GetAttributeUserLocals4DataSetReq_Id);
        this.userId = userId;
        this.dataSourceId = dataSourceId;
        this.dataSetId = dataSetId;
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

    public String getDataSetId() {
        return dataSetId;
    }

    public void setDataSetId(String dataSetId) {
        this.dataSetId = dataSetId;
    }
}
