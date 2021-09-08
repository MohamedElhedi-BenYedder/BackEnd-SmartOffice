package tn.smartoffice.backend.model.ConnectedObject;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import tn.smartoffice.backend.model.SubSite.SubSite;

@AllArgsConstructor
@Data
@Document(collection = "ConnectedObject")
@TypeAlias("ConnectedObject")
public abstract class  ConnectedObject {

        private final String category ;
        @Id
        private int connectedObjectId;
        private String ipAddress;
        private boolean Connected;
        @DBRef
        private SubSite locatedAt;
        public ConnectedObject(String category)
        {
                this.category = category;
        }

}
