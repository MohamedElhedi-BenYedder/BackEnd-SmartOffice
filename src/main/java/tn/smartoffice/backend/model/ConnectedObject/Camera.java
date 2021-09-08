package tn.smartoffice.backend.model.ConnectedObject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tn.smartoffice.backend.model.SubSite.SubSite;


public class Camera  extends ConnectedObject{
    public Camera()
    {
        super("Camera");

    }

    public Camera(int connectedObjectId, String ipAddress, boolean connected, SubSite locatedAt) {
        super("Camera",connectedObjectId , ipAddress, connected, locatedAt);
    }

}