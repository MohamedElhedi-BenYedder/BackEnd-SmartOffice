package tn.smartoffice.backend.controller.Site;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import tn.smartoffice.backend.model.Site;
import tn.smartoffice.backend.service.Site.SiteServiceImpl;

import java.util.List;

@RestController
public class SiteControllerImpl implements SiteController{
    @Autowired
    SiteServiceImpl siteService;
    @Override
    public List<Site> getAll() {
        return siteService.getAll();
    }

    @Override
    public Site getById(int id) {
        return siteService.getById(id);
    }

    @Override
    public Site create(Site site) {
        return siteService.create(site);
    }

    @Override
    public void deleteById(int id) {
        siteService.deleteById(id);
    }
}
