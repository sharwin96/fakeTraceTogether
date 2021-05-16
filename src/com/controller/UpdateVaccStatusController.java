package com.controller;
import com.entity.UpdateVaccStatusEntity;

public class UpdateVaccStatusController {
    private UpdateVaccStatusEntity updateVaccStatusEntity;
    
    public UpdateVaccStatusController() {
        updateVaccStatusEntity = new UpdateVaccStatusEntity();
        
    }
    
    public boolean updateVaccStatusInEntity(String username, String vaccResult) {
        return updateVaccStatusEntity.updateVaccStatus(username, vaccResult);
    }
}
