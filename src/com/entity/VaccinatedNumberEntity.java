
package com.entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;


public class VaccinatedNumberEntity {
    String report;
    String vaccinatedAmt,population,pfizer,mordana;
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
    Date date = new Date();  

    public VaccinatedNumberEntity() {
    }
    
    public String getVaccReport()
    {
        try {

                Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/login",
                        "root", "");

                PreparedStatement st = (PreparedStatement) connection
                        .prepareStatement("SELECT COUNT(username) FROM public_login WHERE vaccinated =?");

                st.setString(1,"yes");
                ResultSet rs = st.executeQuery();
                
                if(rs.next())
                {
                    System.out.println(rs.getString(1));
                    vaccinatedAmt = rs.getString(1);
                }
                
                st = (PreparedStatement) connection
                        .prepareStatement("SELECT COUNT(username) FROM public_login WHERE vaccine_type =?");
                st.setString(1, "Mordana");
                rs = st.executeQuery();
                
                if(rs.next())
                {
                    System.out.println(rs.getString(1));
                    mordana = rs.getString(1);
                }
                
                st = (PreparedStatement) connection
                        .prepareStatement("SELECT COUNT(username) FROM public_login WHERE vaccine_type =?");
                st.setString(1, "Pfizer");
                rs = st.executeQuery();
                
                if(rs.next())
                {
                    System.out.println(rs.getString(1));
                    pfizer = rs.getString(1);
                }
                
                
                st = (PreparedStatement) connection
                        .prepareStatement("SELECT COUNT(username) FROM public_login ");
                
                rs = st.executeQuery();
                
                if(rs.next())
                {
                    System.out.println(rs.getString(1));
                    population = rs.getString(1);
                }
                
                
                
                report = "*************************************\n"
                        +"COVID-19 VACCINATION STATUS REPORT\n"
                        +"*************************************\n"
                        +"Current Date Time: "+formatter.format(date)+"\n"
                        +"Population: "+population+"\n"
                        +"Vaccinated Count: "+vaccinatedAmt+"\n"
                        +"Vaccine(Mordana): "+mordana+"\n"
                        +"Vaccine(Pfizer): "+pfizer+"\n"; 
                        
                System.out.println(report);
            } 
        catch (SQLException sqlException) {
            sqlException.printStackTrace();

            }
        return report;
    }
    
}
