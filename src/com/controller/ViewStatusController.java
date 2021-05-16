package com.controller;

import com.entity.ViewStatusEntity;

public class ViewStatusController {

    String username;

    public ViewStatusController(String username) {
        this.username = username;
    }

    ViewStatusEntity pUE = new ViewStatusEntity();

    public String getStatus() {
        String status = pUE.getStatus(username);
        return status;
    }
}
