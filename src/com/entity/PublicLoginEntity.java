package com.entity;

import java.sql.*;

public class PublicLoginEntity extends LoginEntity {


    public PublicLoginEntity() {
        super();
    }

    public boolean getUserLogin(String username, String password) {
        boolean result = false;
        try {

            PreparedStatement st = (PreparedStatement) connection
                    .prepareStatement("SELECT username,password FROM public_login WHERE username =? AND password =? ");

            st.setString(1, username);
            st.setString(2, password);
            ResultSet rs = st.executeQuery();
//            PublicLoginController pLC = new PublicLoginController();
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

