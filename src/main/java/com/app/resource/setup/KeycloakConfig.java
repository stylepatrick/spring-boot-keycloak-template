package com.app.resource.setup;

import lombok.*;

@Getter
@Setter(AccessLevel.PROTECTED)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class KeycloakConfig {

    private String url;
    private String clientId;
    private String realm;

}
