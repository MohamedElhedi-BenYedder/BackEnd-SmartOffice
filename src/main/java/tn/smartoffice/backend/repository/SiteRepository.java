package tn.smartoffice.backend.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import tn.smartoffice.backend.model.Site;

public interface SiteRepository extends MongoRepository<Site,Integer> {
}
