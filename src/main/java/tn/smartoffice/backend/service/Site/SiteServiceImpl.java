package tn.smartoffice.backend.service.Site;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tn.smartoffice.backend.model.Site;
import tn.smartoffice.backend.repository.SiteRepository;

import java.util.List;
@Component
public class SiteServiceImpl implements SiteService{
    @Autowired
    SiteRepository siteRepository;
    @Override
    public Site create(Site site) {
        return siteRepository.save(site);
    }

    @Override
    public Site getById(int id) {
        return siteRepository.findById(id).orElse(new Site());
    }

    @Override
    public List<Site> getAll() {
        return siteRepository.findAll();
    }

    @Override
    public Site update(Site site) {
        return null;
    }

    @Override
    public void deleteById(int id) {
        siteRepository.deleteById(id);
    }

}
