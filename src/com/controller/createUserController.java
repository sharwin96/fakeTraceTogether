/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.entity.*;
import java.util.ArrayList;


public class createUserController {
    String acct_type;
    String username;
    ArrayList userStuff = new ArrayList<String>();

    public createUserController() {
        this.acct_type = acct_type;
        this.username = username;
    }
    
    public boolean createUser(String acct_type, ArrayList<String> array )
    {
        createUserEntity cuE = new createUserEntity();
        cuE.createUser(acct_type,array);
        boolean result = true;
        return true;
    }
    
}
