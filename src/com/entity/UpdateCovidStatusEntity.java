package com.entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UpdateCovidStatusEntity {

    public boolean updateCovidStatus(String username, String covidResult) {
        try {
            Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/login",
                    "root", "");
            PreparedStatement st = connection
                    .prepareStatement("UPDATE public_login SET covid_status=? WHERE username =?");

            st.setString(1, covidResult);
            st.setString(2, username);

            int j = st.executeUpdate();

            if (j == 1) {
                JOptionPane.showMessageDialog(null, "You have successfully updated the Covid status of " + username);

                if (covidResult.equals("Positive")) {

                    PreparedStatement st2 = connection
                            .prepareStatement("UPDATE covid_alert SET cases = cases + 1");

                    int i = st2.executeUpdate();

                }
                return true;

            } else {
                JOptionPane.showMessageDialog(null, "Failed to update Covid status", "Update Failed",
                        JOptionPane.ERROR_MESSAGE);

                return false;

            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }

        return false;
    }

}
