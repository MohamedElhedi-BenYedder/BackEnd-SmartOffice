package tn.smartoffice.backend.service.LogIn;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tn.smartoffice.backend.model.LogIn.BasicAuth;
import tn.smartoffice.backend.repository.LogIn.BasicAuthRepository;

import java.util.Optional;
@Component
public class BasicAuthServiceImpl implements BasicAuthService
{
@Autowired
private BasicAuthRepository basicAuthRepository;

    @Override
    public BasicAuth create(String email , String password) {
        BasicAuth basicAuth = new BasicAuth(email, password);
        return basicAuthRepository.save(basicAuth);
    }

    @Override
    public BasicAuth update(String email , String password) {
        return null;
    }

    @Override
    public boolean login(String email , String password) {


        String hashMdpIn = BasicAuth.Hash(password);
        Optional<BasicAuth> basicAuthOptional = basicAuthRepository.findById(email);
        if (basicAuthOptional.isPresent())
        {
            BasicAuth basicAuth = basicAuthOptional.get();
            if (hashMdpIn.equals(basicAuth.getHashedPassword()))
            {
                basicAuth.setCurrentToken(BasicAuth.newToken());
                basicAuthRepository.save(basicAuth);
                return true;
            }
            return false ;
        }
        return false;
    }
}