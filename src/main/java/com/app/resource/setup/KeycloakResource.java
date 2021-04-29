package com.app.resource.setup;

import com.app.AppConfig;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;

@SetupRestController
@AllArgsConstructor
public class KeycloakResource {

    private final AppConfig app;

    @GetMapping("/keycloak")
    public KeycloakConfig getConfig() {
        return new KeycloakConfig(
                app.getUrl(),
                app.getClientId(),
                app.getRealm()
        );
    }

}
