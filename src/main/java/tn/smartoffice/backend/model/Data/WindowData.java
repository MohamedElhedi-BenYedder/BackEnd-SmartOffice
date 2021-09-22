package tn.smartoffice.backend.model.Data;

import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import tn.smartoffice.backend.model.ConnectedObject.ConnectedObject;
import tn.smartoffice.backend.model.ConnectedObject.Window;

import java.util.Date;
@Document(collection = "Data")
@TypeAlias("WindowData")
public class WindowData extends Data{
    @DBRef
    Window window;

    public WindowData(ConnectedObject src, Date ReceptionDate) {
        super(src, ReceptionDate, "WindowData");
    }

    public WindowData() {
        super("WindowData");
    }
}

