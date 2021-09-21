package tn.smartoffice.backend.controller.LogIn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import tn.smartoffice.backend.dto.LogIn.BasicAuthDto;
import tn.smartoffice.backend.model.LogIn.BasicAuth;
import tn.smartoffice.backend.service.LogIn.BasicAuthServiceImpl;


@RestController
public class BasicAuthControllerImpl implements BasicAuthController{
    @Autowired
    private BasicAuthServiceImpl basicAuthService;
    @Override
    public BasicAuth create(BasicAuthDto basicAuthDto) {
        return basicAuthService.create(basicAuthDto);
    }

    @Override
    public BasicAuth update(BasicAuthDto basicAuthDto) {
        return null;
    }

    @Override
    public boolean login(BasicAuthDto basicAuthDto) {
        return basicAuthService.login(basicAuthDto);
    }
}
