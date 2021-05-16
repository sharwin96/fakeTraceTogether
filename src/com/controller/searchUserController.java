/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.entity.*;
import java.util.ArrayList;


public class searchUserController {
    String acct_type;
    String username;
    ArrayList userStuff = new ArrayList<String>();

    public searchUserController(String acct_type, String username) {
        this.acct_type = acct_type;
        this.username = username;
    }
    
    public ArrayList<String> getUserDetails()
    {
        searchUserEntity sue = new searchUserEntity(acct_type,username);
        //sue.getUser();
        return sue.getUser();
    }
    
}
