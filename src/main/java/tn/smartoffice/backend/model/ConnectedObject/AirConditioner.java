package tn.smartoffice.backend.model.ConnectedObject;

import lombok.Data;
import tn.smartoffice.backend.model.SubSite.SubSite;
@Data
public class AirConditioner extends ConnectedObject{

    private boolean on ;
    private int conditioningLevel;
    public AirConditioner()
    {
        super("AirConditioner");
    }

    public AirConditioner(int connectedObjectId,String ipAddress, boolean Connected, SubSite locatedAt, boolean on, int conditioningLevel) {
        super("AirConditioner",connectedObjectId, ipAddress, Connected, locatedAt);
        this.on = on;
        this.conditioningLevel = conditioningLevel;
    }
}