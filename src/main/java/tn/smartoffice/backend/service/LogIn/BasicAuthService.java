package tn.smartoffice.backend.service.LogIn;

import tn.smartoffice.backend.dto.LogIn.BasicAuthDto;
import tn.smartoffice.backend.model.LogIn.BasicAuth;

interface BasicAuthService
{
    public BasicAuth create(BasicAuthDto basicAuthDto);
    public BasicAuth update(BasicAuthDto basicAuthDto);
    public boolean login(BasicAuthDto basicAuthDto);

}