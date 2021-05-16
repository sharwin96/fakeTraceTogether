/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author flame
 */
public class CheckInHistoryEntity {
    String username;
    String LINE = "-------------------------------------------";
    
     public CheckInHistoryEntity(String username){
        this.username = username;
    }
    public String viewHistory()
    {
              String str = "";
      
    try {

            Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/login",
                    "root", "");

           PreparedStatement st = (PreparedStatement) connection
                    .prepareStatement("SELECT username,datetime,business_name FROM check_in_history WHERE username =?");

            st.setString(1, username);
            ResultSet rs = st.executeQuery();

            while (rs.next() == true) {
                
                String datetime = rs.getString(2);
                String business_name = rs.getString(3);

                String str1 = 
                                    LINE + "\n" +
                                    "Username: "+ username+ "\n" +
                                    "Date and Time: " + datetime + "\n" +
                                    "Location: " + business_name + "\n" +
                                    LINE + "\n"

                           ;
                str = str + str1;
        } 
    }
        catch (SQLException sqlException) {
            sqlException.printStackTrace();

        }return str;    
    

    } 
}
