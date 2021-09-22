package tn.smartoffice.backend.service.LogIn;
import tn.smartoffice.backend.model.LogIn.BasicAuth;

interface BasicAuthService
{
    public BasicAuth create(String email , String password);
    public BasicAuth update(String email , String password);
    public boolean login(String email , String password);

}