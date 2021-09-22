package tn.smartoffice.backend.model.Media;

import lombok.Data;
import org.bson.types.Binary;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Media")
@TypeAlias("Photo")
@Data
public class Photo extends Media {
    private Binary image;

}
