package com.viz.protocol;

import com.vc.vizcore.frontend.VizGraphSupported;

import java.util.Vector;

/**
 * Created by Kai on 2015/12/13.
 */
public class GetVizGraphSupportedResp extends Response {

    private VizGraphSupported vizGraphSupported;

    public GetVizGraphSupportedResp(VizGraphSupported vizGraphSupported) {
        super(ResponseId.GetVizGraphSupportedResp_Id);
        this.vizGraphSupported = vizGraphSupported;
    }

    public GetVizGraphSupportedResp(Integer bSuccess, String errorMessage) {
        super(ResponseId.GetVizGraphSupportedResp_Id, bSuccess, errorMessage);
    }

    public VizGraphSupported getVizGraphSupported() {
        return vizGraphSupported;
    }

    public void setVizGraphSupported(VizGraphSupported vizGraphSupported) {
        this.vizGraphSupported = vizGraphSupported;
    }
}
