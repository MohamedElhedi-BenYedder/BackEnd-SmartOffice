package tn.smartoffice.backend.service.Site;

import org.springframework.stereotype.Component;
import tn.smartoffice.backend.model.Site;

import java.util.List;


public interface SiteService {
    // create
    public Site create(Site site);
    // get & getAll
    public Site getById(int id);
    public List<Site> getAll();
    // update
    public Site update(Site site);
    // delete
    public void deleteById(int id);

}
