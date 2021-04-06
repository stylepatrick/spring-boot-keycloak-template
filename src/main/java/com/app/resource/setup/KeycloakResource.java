package com.app.resource.setup;

import com.app.AppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@SetupRestController
public class KeycloakResource {

    @Autowired
    AppConfig app;

    @GetMapping("/keycloak")
    public KeycloakConfig getConfig() {
        return new KeycloakConfig(
                app.getUrl(),
                app.getClientId(),
                app.getRealm()
        );
    }

}
