package tn.smartoffice.backend.model.Data;

import org.springframework.data.mongodb.core.mapping.DBRef;
import tn.smartoffice.backend.model.ConnectedObject.AirConditioner;
import tn.smartoffice.backend.model.ConnectedObject.ConnectedObject;

import java.util.Date;

public class AirConditionerData extends Data {
    @DBRef
    private AirConditioner airConditioner;

    public AirConditionerData(ConnectedObject src, Date ReceptionDate) {
        super(src, ReceptionDate, "AirConditionData");
    }

    public AirConditionerData() {
        super("AirConditionData");
    }
}
