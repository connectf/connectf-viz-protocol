package com.viz.protocol;

import com.vc.vizcore.frontend.AttributeFilter;
import com.vc.vizcore.frontend.FunctionedAttributeId;

import java.util.Vector;

/**
 * Created by Kai on 2015/12/13.
 */
public class ExecuteReq extends Request{

    private String userId;
    private String dataSourceId;
    private String dataSetId;
    private String vizGraphType;
    private Vector<FunctionedAttributeId> columnAttributeIds = new Vector<FunctionedAttributeId>();
    private Vector<FunctionedAttributeId> rowAttributeIds = new Vector<FunctionedAttributeId>();
    private Vector<AttributeFilter> filters = new Vector<AttributeFilter>();

    public ExecuteReq(String userId, String dataSourceId, String dataSetId, String vizGraphType, Vector<FunctionedAttributeId> columnAttributeIds, Vector<FunctionedAttributeId> rowAttributeIds, Vector<AttributeFilter> filters) {
        super(RequestId.ExecuteReq_Id);
        this.userId = userId;
        this.dataSourceId = dataSourceId;
        this.dataSetId = dataSetId;
        this.vizGraphType = vizGraphType;
        this.columnAttributeIds = columnAttributeIds;
        this.rowAttributeIds = rowAttributeIds;
        this.filters = filters;
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

    public String getVizGraphType() {
        return vizGraphType;
    }

    public void setVizGraphType(String vizGraphType) {
        this.vizGraphType = vizGraphType;
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

    public Vector<AttributeFilter> getFilters() {
        return filters;
    }

    public void setFilters(Vector<AttributeFilter> filters) {
        this.filters = filters;
    }
}
