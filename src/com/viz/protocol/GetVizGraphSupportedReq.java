package com.viz.protocol;

import com.vc.vizcore.frontend.FunctionedAttributeId;

import java.util.Vector;

/**
 * Created by Kai on 2015/12/13.
 */
public class GetVizGraphSupportedReq extends Request {
    private String userId;
    private String dataSourceId;
    private String dataSetId;
    private Vector<FunctionedAttributeId> columnAttributeIds = new Vector<FunctionedAttributeId>();
    private Vector<FunctionedAttributeId> rowAttributeIds = new Vector<FunctionedAttributeId>();

    public GetVizGraphSupportedReq(String userId, String dataSourceId, String dataSetId, Vector<FunctionedAttributeId> columnAttributeIds, Vector<FunctionedAttributeId> rowAttributeIds) {
        super(RequestId.GetVizGraphSupportedReq_Id);
        this.userId = userId;
        this.dataSourceId = dataSourceId;
        this.dataSetId = dataSetId;
        this.columnAttributeIds = columnAttributeIds;
        this.rowAttributeIds = rowAttributeIds;
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

    public Vector<FunctionedAttributeId> getColumnAttributeIds() {
        return columnAttributeIds;
    }

    public void setColumnAttributeIds(Vector<FunctionedAttributeId> columnAttributeIds) {
        this.columnAttributeIds = columnAttributeIds;
    }

    public Vector<FunctionedAttributeId> getRowAttributeIds() {
        return rowAttributeIds;
    }

    public void setRowAttributeIds(Vector<FunctionedAttributeId> rowAttributeIds) {
        this.rowAttributeIds = rowAttributeIds;
    }
}
