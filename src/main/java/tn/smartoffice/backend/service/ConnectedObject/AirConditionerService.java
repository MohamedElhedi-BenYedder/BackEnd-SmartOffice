package tn.smartoffice.backend.service.ConnectedObject;

import tn.smartoffice.backend.model.ConnectedObject.AirConditioner;

import java.util.List;

public interface AirConditionerService {
    public AirConditioner create(AirConditioner airConditioner);
    public AirConditioner update(AirConditioner airConditioner);
    public void deleteById(int id);
    public AirConditioner getById(int id);
    public List<AirConditioner> getAll();
}
