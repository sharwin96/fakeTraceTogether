package com.controller;

import com.entity.BusinessLoginEntity;

public class BusinessLoginController extends LoginController {

    private BusinessLoginEntity businessLoginEntity;

    public BusinessLoginController() {
        this.businessLoginEntity = new BusinessLoginEntity();
    }

    public boolean login(String username, String password) {
        return businessLoginEntity.getUserLogin(username, password);
    }
}
