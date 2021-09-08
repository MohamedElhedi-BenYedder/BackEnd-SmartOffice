package tn.smartoffice.backend.model.ConnectedObject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tn.smartoffice.backend.model.SubSite.SubSite;

@Data
public class Window extends ConnectedObject{

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
