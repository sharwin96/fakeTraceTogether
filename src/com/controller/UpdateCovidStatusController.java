package com.controller;

import com.entity.UpdateCovidStatusEntity;


public class UpdateCovidStatusController {
    
    private UpdateCovidStatusEntity updateCovidStatusEntity;
    
    public UpdateCovidStatusController() {
        updateCovidStatusEntity = new UpdateCovidStatusEntity();
    }
    
    public boolean updateCovidStatusInEntity(String username, String covidResult) {
        return updateCovidStatusEntity.updateCovidStatus(username, covidResult);
    }
   
}