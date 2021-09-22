package tn.smartoffice.backend.model.Data;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import tn.smartoffice.backend.model.ConnectedObject.AirConditioner;
import tn.smartoffice.backend.model.ConnectedObject.ConnectedObject;

import java.util.Date;

@Document("Data")
@TypeAlias("AirConditionerData")
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
