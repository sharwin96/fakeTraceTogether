package com.controller;

import com.entity.BusinessCheckInHistoryEntity;

public class BusinessCheckInHistoryController {

    String username;
    String result;
    BusinessCheckInHistoryEntity businessCheckInHistoryEntity;

    public BusinessCheckInHistoryController(String username) {
        this.username = username;
    }

    public String viewHistory() {
        businessCheckInHistoryEntity = new BusinessCheckInHistoryEntity(username);
        return businessCheckInHistoryEntity.viewHistory();
    }

}
