/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import javax.swing.JOptionPane;

public class CheckInEntity {

    public boolean updateCheckInStatus(String username, String business_name) {
        try {

            Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/login",
                    "root", "");

            PreparedStatement st = connection
                    .prepareStatement("INSERT INTO check_in_history(username, business_name) VALUES (?, ?)");

            st.setString(1, username);
            st.setString(2, business_name);
            int j = st.executeUpdate();

            if (j == 1) {
                JOptionPane.showMessageDialog(null, "You have successfully checked in");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Failed to check in ", "Update Failed",
                        JOptionPane.ERROR_MESSAGE);

                return false;
            }

        } catch (SQLException sqlException) {
            sqlException.printStackTrace();

        }
        return false;
    }

}
