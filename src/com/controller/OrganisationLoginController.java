
package com.controller;

import com.entity.OrganisationLoginEntity;

public class OrganisationLoginController  extends LoginController {

    private OrganisationLoginEntity organisationLoginEntity;

    public OrganisationLoginController() {
        this.organisationLoginEntity = new OrganisationLoginEntity();
    }

    public boolean login(String username, String password) {
        return organisationLoginEntity.getUserLogin(username, password);
    }

}

