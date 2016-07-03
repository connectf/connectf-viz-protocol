package com.viz.protocol;

import com.vc.vizcore.entity.share.DataCategory;

import java.util.Vector;

/**
 * Created by kzkaizhao on 2016/1/6.
 */
public class GetDataCategoryResp extends Response{
    private Vector<DataCategory> dataCategories = new Vector<DataCategory>();
    public GetDataCategoryResp(Vector<DataCategory> dataCategories) {
        super(ResponseId.GetDataCategoryResp_Id);
        this.dataCategories = dataCategories;
    }

    public GetDataCategoryResp(Integer bSuccess, String errorMessage) {
        super(ResponseId.GetDataCategoryResp_Id, bSuccess, errorMessage);
    }

    public Vector<DataCategory> getDataCategories() {
        return dataCategories;
    }

    public void setDataCategories(Vector<DataCategory> dataCategories) {
        this.dataCategories = dataCategories;
    }
}
