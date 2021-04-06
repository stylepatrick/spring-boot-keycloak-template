package com.app.resource.api;

import com.app.user.User;
import com.app.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@ApiRestController
public class UserResource {

    @Autowired
    UserService userService;

    @GetMapping("user")
    public User getUser() {
        return userService.getCurrentUser();
    }

}
