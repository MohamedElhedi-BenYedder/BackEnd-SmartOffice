package tn.smartoffice.backend.util.roles;

import tn.smartoffice.backend.util.tasks.Task;

public class REmp extends Role{
    @Override
    public boolean verifyAuthorization(Task task) {
        return false;
    }
}
