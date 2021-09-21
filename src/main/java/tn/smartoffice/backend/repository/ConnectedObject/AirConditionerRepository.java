package tn.smartoffice.backend.repository.ConnectedObject;

import org.springframework.data.mongodb.repository.MongoRepository;
import tn.smartoffice.backend.model.ConnectedObject.AirConditioner;

public interface AirConditionerRepository extends MongoRepository<AirConditioner,Integer> {
}
