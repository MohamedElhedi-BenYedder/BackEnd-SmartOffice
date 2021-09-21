package tn.smartoffice.backend.controller.ConnectedObject;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import tn.smartoffice.backend.model.ConnectedObject.AirConditioner;
import tn.smartoffice.backend.service.ConnectedObject.AirConditionerService;
import tn.smartoffice.backend.service.ConnectedObject.AirConditionerServiceImpl;

import java.util.List;
@RestController
public class AirConditionerControllerImpl implements AirConditionerController  {
    @Autowired
    private AirConditionerServiceImpl airConditionService;
    @Override
    public AirConditioner create(AirConditioner airConditioner) {
        return airConditionService.create(airConditioner);
    }

    @Override
    public AirConditioner getById(int id) {
        return airConditionService.getById(id);
    }

    @Override
    public List<AirConditioner> getAll() {
        return airConditionService.getAll();
    }

    @Override
    public void deleteById(int id) {
        airConditionService.deleteById(id);

    }

    @Override
    public AirConditioner update(AirConditioner airConditioner) {
        return airConditionService.update(airConditioner);
    }
}

