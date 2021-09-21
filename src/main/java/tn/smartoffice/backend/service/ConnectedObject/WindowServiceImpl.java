package tn.smartoffice.backend.service.ConnectedObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tn.smartoffice.backend.model.ConnectedObject.Window;
import tn.smartoffice.backend.repository.ConnectedObject.WindowRepository;

import java.util.List;
@Component
public class WindowServiceImpl implements WindowService {
    @Autowired
    private WindowRepository windowRepository;
    @Override
    public Window create(Window window) {
        return windowRepository.save(window);
    }

    @Override
    public Window update(Window window) {
        return null;
    }

    @Override
    public void deleteById(int id) {
        windowRepository.deleteById(id);

    }

    @Override
    public Window getById(int id) {
        return windowRepository.findById(id).orElse(new Window());
    }

    @Override
    public List<Window> getAll() {
        return null;
    }
}
