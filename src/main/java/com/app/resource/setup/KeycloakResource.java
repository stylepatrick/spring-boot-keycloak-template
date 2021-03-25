package com.app.resource.setup;

import com.app.AppConfig;
import org.springframework.web.bind.annotation.GetMapping;

@SetupRestController
public class KeycloakResource {

    private final AppConfig app;

    public KeycloakResource(AppConfig appConfig) {
        this.app = appConfig;
    }

    @GetMapping("/keycloak")
    public KeycloakConfig getConfig() {
        return new KeycloakConfig(
                app.getUrl(),
                app.getClientId(),
                app.getRealm()
        );
    }

}
