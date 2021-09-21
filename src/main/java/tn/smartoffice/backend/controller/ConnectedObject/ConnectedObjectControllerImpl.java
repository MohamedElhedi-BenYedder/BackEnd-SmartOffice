package tn.smartoffice.backend.controller.ConnectedObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import tn.smartoffice.backend.model.ConnectedObject.ConnectedObject;

import java.util.List;

@RestController
public class ConnectedObjectControllerImpl implements ConnectedObjectController {
    @Override
    public List<ConnectedObject> getAll() {
        return null;
    }
    //@Autowired

}
