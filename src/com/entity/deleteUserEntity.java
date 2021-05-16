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

public class deleteUserEntity {
    String account;
    String username;

    public deleteUserEntity(String account, String username) {
        this.account = account;
        this.username = username;
    }
    
    public boolean deleteUser()
    {
       boolean result = false;
        if(account.equals("Public"))
        {
            try {

                Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/login",
                        "root", "");

                PreparedStatement st = (PreparedStatement) connection
                        .prepareStatement("DELETE FROM public_login WHERE username =?");

                st.setString(1,username);
                st.executeUpdate();
                result = true;
                
            } catch (SQLException sqlException) {
                sqlException.printStackTrace();
            }
        }
        if(account.equals("Business"))
        {
            try {

                Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/login",
                        "root", "");

                PreparedStatement st = (PreparedStatement) connection
                        .prepareStatement("DELETE FROM biz_login WHERE username =?");

                st.setString(1,username);
                st.executeUpdate();
                result = true;
                
            } catch (SQLException sqlException) {
                sqlException.printStackTrace();
            }
        }
        if(account.equals("Health Staff"))
        {

            try {

                Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/login",
                        "root", "");

                PreparedStatement st = (PreparedStatement) connection
                        .prepareStatement("DELETE FROM healthstaff_login WHERE username =?");

                st.setString(1,username);
                st.executeUpdate();
                result = true;
                
            } catch (SQLException sqlException) {
                sqlException.printStackTrace();
            }
        } return result;
    }
    
    public boolean searchUser()
    {
        boolean result = false;
         if(account.equals("Public"))
        {
            
            try {

                Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/login",
                        "root", "");

                PreparedStatement st = (PreparedStatement) connection
                        .prepareStatement("SELECT * FROM public_login WHERE username =?");

                st.setString(1,username);
                ResultSet rs = st.executeQuery();
                
                if(rs.next())
                {
                    result = true;
                }
                

            } catch (SQLException sqlException) {
                sqlException.printStackTrace();
            }
        }
        if(account.equals("Business"))
        {
            
            try {

                Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/login",
                        "root", "");

                PreparedStatement st = (PreparedStatement) connection
                        .prepareStatement("SELECT * FROM biz_login WHERE username =?");

                st.setString(1,username);
                ResultSet rs = st.executeQuery();
                
                if(rs.next())
                {
                    result = true;
                }
               

            } catch (SQLException sqlException) {
                sqlException.printStackTrace();
            }
        }
        if(account.equals("Health Staff"))
        {
            
            try {

                Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/login",
                        "root", "");

                PreparedStatement st = (PreparedStatement) connection
                        .prepareStatement("SELECT * FROM healthstaff_login WHERE username =?");

                st.setString(1,username);
                ResultSet rs = st.executeQuery();
                
                if(rs.next())
                {
                    result = true;
                }
                
            } catch (SQLException sqlException) {
                sqlException.printStackTrace();
            }
        } return result;
        
    }
 }


   