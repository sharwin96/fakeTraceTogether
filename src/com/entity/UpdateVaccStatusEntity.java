package com.entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UpdateVaccStatusEntity {
    public boolean updateVaccStatus(String username, String vaccResult) {
        try {
            Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/login",
                    "root", "");
            PreparedStatement st = connection
                    .prepareStatement("UPDATE public_login SET vaccinated=? WHERE username =?");

            st.setString(1, vaccResult);
            st.setString(2, username);

            int j = st.executeUpdate();

            if (j == 1) {
                JOptionPane.showMessageDialog(null, "You have successfully updated the vaccination status of " + username);
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Failed to update vaccination status", "Update Failed",
                        JOptionPane.ERROR_MESSAGE);

                return false;

            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }

        return false;
    }
}
