package tn.smartoffice.backend.util.roles;

import tn.smartoffice.backend.util.tasks.Task;

public class RAdmin extends Role{
    @Override
    public boolean verifyAuthorization(Task task) {
        return false;
    }
}
