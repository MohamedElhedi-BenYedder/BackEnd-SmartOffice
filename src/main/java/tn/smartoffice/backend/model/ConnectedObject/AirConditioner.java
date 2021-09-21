package tn.smartoffice.backend.model.ConnectedObject;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;
import tn.smartoffice.backend.model.SubSite.SubSite;


@Document(collection = "ConnectedObject")
@TypeAlias("AirConditioner")
public class AirConditioner extends ConnectedObject{
    @Setter
    @Getter
    private boolean on ;
    @Setter
    @Getter
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