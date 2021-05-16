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

public class BusinessCheckInHistoryEntity {
    String username;
    String bizName ;
    String cust_username = "";
    String datetime = "";
    String business_name = "";
    String LINE = "-------------------------------------------";
    Connection connection;
    PreparedStatement st;
    
    public BusinessCheckInHistoryEntity(String username){
        this.username = username;
    }
    
    public String getUsername()
    {
        return username;
    }
    
    public String viewHistory()
    {
        String str = "";
      
        try {
            connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/login",
                    "root", "");

                //retrieve the name of the business
            st = (PreparedStatement) connection
                    .prepareStatement("SELECT business_name FROM biz_login WHERE username =?");

            st.setString(1, username);
            ResultSet rs = st.executeQuery();
            if(rs.next() == true )
            {
                bizName = rs.getString(1);
                //System.out.println(bizName);
            }
            System.out.println(bizName);

            //retrieve the username of the customers that check in
            PreparedStatement st2 = (PreparedStatement) connection
                    .prepareStatement("SELECT username,datetime FROM check_in_history WHERE business_name=?");

            st2.setString(1, bizName);
            ResultSet rs2 = st2.executeQuery();
            String str_record = "";


            while(rs2.next() == true)
            {
                cust_username = rs2.getString(1);
                datetime = rs2.getString(2);
                str_record = cust_username + " " + datetime;
                System.out.println(str_record);
//                vistors.add(str_record);
//                System.out.println(vistors.size());


                String str1 =  "-----------------------------------\n"
                        +"Customer Username : " + cust_username +"\n"
                        +"Date : " + datetime +"\n"
                        +"----------------------------------"+"\n";
                str = str + str1;
            }
        }
        catch (SQLException sqlException) {
            sqlException.printStackTrace();

        }
        //System.out.println(str);
        return str;    
    

    } 
}
