package com.entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ViewStatusEntity {

    private String username;

    public ViewStatusEntity() {

    }

    public ViewStatusEntity(String username) {
        this.username = username;
    }

    public String getStatus(String username) {
        String result = "";
        try {
            Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/login",
                    "root", "");

            PreparedStatement st = (PreparedStatement) connection
                    .prepareStatement("SELECT covid_status FROM public_login WHERE username =?");

            st.setString(1, username);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                result = rs.getNString(1);
                return result;
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return result;
    }
}
