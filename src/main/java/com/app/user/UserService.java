package com.app.user;

import org.keycloak.representations.AccessToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    AccessToken accessToken;

    public User getCurrentUser() {
        List<String> roles = accessToken.getRealmAccess().getRoles().stream()
                .filter(UserRole::isValidRole)
                .collect(Collectors.toList());
        return new User(accessToken.getPreferredUsername(), roles);
    }

}
