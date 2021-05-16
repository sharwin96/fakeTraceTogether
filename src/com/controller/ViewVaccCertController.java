package com.controller;

import com.entity.ViewVaccCertEntity;

public class ViewVaccCertController {

    String username;
    ViewVaccCertEntity vVC = new ViewVaccCertEntity(username);

    public ViewVaccCertController(String username) {
        this.username = username;
    }

    public String getCert() {
        String cert = vVC.getCert(username);
        return cert;
    }
}
