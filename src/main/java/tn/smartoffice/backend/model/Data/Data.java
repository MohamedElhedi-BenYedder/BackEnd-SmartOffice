package tn.smartoffice.backend.model.Data;

import lombok.AllArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;
import tn.smartoffice.backend.model.ConnectedObject.ConnectedObject;

import java.util.Date;

@AllArgsConstructor
@Document(collection = "Data")
@TypeAlias("Data")
@lombok.Data

public abstract class Data {
    private ConnectedObject src;
    private Date ReceptionDate;
    private final String type ;
    public Data(String type){this.type = type;}



}
