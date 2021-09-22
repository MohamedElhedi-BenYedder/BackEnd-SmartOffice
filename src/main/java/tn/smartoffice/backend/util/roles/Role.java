package tn.smartoffice.backend.util.roles;

import tn.smartoffice.backend.util.tasks.Task;

public abstract class Role {
    public abstract boolean verifyAuthorization(Task task);
}
