
package com.controller;

import com.entity.*;


public class generateCovidReportController {
    String report;

    public generateCovidReportController() {
    }
    
    public String getReport()
    {
        generateCovidReportEntity gcre = new generateCovidReportEntity();
        report = gcre.getReport();
        
        return report;
    }
    
}
