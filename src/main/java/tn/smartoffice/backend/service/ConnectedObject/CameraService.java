package tn.smartoffice.backend.service.ConnectedObject;

import tn.smartoffice.backend.model.ConnectedObject.Camera;
import tn.smartoffice.backend.model.ConnectedObject.Camera;

import java.util.List;

public interface CameraService {
    public Camera create(Camera camera);
    public Camera update(Camera camera);
    public void deleteById(int id);
    public Camera getById(int id);
    public List<Camera> getAll();
}
