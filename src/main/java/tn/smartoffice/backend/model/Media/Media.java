package tn.smartoffice.backend.model.Media;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document(collection = "Media")
@TypeAlias("Media")
public abstract class Media {
    @Id
    private String mediaId;
    private String extension;
    private String title;
    private Date creationDate;
    private String src;

}
