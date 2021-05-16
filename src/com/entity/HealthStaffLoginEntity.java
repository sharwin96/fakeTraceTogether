package com.entity;

import com.controller.HealthStaffLoginController;

import java.sql.*;

public class HealthStaffLoginEntity extends LoginEntity {
    public HealthStaffLoginEntity() {
        super();
    }

    public boolean getUserLogin(String username, String password) {
        boolean result = false;
        try {

            PreparedStatement st = (PreparedStatement) connection
                    .prepareStatement("SELECT username,password FROM healthstaff_login WHERE username =? AND password =? ");

            st.setString(1, username);
            st.setString(2, password);
            ResultSet rs = st.executeQuery();
            HealthStaffLoginController pLC = new HealthStaffLoginController();
            if (rs.next()) {
                result = true;
                return result;
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return result;
    }
}

