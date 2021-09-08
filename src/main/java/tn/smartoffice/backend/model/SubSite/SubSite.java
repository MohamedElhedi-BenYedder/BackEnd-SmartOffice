package tn.smartoffice.backend.model.SubSite;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import tn.smartoffice.backend.model.Site;

@Data
@Document(collection = "SubSite")
@TypeAlias("SubSite")
public abstract class SubSite {
    @Id
    private int subSiteId;
    @DBRef
    private Site mainSite;



}
