package tn.smartoffice.backend.service.ConnectedObject;


import tn.smartoffice.backend.model.ConnectedObject.Window;

import java.util.List;

public interface WindowService {
    public Window create(Window window);
    public Window update(Window window);
    public void deleteById(int id);
    public Window getById(int id);
    public List<Window> getAll();

}
