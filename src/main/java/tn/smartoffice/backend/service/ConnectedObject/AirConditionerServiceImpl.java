package tn.smartoffice.backend.service.ConnectedObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tn.smartoffice.backend.model.ConnectedObject.AirConditioner;
import tn.smartoffice.backend.repository.ConnectedObject.AirConditionerRepository;

import java.util.List;
@Component
public class AirConditionerServiceImpl implements AirConditionerService {
    @Autowired
    AirConditionerRepository airConditionerRepository;
    @Override
    public AirConditioner create(AirConditioner airConditioner) {
        return airConditionerRepository.save(airConditioner);
    }

    @Override
    public AirConditioner update(AirConditioner airConditioner) {
        return null;
    }

    @Override
    public void deleteById(int id) {
        airConditionerRepository.deleteById(id);

    }

    @Override
    public AirConditioner getById(int id) {
        return airConditionerRepository.findById(id).orElse(new AirConditioner());
    }

    @Override
    public List<AirConditioner> getAll() {
        return airConditionerRepository.findAll();
    }
}
