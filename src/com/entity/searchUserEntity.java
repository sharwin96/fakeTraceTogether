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

public class searchUserEntity {
    String account;
    String username;
    ArrayList userDetails = new ArrayList<String>();

    public searchUserEntity(String account, String username) {
        this.account = account;
        this.username = username;
    }
    
    public ArrayList<String> getUser()
    {
        if(account.equals("Public"))
        {
            
            userDetails.add(" ");
            
            try {

                Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/login",
                        "root", "");

                PreparedStatement st = (PreparedStatement) connection
                        .prepareStatement("SELECT * FROM public_login WHERE username =?");

                st.setString(1,username);
                ResultSet rs = st.executeQuery();
                
                if(rs.next())
                {
                   for(int i = 1; i <=12 ;i++)
                   {
                        userDetails.add(rs.getString(i));
                        //System.out.println(rs.getString(i));
                        System.out.println(userDetails.get(i));
                        
                   }
                   //System.out.println(publicUser.length);
                }
                

            } catch (SQLException sqlException) {
                sqlException.printStackTrace();
                JOptionPane.showMessageDialog(null, "Failed to display account details", "Error",
                        JOptionPane.ERROR_MESSAGE);

            }
        }
        if(account.equals("Business"))
        {
            userDetails.add(" ");
            
            try {

                Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/login",
                        "root", "");

                PreparedStatement st = (PreparedStatement) connection
                        .prepareStatement("SELECT * FROM biz_login WHERE username =?");

                st.setString(1,username);
                ResultSet rs = st.executeQuery();
                
                if(rs.next())
                {
                   for(int i = 1; i <=5 ;i++)
                   {
                        userDetails.add(rs.getString(i));
                        //System.out.println(rs.getString(i));
                        System.out.println(userDetails.get(i));
                        
                   }
                   //System.out.println(publicUser.length);
                }
               

            } catch (SQLException sqlException) {
                sqlException.printStackTrace();
                JOptionPane.showMessageDialog(null, "Failed to display account details", "Error",
                        JOptionPane.ERROR_MESSAGE);

            }
        }
        if(account.equals("Health Staff"))
        {
            
            userDetails.add(" ");
            
            try {

                Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/login",
                        "root", "");

                PreparedStatement st = (PreparedStatement) connection
                        .prepareStatement("SELECT * FROM healthstaff_login WHERE username =?");

                st.setString(1,username);
                ResultSet rs = st.executeQuery();
                
                if(rs.next())
                {
                   for(int i = 1; i <=6 ;i++)
                   {
                        userDetails.add(rs.getString(i));
                        //System.out.println(rs.getString(i));
                        System.out.println(userDetails.get(i));
                        
                   }
                   //System.out.println(publicUser.length);
                }
                
            } catch (SQLException sqlException) {
                sqlException.printStackTrace();
                JOptionPane.showMessageDialog(null, "Failed to display account", "Error",
                        JOptionPane.ERROR_MESSAGE);

            }
        }
        
        
        return userDetails;
    }
    
}
