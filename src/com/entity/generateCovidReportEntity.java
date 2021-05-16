
package com.entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;



public class generateCovidReportEntity {
    String report;
    String positive,population;
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
    Date date = new Date();  


    public generateCovidReportEntity() {
    }
    
    public int getcluster(String location){
        
        Connection connection;
        PreparedStatement st;
        int clusternum = 0;
    
        try{
            connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/login",
                    "root", "");

            //retrieve the name of the business of those in specific location cluster
            st = (PreparedStatement) connection
                    .prepareStatement("SELECT business_name FROM biz_login WHERE location =?");

            st.setString(1, location);
            ResultSet rs = st.executeQuery();
                while(rs.next()==true) {
                    String bizName = rs.getString(1);
                    System.out.println(bizName);

                    //Retrieve list of users who visited business
                    PreparedStatement st2 = (PreparedStatement) connection
                            .prepareStatement("SELECT DISTINCT username FROM check_in_history WHERE business_name=?");

                    st2.setString(1, bizName);
                    ResultSet rs2 = st2.executeQuery();


                    while(rs2.next()==true) {
                        String cust_username = rs2.getString(1);
                        System.out.println(cust_username);
                    
                        //Check whether user is positive for Covid-19
                        PreparedStatement st3 = (PreparedStatement) connection
                                .prepareStatement("SELECT covid_status FROM public_login WHERE username=?");

                        st3.setString(1, cust_username);
                        ResultSet rs3 = st3.executeQuery();

                        if (rs3.next())
                        {
                            String covid = rs3.getString(1);
                            System.out.println(covid);

                            //Count total number of positive cases in specific location
                            if (covid.equals("Positive"))
                            {
                                clusternum++;
                            }
                        }
                    }
                 }
   
            }catch(SQLException sqlException){
                sqlException.printStackTrace();

            }
            return clusternum;
        
        }
    
    public String getReport()
    {
        try {

                Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/login",
                        "root", "");

                PreparedStatement st = (PreparedStatement) connection
                        .prepareStatement("SELECT COUNT(username) FROM public_login WHERE covid_status =?");

                st.setString(1,"Positive");
                ResultSet rs = st.executeQuery();
                
                if(rs.next())
                {
                    System.out.println(rs.getString(1));
                    positive = rs.getString(1);
                }
                
                st = (PreparedStatement) connection
                        .prepareStatement("SELECT COUNT(username) FROM public_login ");
                
                rs = st.executeQuery();
                
                if(rs.next())
                {
                    System.out.println(rs.getString(1));
                    population = rs.getString(1);
                }
                
                report = "*************************************\n"
                        +"COVID-19 REPORTED CASES\n"
                        +"*************************************\n"
                        +"Current Date Time: "+formatter.format(date)+"\n"
                        +"Population: "+population+"\n"
                        +"Positive Cases: "+positive+"\n"

                        +"Number of visits made by Patients to each cluster\n"

                        +"North Cases: "+getcluster("north")+"\n"
                        +"South Cases: "+getcluster("south")+"\n"
                        +"East Cases: "+getcluster("east")+"\n"
                        +"West Cases: "+getcluster("west")+"\n"
                        +"Central Cases: "+getcluster("central")+"\n";
            } 
        catch (SQLException sqlException) {
                sqlException.printStackTrace();
                }
        
        
        return report;
    }
    
}
