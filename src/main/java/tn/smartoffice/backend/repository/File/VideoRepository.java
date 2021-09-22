package tn.smartoffice.backend.repository.File;

import org.springframework.data.mongodb.repository.MongoRepository;
import tn.smartoffice.backend.model.Media.Video;

public interface VideoRepository extends MongoRepository<Video,String> {
}
