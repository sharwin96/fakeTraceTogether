package com.controller;

import com.entity.HealthStaffLoginEntity;

public class HealthStaffLoginController extends LoginController {

    private HealthStaffLoginEntity healthStaffLoginEntity;

    public HealthStaffLoginController() {
        this.healthStaffLoginEntity = new HealthStaffLoginEntity();
    }

    public boolean login(String username, String password) {
        return healthStaffLoginEntity.getUserLogin(username, password);
    }

}
