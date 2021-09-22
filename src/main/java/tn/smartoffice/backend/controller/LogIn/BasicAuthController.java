package tn.smartoffice.backend.controller.LogIn;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.smartoffice.backend.model.LogIn.BasicAuth;

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
    @AllArgsConstructor
    @NoArgsConstructor
    @Data
    public class BasicAuthDto {
        private String email;
        private String password;
    }

}
