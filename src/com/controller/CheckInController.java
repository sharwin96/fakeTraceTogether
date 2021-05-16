package com.controller;

import com.entity.CheckInEntity;

public class CheckInController {

    CheckInEntity checkInEntity;

    public CheckInController() {
        checkInEntity = new CheckInEntity();
    }

    public boolean checkIn(String username, String business_name) {
        return checkInEntity.updateCheckInStatus(username, business_name);
    }
}
