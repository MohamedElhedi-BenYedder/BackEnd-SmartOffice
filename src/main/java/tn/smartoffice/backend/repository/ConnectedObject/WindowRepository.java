package tn.smartoffice.backend.repository.ConnectedObject;

import org.springframework.data.mongodb.repository.MongoRepository;
import tn.smartoffice.backend.model.ConnectedObject.Window;

public interface WindowRepository extends MongoRepository<Window,Integer> {
}
