package tn.smartoffice.backend.model.Data;

import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import tn.smartoffice.backend.model.ConnectedObject.ConnectedObject;
import tn.smartoffice.backend.model.Person.Employee;

import java.util.Date;

@Document(collection = "Data")
@TypeAlias("BehavioralAnalysis")
public class BehavioralAnalysis extends Data{
    @DBRef
    Employee employee;
    public BehavioralAnalysis()
    {
        super("BehavioralAnalysis");
    }
    public BehavioralAnalysis(ConnectedObject src, Date ReceptionDate) {
        super(src, ReceptionDate,"BehavioralAnalysis");
    }
}
