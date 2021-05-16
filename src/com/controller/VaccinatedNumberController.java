
package com.controller;

import com.entity.*;

public class VaccinatedNumberController {
    String report;

    public VaccinatedNumberController() {
    }
    
    public String getReport()
    {
        VaccinatedNumberEntity vne = new VaccinatedNumberEntity();
        report = vne.getVaccReport();
        
        return report;
    }
    
}
