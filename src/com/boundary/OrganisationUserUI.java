package com.boundary;


//import Business.BizUserLogin;
//import HealthStaff.HealthStaffUserLogin;
//import Organisation.OrganisationUserLogin;


public class OrganisationUserUI extends javax.swing.JFrame  {
    
    String username;


    public OrganisationUserUI(String username) {
        this.username = username;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        landinePagePanel = new javax.swing.JPanel();
        loginPanel = new javax.swing.JPanel();
        reportedCases = new javax.swing.JButton();
        searchUser = new javax.swing.JButton();
        updateUser = new javax.swing.JButton();
        vaccinatedPeople = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        createUser = new javax.swing.JButton();
        deleteUser = new javax.swing.JButton();
        logoPanel = new javax.swing.JPanel();
        logoLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setName("frame"); // NOI18N

        landinePagePanel.setPreferredSize(new java.awt.Dimension(600, 300));

        reportedCases.setText("Reported Cases Report");
        reportedCases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportedCasesActionPerformed(evt);
            }
        });

        searchUser.setText("Search User");
        searchUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchUserActionPerformed(evt);
            }
        });

        updateUser.setText("Update User");
        updateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateUserActionPerformed(evt);
            }
        });

        vaccinatedPeople.setText("Number of Vaccinated People");
        vaccinatedPeople.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vaccinatedPeopleActionPerformed(evt);
            }
        });

        jButton5.setText("Logout");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        createUser.setText("Create User");
        createUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createUserActionPerformed(evt);
            }
        });

        deleteUser.setText("Delete User");
        deleteUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(createUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(updateUser)
                .addGap(47, 47, 47)
                .addComponent(deleteUser)
                .addGap(75, 75, 75))
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addComponent(reportedCases)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vaccinatedPeople)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchUser)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reportedCases)
                    .addComponent(searchUser)
                    .addComponent(vaccinatedPeople))
                .addGap(10, 10, 10)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createUser)
                    .addComponent(updateUser)
                    .addComponent(deleteUser))
                .addGap(107, 107, 107)
                .addComponent(jButton5)
                .addGap(18, 18, 18))
        );

        logoPanel.setPreferredSize(new java.awt.Dimension(260, 258));

        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fakeTT.jpg"))); // NOI18N

        javax.swing.GroupLayout logoPanelLayout = new javax.swing.GroupLayout(logoPanel);
        logoPanel.setLayout(logoPanelLayout);
        logoPanelLayout.setHorizontalGroup(
            logoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
        );
        logoPanelLayout.setVerticalGroup(
            logoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout landinePagePanelLayout = new javax.swing.GroupLayout(landinePagePanel);
        landinePagePanel.setLayout(landinePagePanelLayout);
        landinePagePanelLayout.setHorizontalGroup(
            landinePagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(landinePagePanelLayout.createSequentialGroup()
                .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE))
        );
        landinePagePanelLayout.setVerticalGroup(
            landinePagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(logoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        getContentPane().add(landinePagePanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchUserActionPerformed
        // TODO add your handling code here:
        
        searchUserUI sUU = new searchUserUI();
        sUU.setVisible(true);
        sUU.pack();
        sUU.setLocationRelativeTo(null);
       
        
//       
//        if(evt.getSource() == searchUser)
//        {
//
//        }
        
        
        
    }//GEN-LAST:event_searchUserActionPerformed

    private void reportedCasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportedCasesActionPerformed
        // TODO add your handling code here:
        generateCovidReportUI gcr = new generateCovidReportUI();
        gcr.setVisible(true);
        gcr.pack();
        gcr.setLocationRelativeTo(null);
    }//GEN-LAST:event_reportedCasesActionPerformed

    private void vaccinatedPeopleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vaccinatedPeopleActionPerformed
        // TODO add your handling code here:
        VaccinatedNumberUI vnc = new VaccinatedNumberUI();
        vnc.setVisible(true);
        vnc.pack();
        vnc.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_vaccinatedPeopleActionPerformed

    private void createUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createUserActionPerformed
        // TODO add your handling code here:
        createUserUI cUU = new createUserUI();
        cUU.setVisible(true);
        cUU.pack();
        cUU.setLocationRelativeTo(null);
    }//GEN-LAST:event_createUserActionPerformed

    private void updateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateUserActionPerformed
        // TODO add your handling code here:
        updateUserUI uuu = new updateUserUI();
        uuu.setVisible(true);
        uuu.pack();
        uuu.setLocationRelativeTo(null);
    }//GEN-LAST:event_updateUserActionPerformed

    private void deleteUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteUserActionPerformed
        // TODO add your handling code here:
        deleteUserUI dUU = new deleteUserUI();
        dUU.setVisible(true);
        dUU.pack();
        dUU.setLocationRelativeTo(null);
    }//GEN-LAST:event_deleteUserActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        LandingPage lp = new LandingPage();
        lp.setVisible(true);
        lp.pack();
        lp.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createUser;
    private javax.swing.JButton deleteUser;
    private javax.swing.JButton jButton5;
    private javax.swing.JPanel landinePagePanel;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JPanel logoPanel;
    private javax.swing.JButton reportedCases;
    private javax.swing.JButton searchUser;
    private javax.swing.JButton updateUser;
    private javax.swing.JButton vaccinatedPeople;
    // End of variables declaration//GEN-END:variables
}
