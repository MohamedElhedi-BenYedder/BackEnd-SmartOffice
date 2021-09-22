package tn.smartoffice.backend.repository.File;

import org.springframework.data.mongodb.repository.MongoRepository;
import tn.smartoffice.backend.model.Media.Photo;

public interface PhotoRepository extends MongoRepository<Photo,String> {
}
