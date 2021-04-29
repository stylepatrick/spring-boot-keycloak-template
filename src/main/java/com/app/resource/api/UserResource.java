package com.app.resource.api;

import com.app.user.User;
import com.app.user.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;

@ApiRestController
@AllArgsConstructor
public class UserResource {

    private final UserService userService;

    @GetMapping("user")
    public User getUser() {
        return userService.getCurrentUser();
    }

}
