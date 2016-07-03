package com.viz.protocol;

import com.vc.vizcore.entity.local.AttributeUserLocal;

import java.util.Vector;

/**
 * Created by Kai on 2015/12/13.
 */
public class GetAttributeUserLocals4DataSetResp extends Response{

    private Vector<AttributeUserLocal> attributeUserLocals = new Vector<AttributeUserLocal>();

    public GetAttributeUserLocals4DataSetResp(Vector<AttributeUserLocal> attributeUserLocals) {
        super(ResponseId.GetAttributeUserLocals4DataSetResp_Id);
        this.attributeUserLocals = attributeUserLocals;
    }

    public GetAttributeUserLocals4DataSetResp(Integer bSuccess, String errorMessage) {
        super(ResponseId.GetAttributeUserLocals4DataSetResp_Id, bSuccess, errorMessage);
    }

    public Vector<AttributeUserLocal> getAttributeUserLocals() {
        return attributeUserLocals;
    }

    public void setAttributeUserLocals(Vector<AttributeUserLocal> attributeUserLocals) {
        this.attributeUserLocals = attributeUserLocals;
    }
}
