package tn.smartoffice.backend.controller.ConnectedObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import tn.smartoffice.backend.model.ConnectedObject.Window;
import tn.smartoffice.backend.service.ConnectedObject.WindowServiceImpl;

import java.util.List;

@RestController
public class WindowControllerImpl implements WindowController{
    @Autowired
    private WindowServiceImpl windowService;
    @Override
    public Window create(Window window) {
        return windowService.create(window);
    }

    @Override
    public Window getById(int id) {
        return windowService.getById(id);
    }

    @Override
    public List<Window> getAll() {
        return windowService.getAll();
    }

    @Override
    public void deleteById(int id) {
        windowService.deleteById(id);

    }

    @Override
    public Window update(Window window) {
        return windowService.update(window);
    }
}
