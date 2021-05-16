/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class updateUserEntity {

    public updateUserEntity() {
    }
    
    public boolean updateUser(String acct_type, ArrayList<String> array)
    {
        boolean result = false;
        if(acct_type.equals("Public"))
        {
            try {


                Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/login",
                        "root", "");

                PreparedStatement st = (PreparedStatement) connection
                        .prepareStatement("UPDATE public_login SET vaccinated=?,password=?,covid_status=?,"
                                + "vaccine_type=?,cert_number=?,appt_date=? WHERE username=? ");

                st.setString(1,array.get(1));
                st.setString(2,array.get(2));
                st.setString(3, array.get(3));
                st.setString(4, array.get(4));
                st.setString(5, array.get(5));
                st.setString(6, array.get(6));
                st.setString(7,array.get(0));
                

                st.executeUpdate();
                result = true;

            } catch (SQLException sqlException) {
                sqlException.printStackTrace();
                
            }
        }
        if(acct_type.equals("Business"))
        {
            try {


                Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/login",
                        "root", "");

                PreparedStatement st = (PreparedStatement) connection
                        .prepareStatement("UPDATE biz_login SET password=?,business_name=?,business_number=?,business_email=?,location=? WHERE username=? ");

                st.setString(1,array.get(1));
                st.setString(2,array.get(2));
                st.setString(3, array.get(3));
                st.setString(4, array.get(4));
                st.setString(5, array.get(5));
                st.setString(6, array.get(0));
                

                st.executeUpdate();
                result = true;

            } catch (SQLException sqlException) {
                sqlException.printStackTrace();
             
            }
        }
        if(acct_type.equals("Health Staff"))
        {
            try {


                Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/login",
                        "root", "");

                PreparedStatement st = (PreparedStatement) connection
                        .prepareStatement("UPDATE healthstaff_login SET username=?,"
                                + "password=?,staff_firstname=?,"
                                + "staff_lastname =?,staff_number =?,"
                                + "staff_email=? WHERE username=?");

                st.setString(1,array.get(0));
                st.setString(2,array.get(1));
                st.setString(3, array.get(2));
                st.setString(4, array.get(3));
                st.setString(5, array.get(4));
                st.setString(6, array.get(5));
                st.setString(7,array.get(0));

                st.executeUpdate();
               

            } catch (SQLException sqlException) {
                sqlException.printStackTrace();
                
            }
        }
        
        
        return result;
    }
    
    
}
