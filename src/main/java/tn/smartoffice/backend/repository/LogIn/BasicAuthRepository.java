package tn.smartoffice.backend.repository.LogIn;

import org.springframework.data.mongodb.repository.MongoRepository;
import tn.smartoffice.backend.model.LogIn.BasicAuth;
public interface BasicAuthRepository extends MongoRepository<BasicAuth,String>{
    
}
