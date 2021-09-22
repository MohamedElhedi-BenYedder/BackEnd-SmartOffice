package tn.smartoffice.backend.model.Data;

import tn.smartoffice.backend.model.ConnectedObject.ConnectedObject;

import java.util.Date;

public class CameraData extends Data{
    public CameraData(ConnectedObject src, Date ReceptionDate) {
        super(src, ReceptionDate, "CameraData");
    }

    public CameraData() {
        super("CameraData");
    }
}
