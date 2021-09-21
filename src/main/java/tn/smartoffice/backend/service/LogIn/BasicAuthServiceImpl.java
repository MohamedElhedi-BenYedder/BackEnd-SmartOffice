package tn.smartoffice.backend.service.LogIn;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tn.smartoffice.backend.dto.LogIn.BasicAuthDto;
import tn.smartoffice.backend.model.LogIn.BasicAuth;
import tn.smartoffice.backend.repository.LogIn.BasicAuthRepository;

import java.util.Optional;
@Component
public class BasicAuthServiceImpl implements BasicAuthService
{
@Autowired
private BasicAuthRepository basicAuthRepository;

    @Override
    public BasicAuth create(BasicAuthDto basicAuthDto) {
        BasicAuth basicAuth = new BasicAuth(basicAuthDto.getEmail(), basicAuthDto.getPassword());
        return basicAuthRepository.save(basicAuth);
    }

    @Override
    public BasicAuth update(BasicAuthDto basicAuthDto) {
        return null;
    }

    @Override
    public boolean login(BasicAuthDto basicAuthDto) {

        String email = basicAuthDto.getEmail();
        String mdpIn = basicAuthDto.getPassword();
        String hashMdpIn = BasicAuth.Hash(mdpIn);
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