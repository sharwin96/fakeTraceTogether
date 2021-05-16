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
 * newsAlertEntity
 *
 * @author Shaun
 */
public class NewsAlertEntity {

    private String username;
    String apptDate;
    String LINE = "----------------------------------";

    public NewsAlertEntity(String username) {
        this.username = username;
    }

    public String getAppointment(String username) {
        String result = "";
        try {
            Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/login",
                    "root", "");
            PreparedStatement st4 = (PreparedStatement) connection
                    .prepareStatement("SELECT appt_date FROM public_login WHERE username =?");
            st4.setString(1, username);
            ResultSet rs1 = st4.executeQuery();
            result += "\nUpcoming vaccination appointment date: ";
            if (rs1.next()) {
                result += rs1.getString(1);
            }

        } catch (SQLException sqlException) {
            sqlException.printStackTrace();

        }
        return result;
    }

    public String getNews(String username) {
        String result = "";
        try {
            Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/login",
                    "root", "");
            PreparedStatement st3 = (PreparedStatement) connection
                    .prepareStatement("SELECT news, cases FROM covid_alert");
            ResultSet rs = st3.executeQuery();
            if (rs.next()) {
                String news = rs.getString(1);
                String cases = rs.getString(2);
                result += "\n" + "COVID-19 News : " + news + "\n"
                        + "Total Reported COVID-19 cases as of today : "
                        + cases;
            }

        } catch (SQLException sqlException) {
            sqlException.printStackTrace();

        }
        return result;
    }
}
