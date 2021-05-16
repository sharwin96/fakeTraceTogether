package com.controller;

import com.entity.LoginEntity;

public abstract class LoginController {

    private LoginEntity loginEntity;

    public LoginController() {

    }

    public LoginController(LoginEntity loginEntity) {
        this.loginEntity = loginEntity;
    }

    public abstract boolean login(String username, String password);

}
