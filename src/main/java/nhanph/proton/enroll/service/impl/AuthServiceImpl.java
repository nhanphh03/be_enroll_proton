package nhanph.proton.enroll.service.impl;

import nhanph.proton.enroll.service.AuthService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {
    @Value("${app.auth.token}")
    private String tokenConfig;

    @Override
    public boolean isValidToken(String token) {
        return tokenConfig.equals(token);
    }
}
