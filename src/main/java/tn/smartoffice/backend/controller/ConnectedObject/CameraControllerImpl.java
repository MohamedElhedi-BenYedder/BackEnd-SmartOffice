package tn.smartoffice.backend.controller.ConnectedObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import tn.smartoffice.backend.model.ConnectedObject.Camera;
import tn.smartoffice.backend.service.ConnectedObject.CameraServiceImpl;

import java.util.List;

@RestController
public class CameraControllerImpl implements CameraController{
    @Autowired
    private CameraServiceImpl cameraService;
    @Override
    public Camera create(Camera camera) {
        return cameraService.create(camera);
    }

    @Override
    public Camera getById(int id) {
        return cameraService.getById(id);
    }

    @Override
    public List<Camera> getAll() {
        return cameraService.getAll();
    }

    @Override
    public void deleteById(int id) {
        cameraService.deleteById(id);

    }

    @Override
    public Camera update(Camera camera) {
        return cameraService.update(camera);
    }
}
