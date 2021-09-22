package tn.smartoffice.backend.model.Data;

import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;
import tn.smartoffice.backend.model.ConnectedObject.ConnectedObject;

import java.util.Date;
@Document(collection = "Data")
@TypeAlias("CameraData")
public class CameraData extends Data{
    public CameraData(ConnectedObject src, Date ReceptionDate) {
        super(src, ReceptionDate, "CameraData");
    }

    public CameraData() {
        super("CameraData");
    }
}
