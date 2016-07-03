package com.viz.protocol;

import com.vc.vizcore.entity.share.DataSet;

import java.util.Vector;

/**
 * Created by Kai on 2015/12/13.
 */
public class GetDataSetsByUserResp extends Response {

    private Vector<DataSet> dataSets = new Vector<DataSet>();


    public GetDataSetsByUserResp(Vector<DataSet> dataSets) {
        super(ResponseId.GetDataSetsByUserResp_Id);
        this.dataSets = dataSets;
    }

    public GetDataSetsByUserResp(Integer bSuccess, String errorMessage) {
        super(ResponseId.GetDataSetsByUserResp_Id, bSuccess, errorMessage);
    }

    public Vector<DataSet> getDataSets() {
        return dataSets;
    }

    public void setDataSets(Vector<DataSet> dataSets) {
        this.dataSets = dataSets;
    }
}
