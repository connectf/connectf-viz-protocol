package com.viz.protocol;

import com.vc.vizcore.frontend.VizResult;

/**
 * Created by Kai on 2015/12/13.
 */
public class ExecuteResp extends Response{

    private VizResult vizResult;

    public ExecuteResp(VizResult vizResult) {
        super(ResponseId.ExecuteResp_Id);
        this.vizResult = vizResult;
    }

    public ExecuteResp(Integer bSuccess, String errorMessage) {
        super(ResponseId.ExecuteResp_Id, bSuccess, errorMessage);
    }

    public VizResult getVizResult() {
        return vizResult;
    }

    public void setVizResult(VizResult vizResult) {
        this.vizResult = vizResult;
    }
}
