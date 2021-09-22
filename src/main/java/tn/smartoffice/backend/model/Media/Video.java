package tn.smartoffice.backend.model.Media;

import lombok.Data;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.InputStream;

@Document(collection = "Media")
@TypeAlias("Video")
@Data
public class Video extends Media {
    private InputStream stream;
}
