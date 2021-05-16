package com.entity;

import com.controller.OrganisationLoginController;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class OrganisationLoginEntity extends LoginEntity {
    public OrganisationLoginEntity() {
        super();
    }

    public boolean getUserLogin(String username, String password) {
        boolean result = false;
        try {

            PreparedStatement st = (PreparedStatement) connection
                    .prepareStatement("SELECT username,password FROM organisation_login WHERE username =? AND password =? ");

            st.setString(1, username);
            st.setString(2, password);
            ResultSet rs = st.executeQuery();
            OrganisationLoginController oLC = new OrganisationLoginController();
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

