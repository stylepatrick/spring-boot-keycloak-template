package com.app;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter(AccessLevel.PROTECTED)
public class AppConfig {

    @Value("${app.version}")
    private String version;

    @Value("${app.environment}")
    private String environment;

    @Value("${keycloak.realm}")
    private String realm;

    @Value("${keycloak.auth-server-url}")
    private String url;

    @Value("${keycloak.resource}")
    private String clientId;

}
