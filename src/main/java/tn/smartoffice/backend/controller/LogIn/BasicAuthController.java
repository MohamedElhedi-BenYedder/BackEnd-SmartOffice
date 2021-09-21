package tn.smartoffice.backend.controller.LogIn;

import org.springframework.web.bind.annotation.*;
import tn.smartoffice.backend.dto.LogIn.BasicAuthDto;
import tn.smartoffice.backend.model.ConnectedObject.AirConditioner;
import tn.smartoffice.backend.model.LogIn.BasicAuth;

import java.util.List;

@RequestMapping("/BasicAuth")
public interface BasicAuthController {
    // create
    @PostMapping
    public BasicAuth create(@RequestBody BasicAuthDto basicAuthDto);
    @PatchMapping
    // update
    public BasicAuth update (@RequestBody BasicAuthDto basicAuthDto);
    // get
    @GetMapping
    public boolean login(@RequestBody BasicAuthDto basicAuthDto);
}
