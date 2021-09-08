package tn.smartoffice.backend.controller.Site;

import org.springframework.web.bind.annotation.*;
import tn.smartoffice.backend.model.Site;

import java.util.List;


@RequestMapping("/Site")
public interface SiteController {
    // get & getAll
    @GetMapping
    public List<Site> getAll();
    @GetMapping("/{id}")
    public Site getById(@PathVariable int id);
    // create
    @PostMapping
    public Site create(@RequestBody Site site);
    // delete
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable int id);

}
