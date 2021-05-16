package com.controller;

import com.entity.CovidAlertEntity;

public class CovidAlertController {

    String username;

    public CovidAlertController() {
    }

    public CovidAlertController(String username) {
        this.username = username;
    }

    public String viewCovidAlert() {
        String str = "";
        CovidAlertEntity cae = new CovidAlertEntity(username);
        str = cae.getCovidAlert();
        return str;
    }

}
