package tn.smartoffice.backend.model.ConnectedObject;

import lombok.Data;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;
import tn.smartoffice.backend.model.SubSite.SubSite;


@Document(collection = "ConnectedObject")
@TypeAlias("Camera")
public class Camera  extends ConnectedObject{
    public Camera()
    {
        super("Camera");

    }

    public Camera(int connectedObjectId, String ipAddress, boolean connected, SubSite locatedAt) {
        super("Camera",connectedObjectId , ipAddress, connected, locatedAt);
    }

}