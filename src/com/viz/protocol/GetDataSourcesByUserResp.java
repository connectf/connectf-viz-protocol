package com.viz.protocol;

import com.vc.vizcore.entity.share.DataSource;

import java.util.Vector;

/**
 * Created by Kai on 2015/12/13.
 */
public class GetDataSourcesByUserResp extends Response{

    private Vector<DataSource> dataSources = new Vector<DataSource>();

    public GetDataSourcesByUserResp(Vector<DataSource> dataSources) {
        super(ResponseId.GetDataSourcesByUserResp_Id);
        this.dataSources = dataSources;
    }

    public GetDataSourcesByUserResp(Integer bSuccess, String errorMessage) {
        super(ResponseId.GetDataSourcesByUserResp_Id, bSuccess, errorMessage);
    }

    public Vector<DataSource> getDataSources() {
        return dataSources;
    }

    public void setDataSources(Vector<DataSource> dataSources) {
        this.dataSources = dataSources;
    }
}
