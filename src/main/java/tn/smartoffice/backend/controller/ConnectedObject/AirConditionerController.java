package tn.smartoffice.backend.controller.ConnectedObject;

import org.springframework.web.bind.annotation.*;
import tn.smartoffice.backend.model.ConnectedObject.AirConditioner;


import java.util.List;

@RequestMapping("/AirConditioner")
public interface AirConditionerController {
    // create
    @PostMapping
    public AirConditioner create(@RequestBody AirConditioner airConditioner);
    // get & getAll
    @GetMapping("/{id}")
    public AirConditioner getById(@PathVariable int id);
    @GetMapping()
    public List<AirConditioner> getAll();
    @DeleteMapping("/{id}")
    // delete
    public void deleteById(@PathVariable int id);
    @PatchMapping
    // update
    public AirConditioner update (@RequestBody AirConditioner airConditioner);


}
