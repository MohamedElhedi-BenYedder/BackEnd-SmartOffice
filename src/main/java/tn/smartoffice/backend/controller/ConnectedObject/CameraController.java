package tn.smartoffice.backend.controller.ConnectedObject;

import org.springframework.web.bind.annotation.*;
import tn.smartoffice.backend.model.ConnectedObject.Camera;

import java.util.List;

@RequestMapping("/Camera")
public interface CameraController {
    // create
    @PostMapping
    public Camera create(@RequestBody Camera camera);
    // get & getAll
    @GetMapping("/{id}")
    public Camera getById(@PathVariable int id);
    @GetMapping()
    public List<Camera> getAll();
    @DeleteMapping("/{id}")
    // delete
    public void deleteById(@PathVariable int id);
    @PatchMapping
    // update
    public Camera update (@RequestBody Camera camera);
}
