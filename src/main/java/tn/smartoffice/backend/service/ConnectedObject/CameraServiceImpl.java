package tn.smartoffice.backend.service.ConnectedObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tn.smartoffice.backend.model.ConnectedObject.Camera;
import tn.smartoffice.backend.repository.ConnectedObject.CameraRepository;

import java.util.List;

@Component
public class CameraServiceImpl implements CameraService {
    @Autowired
    private CameraRepository cameraRepository;
    @Override
    public Camera create(Camera camera) {
        return cameraRepository.save(camera);
    }

    @Override
    public Camera update(Camera camera) {
        return null;
    }

    @Override
    public void deleteById(int id) {
        cameraRepository.deleteById(id);

    }

    @Override
    public Camera getById(int id) {
        return cameraRepository.findById(id).orElse(new Camera());
    }

    @Override
    public List<Camera> getAll() {
        return cameraRepository.findAll();
    }
}
