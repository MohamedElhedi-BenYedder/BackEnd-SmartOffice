package tn.smartoffice.backend.controller.ConnectedObject;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.smartoffice.backend.model.ConnectedObject.ConnectedObject;

import java.util.List;

@RestController
@RequestMapping("/ConnectedObject")
public interface ConnectedObjectController {
    // get
    public List<ConnectedObject> getAll();

}
