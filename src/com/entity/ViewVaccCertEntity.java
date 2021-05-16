
package com.entity;

import com.controller.ViewVaccCertController;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ViewVaccCertEntity {
    private String username;
    String cert;
    String LINE = "-------------------------------------------"; 
    public ViewVaccCertEntity(){
        
    }
    
    public ViewVaccCertEntity(String username){
        this.username = username;
    }
    
    public String getCert(String username){
        String result = "";
        try {
            Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/login",
                "root", "");

            PreparedStatement st = (PreparedStatement) connection
                .prepareStatement("SELECT username,password,firstname,lastname,email,vaccinated,vaccine_type,cert_number FROM public_login WHERE username =?");

            st.setString(1, username);
            ResultSet rs = st.executeQuery();
            ViewVaccCertController vVC = new ViewVaccCertController(username);
            if (rs.next()) {  
                String firstname = rs.getString(3);
                String lastname = rs.getString(4);
                String email = rs.getString(5);
                String vaccinated = rs.getString(6);
                String vctype = rs.getString(7);
                String certnum = rs.getString(8);

//                    final JPanel panel = new JPanel();
//                    JTextArea textArea = new JTextArea(
//                            LINE + "\n" +
//                                    "VACCINATION CERTIFICATION REPORT\n" +
//                                    LINE + "\n" +
//                                    "Name: " + firstname + " " + lastname + "\n" +
//                                    "Email address: " + email + "\n" +
//                                    "Vaccination Status: " + vaccinated + "\n" +
//                                    "Vaccine Received: " + vctype + "\n" +
//                                    "certificate Number: " + certnum + "\n" +
//                                    LINE,
//
//                           6,
//                           25);
                             cert = LINE + "\n" +
                                    "VACCINATION CERTIFICATION REPORT\n" +
                                    LINE + "\n" +
                                    "Name: " + firstname + " " + lastname + "\n" +
                                    "Email address: " + email + "\n" +
                                    "Vaccination Status: " + vaccinated + "\n" +
                                    "Vaccine Received: " + vctype + "\n" +
                                    "certificate Number: " + certnum + "\n" +
                                    LINE;
               }
            } catch (SQLException sqlException) {
                sqlException.printStackTrace();
            }
        return cert;
    }
    
}
