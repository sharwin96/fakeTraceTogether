package com.controller;

import com.entity.UpdateVaccApptEntity;

public class UpdateVaccApptController {
    private UpdateVaccApptEntity updateVaccApptEntity;
    
    public UpdateVaccApptController() {
        updateVaccApptEntity = new UpdateVaccApptEntity();
        
    }
    
    public boolean updateVaccApptInEntity(String username, String vaccAppt) {
        return updateVaccApptEntity.updateVaccAppt(username, vaccAppt);
    }
}
