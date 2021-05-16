/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entity;

import java.util.ArrayList;
import com.controller.*;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class createUserEntity {

    public createUserEntity() {
        
    }
    
    public boolean createUser(String acct_type, ArrayList<String> array)
    {
        boolean result = false;
        if(acct_type.equals("Public"))
        {
            
            try {

                Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/login",
                        "root", "");

                PreparedStatement st = (PreparedStatement) connection
                        .prepareStatement("INSERT INTO public_login VALUES(?,?,?,?,?,?,?,?,?,?,?,?) ");

                st.setString(1,array.get(0));
                st.setString(2, array.get(1));
                st.setString(3, array.get(2));
                st.setString(4, array.get(3));
                st.setString(5, array.get(4));
                st.setString(6, array.get(5));
                st.setString(7,"no");
                st.setString(8,array.get(6));
                st.setString(9,"Negative");
                st.setString(10,"N.A");
                st.setString(11,"N.A");
                st.setString(12,"N.A");

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
                         .prepareStatement("INSERT INTO biz_login VALUES(?,?,?,?,?,?) ");

                 st.setString(1,array.get(0));
                 st.setString(2, array.get(1));
                 st.setString(3, array.get(2));
                 st.setString(4, array.get(3));
                 st.setString(5, array.get(4));
                 st.setString(6, array.get(5));

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
                        .prepareStatement("INSERT INTO healthstaff_login VALUES(?,?,?,?,?,?) ");

                st.setString(1,array.get(0));
                st.setString(2, array.get(1));
                st.setString(3, array.get(2));
                st.setString(4, array.get(3));
                st.setString(5, array.get(4));
                st.setString(6, array.get(5));

                st.executeUpdate();
                result = true;

            } catch (SQLException sqlException) {
                sqlException.printStackTrace();
            }
        }
        
        
       return result;
    }
}
