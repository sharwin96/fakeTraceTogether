package com.controller;

import com.entity.CheckInHistoryEntity;

public class CheckInHistoryController {

    String username;
    CheckInHistoryEntity checkInHistoryEntity;

    public CheckInHistoryController(String username) {
        this.username = username;
    }

    public String viewHistory() {
        checkInHistoryEntity = new CheckInHistoryEntity(username);
        return checkInHistoryEntity.viewHistory();
    }

}
