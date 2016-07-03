package com.viz.protocol;

import com.vc.vizcore.entity.local.AttributeUserLocalProperties;
import com.vc.vizcore.frontend.FunctionedAttributeId;

import java.util.Vector;

/**
 * Created by Kai on 2015/12/13.
 */
public class UpdateAttributeUserLocalByUserReq extends Request{


    private String userId;
    private String dataSourceId;
    private String dataSetId;
    private String attributeId;
    private AttributeUserLocalProperties properties;

    public UpdateAttributeUserLocalByUserReq( String userId, String dataSourceId, String dataSetId, String attributeId, AttributeUserLocalProperties properties) {
        super(RequestId.UpdateAttributeUserLocalByUserReq_Id);
        this.userId = userId;
        this.dataSourceId = dataSourceId;
        this.dataSetId = dataSetId;
        this.attributeId = attributeId;
        this.properties = properties;
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

    public String getAttributeId() {
        return attributeId;
    }

    public void setAttributeId(String attributeId) {
        this.attributeId = attributeId;
    }

    public AttributeUserLocalProperties getProperties() {
        return properties;
    }

    public void setProperties(AttributeUserLocalProperties properties) {
        this.properties = properties;
    }
}
