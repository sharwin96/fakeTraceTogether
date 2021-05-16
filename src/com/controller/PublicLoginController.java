package com.controller;

import com.entity.PublicLoginEntity;

public class PublicLoginController extends LoginController {

    private PublicLoginEntity publicLoginEntity;

    public PublicLoginController() {
        publicLoginEntity = new PublicLoginEntity();
    }

    public boolean login(String username, String password) {
        return publicLoginEntity.getUserLogin(username, password);
    }

}
