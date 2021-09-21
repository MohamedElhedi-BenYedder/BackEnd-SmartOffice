package tn.smartoffice.backend.repository.ConnectedObject;

import org.springframework.data.mongodb.repository.MongoRepository;
import tn.smartoffice.backend.model.ConnectedObject.Camera;

public interface CameraRepository extends MongoRepository< Camera,Integer> {
}
