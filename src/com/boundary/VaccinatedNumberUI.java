
package com.boundary;

import com.controller.*;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;




public class VaccinatedNumberUI extends javax.swing.JFrame {

    JFrame frame = new JFrame();
    JPanel reportPanel = new JPanel();
    String vaccinatedAmt,population,pfizer,mordana;
    String report;
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
    Date date = new Date();  
    
    public VaccinatedNumberUI() {
        initComponents();
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // to exit out of the application
        this.setTitle("Check Vaccination Num"); // set title of the frame
        this.setResizable(false); //prevent the window from being resized
        this.setSize(600, 200); // set the X and Y dimension of the window

        //this.getContentPane().setBackground(Color.blue); // change the color of the window background
        this.setLayout(new FlowLayout(FlowLayout.CENTER));  // set the lay out to FlowLayout
        //frame.setVisible(true);
        this.setLocationRelativeTo(null);
        
        
        VaccinatedNumberController vnc = new VaccinatedNumberController();
        report = vnc.getReport();
        
        JTextArea vaccReport = new JTextArea(report,6,25);
        vaccReport.setFont(new Font("Serif", Font.ITALIC, 16));
        vaccReport.setLineWrap(true);
        vaccReport.setWrapStyleWord(true);
        vaccReport.setOpaque(false);
        vaccReport.setEditable(false);
       

        reportPanel.add(vaccReport);

        this.add(reportPanel);
        this.pack();
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
