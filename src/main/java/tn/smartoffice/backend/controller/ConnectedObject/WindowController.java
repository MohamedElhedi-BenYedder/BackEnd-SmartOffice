package tn.smartoffice.backend.controller.ConnectedObject;

import org.springframework.web.bind.annotation.*;
import tn.smartoffice.backend.model.ConnectedObject.Window;

import java.util.List;
@RequestMapping("/Window")
public interface WindowController {
    // create
    @PostMapping
    public Window create(@RequestBody Window window);
    // get & getAll
    @GetMapping("/{id}")
    public Window getById(@PathVariable int id);
    @GetMapping()
    public List<Window> getAll();
    @DeleteMapping("/{id}")
    // delete
    public void deleteById(@PathVariable int id);
    @PatchMapping
    // update
    public Window update (@RequestBody Window window);

}
