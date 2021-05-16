package com.entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UpdateVaccApptEntity {
    public boolean updateVaccAppt(String username, String vaccAppt) {
        try {
            Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/login",
                    "root", "");
            PreparedStatement st = connection
                    .prepareStatement("UPDATE public_login SET appt_date=? WHERE username =?");

            st.setString(1, vaccAppt);
            st.setString(2, username);

            int j = st.executeUpdate();

            if (j == 1) {
                JOptionPane.showMessageDialog(null, "You have successfully updated the appointment date and sent an alert to " + username + " !");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Failed to update and send.", "Update Failed",
                        JOptionPane.ERROR_MESSAGE);

                return false;

            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }

        return false;
    }
}
