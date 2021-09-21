package tn.smartoffice.backend.model.ConnectedObject;

import lombok.*;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;
import tn.smartoffice.backend.model.SubSite.SubSite;


@Document(collection = "ConnectedObject")
@TypeAlias("Window")
public class Window extends ConnectedObject{
    @Setter
    @Getter
    private boolean opened ;
    public Window()
    {
        super("Window");
    }

    public Window(int connectedObjectId, String category, String ipAddress, boolean Connected, SubSite locatedAt, boolean opened) {
        super("Window",connectedObjectId,ipAddress, Connected, locatedAt);
        this.opened = opened;
    }
}
