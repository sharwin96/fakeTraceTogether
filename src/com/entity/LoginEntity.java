package com.entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class LoginEntity {

    private String username;
    private String password;
    Connection connection;

    public LoginEntity() {
        try {
            connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/login",
                    "root", "");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public LoginEntity(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public abstract boolean getUserLogin(String username, String password);
}
