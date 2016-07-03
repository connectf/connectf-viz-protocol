package com.viz.protocol;

/**
 * Created by Kai on 2015/12/13.
 */
public class UpdateAttributeUserLocalByUserResp extends Response{

    public UpdateAttributeUserLocalByUserResp() {
        super(ResponseId.UpdateAttributeUserLocalByUserResp_Id);
    }

    public UpdateAttributeUserLocalByUserResp(Integer bSuccess, String errorMessage) {
        super(ResponseId.UpdateAttributeUserLocalByUserResp_Id, bSuccess, errorMessage);
    }
}
