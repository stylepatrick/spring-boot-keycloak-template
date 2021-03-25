package com.app.user;

import lombok.Getter;

import java.util.Arrays;

@Getter
public enum UserRole {

    VIEW("VIEW"),
    EDIT("EDIT");

    private final String value;

    UserRole(String value) {
        this.value = value;
    }

    public static boolean isValidRole(String s) {
        return Arrays.stream(UserRole.values())
                .anyMatch(r -> r.value.equals(s));
    }

}
