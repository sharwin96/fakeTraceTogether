package com.entity;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class BusinessLoginEntity extends LoginEntity {

    public BusinessLoginEntity() {
        super();
    }

    public boolean getUserLogin(String username, String password) {
        boolean result = false;
        try {

            PreparedStatement st = (PreparedStatement) connection
                    .prepareStatement("SELECT username,password FROM biz_login WHERE username =? AND password =? ");

            st.setString(1, username);
            st.setString(2, password);
            ResultSet rs = st.executeQuery();
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

