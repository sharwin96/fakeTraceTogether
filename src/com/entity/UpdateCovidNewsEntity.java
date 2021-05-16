package com.entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UpdateCovidNewsEntity {

    public void updateNews(String news) {
        try {
            Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/login",
                    "root", "");
            PreparedStatement st4 = (PreparedStatement) connection
                    .prepareStatement("UPDATE covid_alert SET news=?");

            st4.setString(1, news);
            int j = st4.executeUpdate();

            if (j == 1) {
                JOptionPane.showMessageDialog(null, "You have successfully updated the Covid news");
            } else {
                JOptionPane.showMessageDialog(null, "Failed to update Covid news", "Update Failed",
                        JOptionPane.ERROR_MESSAGE);

            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
}
