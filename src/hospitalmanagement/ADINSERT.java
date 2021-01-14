/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagement;

import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.JOptionPane;


public class ADINSERT extends javax.swing.JFrame {

    public ADINSERT() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gendergroup = new javax.swing.ButtonGroup();
        martialgroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        SSN = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        date = new javax.swing.JComboBox<>();
        month = new javax.swing.JComboBox<>();
        year = new javax.swing.JComboBox<>();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        mobileno = new javax.swing.JTextField();
        mobilenovalidation = new javax.swing.JLabel();
        other = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        bloodgroup = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        dept = new javax.swing.JComboBox<>();
        age = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        married = new javax.swing.JRadioButton();
        unmarried = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        experience = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        jLabel15 = new javax.swing.JLabel();
        adddoctor = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        timing = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Doctor Insert Form");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("Doctor's SSN  :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 74, -1, 43));

        SSN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SSNKeyReleased(evt);
            }
        });
        jPanel1.add(SSN, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 77, 151, 35));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 255));
        jLabel2.setText("First Name  :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 135, 171, 25));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 255));
        jLabel3.setText("Date Of Birth  :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 187, -1, 25));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 255));
        jLabel4.setText("Gender  :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 244, 171, 25));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 255));
        jLabel5.setText("Age  :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 314, 171, 25));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 255));
        jLabel6.setText("Moblie No  :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 376, 171, 25));
        jPanel1.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 130, 151, 33));

        date.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        date.setAutoscrolls(true);
        jPanel1.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 190, -1, -1));

        month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        jPanel1.add(month, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 190, -1, -1));

        year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020" }));
        year.setAutoscrolls(true);
        jPanel1.add(year, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, -1, -1));

        gendergroup.add(male);
        male.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        male.setForeground(new java.awt.Color(0, 51, 255));
        male.setText("Male");
        jPanel1.add(male, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 241, -1, -1));

        gendergroup.add(female);
        female.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        female.setForeground(new java.awt.Color(0, 51, 255));
        female.setText("Female");
        female.setToolTipText("");
        female.setAutoscrolls(true);
        female.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(female, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 241, -1, -1));

        mobileno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mobilenoKeyPressed(evt);
            }
        });
        jPanel1.add(mobileno, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 373, 135, 30));

        mobilenovalidation.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        mobilenovalidation.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(mobilenovalidation, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 410, 135, 13));

        gendergroup.add(other);
        other.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        other.setForeground(new java.awt.Color(0, 51, 255));
        other.setText("Other");
        jPanel1.add(other, new org.netbeans.lib.awtextra.AbsoluteConstraints(419, 241, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 255));
        jLabel7.setText(" Last Name  :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(547, 135, 127, 25));
        jPanel1.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 130, 242, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 255));
        jLabel8.setText("Blood Group  :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(547, 187, -1, 25));

        bloodgroup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "O+ve", "A+ve", "B+ve", "AB+ve", "O-ve", "A-ve", "B-ve", "AB-ve" }));
        bloodgroup.setAutoscrolls(true);
        jPanel1.add(bloodgroup, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 190, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 255));
        jLabel9.setText("Department  :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(547, 244, 127, 25));

        dept.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "ALLERGY & IMMUNOLOGY", "ANESTHESIOLOGY", "DERMATOLOGY", "DIAGNOSTIC RADIOLOGY", "EMERGENCY MEDICINE", "NEUROLOGY", "OBSTETRICS AND GYNECOLOGY", "PEDIATRICS", "PSYCHIATRY", "UROLOGY", " " }));
        jPanel1.add(dept, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 247, 242, -1));

        age.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ageKeyPressed(evt);
            }
        });
        jPanel1.add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 313, 135, 31));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 255));
        jLabel10.setText("Maritial Status  :");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(547, 314, -1, 25));

        martialgroup.add(married);
        married.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        married.setForeground(new java.awt.Color(0, 51, 255));
        married.setText("Married");
        jPanel1.add(married, new org.netbeans.lib.awtextra.AbsoluteConstraints(718, 311, -1, -1));

        martialgroup.add(unmarried);
        unmarried.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        unmarried.setForeground(new java.awt.Color(0, 51, 255));
        unmarried.setText("Unmarried");
        jPanel1.add(unmarried, new org.netbeans.lib.awtextra.AbsoluteConstraints(817, 311, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 51, 255));
        jLabel11.setText("Address  :");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 436, 171, 25));
        jPanel1.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 440, 695, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 255));
        jLabel12.setText("Experience  :");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(547, 371, 127, 30));
        jPanel1.add(experience, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 371, 242, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 51, 255));
        jLabel13.setText("Username  :");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 492, 171, 25));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 51, 255));
        jLabel14.setText("Password  :");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 490, 133, 25));

        username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                usernameKeyReleased(evt);
            }
        });
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 495, 135, 30));
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(692, 487, 236, 30));

        jLabel15.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 51, 204));
        jLabel15.setText("                  Add Doctor");
        jLabel15.setAutoscrolls(true);
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 7, 483, 52));

        adddoctor.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        adddoctor.setText("Add Doctor");
        adddoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adddoctorActionPerformed(evt);
            }
        });
        jPanel1.add(adddoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(416, 577, -1, -1));

        clear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel1.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(636, 577, -1, -1));

        back.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 20, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 51, 255));
        jLabel16.setText("Visit Timinig  :");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 535, 171, 29));

        timing.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "09.00 AM", "11.00 AM", "01.00 PM", "03.00 PM", "05.00 PM", "08.00 PM" }));
        jPanel1.add(timing, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 540, 135, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 976, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mobilenoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mobilenoKeyPressed
        String phone = mobileno.getText();
        int len = phone.length();
        char c = evt.getKeyChar();
        if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9')
        {
        if(len<10){
        mobileno.setEditable(true);
        }
        else{
        mobileno.setEditable(false);
        }
        }
         else{
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                mobileno.setEditable(true);
            }
            else{
                mobileno.setEditable(false);
            }
        }
    }//GEN-LAST:event_mobilenoKeyPressed

    private void ageKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ageKeyPressed
        String a = age.getText();
        int length = a.length();
        char c = evt.getKeyChar();
        if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9'){
            if(length<3){
                age.setEditable(true);
            }
            else{
                age.setEditable(false);
            }
        }
        else{
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                age.setEditable(true);
            }
            else{
                age.setEditable(false);
            }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_ageKeyPressed

    private void adddoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adddoctorActionPerformed
            
            try{
                CONNECTION con = new CONNECTION();       
                String sql = "insert into doctor(SSN,fname,lname,dob,bloodgroup,gender,dept,age,maritialstatus,mobileno,experience,address,username,password,timing) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement st = con.c.prepareStatement(sql);
                int ssn = Integer.parseInt(SSN.getText());
                String first = fname.getText();
                String last = lname.getText();
                String date1 =(String)date.getSelectedItem();
                String month1 = (String)month.getSelectedItem();
                String year1 = (String)year.getSelectedItem();
                String birthdate = year1+"/"+month1+"/"+date1;
                String blood = (String)bloodgroup.getSelectedItem();
                String vtiming = (String)timing.getSelectedItem();
                String gen;
                if(female.isSelected()){
                    gen = "Female";
                }
                else if (other.isSelected()){
                    gen = "Other";
                }
                else{
                    gen = "Male";
                }
                String dep = dept.getSelectedItem().toString();
                int ag = Integer.parseInt(age.getText());
                String mstatus;
                if(married.isSelected()){
                    mstatus = "Married";
                }
                else{
                    mstatus = "Unmarried";
                }
                String mobno = mobileno.getText();
                int exp = Integer.parseInt(experience.getText());
                String add = address.getText();
                String user = username.getText();
                String pass = password.getText();
                st.setInt(1, ssn);
                st.setString(2,first);
                st.setString(3,last);
                st.setString(4,birthdate);
                st.setString(5,blood);
                st.setString(6,gen);
                st.setString(7,dep);
                st.setInt(8,ag);
                st.setString(9,mstatus);
                st.setString(10,mobno);
                st.setInt(11,exp);
                st.setString(12,add );
                st.setString(13,user);
                st.setString(14,pass);
                st.setString(15,vtiming);
                int i = st.executeUpdate();
		if (i > 0){
                    JOptionPane.showMessageDialog(null, "Doctor Details Successfully Created");
                }
                else {
                    JOptionPane.showMessageDialog(null,"Failed try again");
                }
            SSN.setText("");
            fname.setText("");
            lname.setText("");
            date.setSelectedIndex(0);
            month.setSelectedIndex(0);
            year.setSelectedIndex(0);
            martialgroup.clearSelection();
            gendergroup.clearSelection();
            bloodgroup.setSelectedIndex(0);
            dept.setSelectedIndex(0);
            age.setText("");
            mobileno.setText("");
            address.setText("");
            experience.setText("");
            username.setText("");
            password.setText("");
            timing.setSelectedIndex(0);              
            }
     catch(Exception e){
             System.out.println(e);
        }
    }//GEN-LAST:event_adddoctorActionPerformed
    
    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
            SSN.setText("");
            fname.setText("");
            lname.setText("");
            date.setSelectedIndex(0);
            month.setSelectedIndex(0);
            year.setSelectedIndex(0);
            martialgroup.clearSelection();
            gendergroup.clearSelection();
            bloodgroup.setSelectedIndex(0);
            dept.setSelectedIndex(0);
            age.setText("");
            mobileno.setText("");
            address.setText("");
            experience.setText("");
            username.setText("");
            password.setText("");
            timing.setSelectedIndex(0);
            // TODO add your handling code here:
    }//GEN-LAST:event_clearActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        new ADDOCTOR().setVisible(true);
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_backActionPerformed

    private void SSNKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SSNKeyReleased
        int ssn = Integer.parseInt(SSN.getText());
        int f = 0;
        try{
            CONNECTION con = new CONNECTION();
            String sql = "Select SSN from doctor";
            PreparedStatement st = con.c.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                if(ssn == rs.getInt("SSN"))
                {
                    f++;
                }
            }
            if(f == 1){
                JOptionPane.showMessageDialog(null,"Doctor SSN already exists !");
                SSN.setText("");
            }
        }
        catch(Exception e){
            System.out.println("e");
        }
    }//GEN-LAST:event_SSNKeyReleased

    private void usernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameKeyReleased
        String user = username.getText();
        int f = 0;
        try{
            CONNECTION con = new CONNECTION();
            String sql = "Select username from doctor";
            PreparedStatement st = con.c.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                if(rs.getString("username").equals(user)){
                    f++;
                }
            }
            if(f == 1){
                JOptionPane.showMessageDialog(null,"Username already exists try another username !");
                username.setText("");
            }
        }
        catch(Exception e){
            System.out.println("e");
        }
    }//GEN-LAST:event_usernameKeyReleased

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ADINSERT().setVisible(true);
}
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField SSN;
    private javax.swing.JButton adddoctor;
    private javax.swing.JTextField address;
    private javax.swing.JTextField age;
    private javax.swing.JButton back;
    private javax.swing.JComboBox<String> bloodgroup;
    private javax.swing.JButton clear;
    private javax.swing.JComboBox<String> date;
    private javax.swing.JComboBox<String> dept;
    private javax.swing.JTextField experience;
    private javax.swing.JRadioButton female;
    private javax.swing.JTextField fname;
    private javax.swing.ButtonGroup gendergroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lname;
    private javax.swing.JRadioButton male;
    private javax.swing.JRadioButton married;
    private javax.swing.ButtonGroup martialgroup;
    private javax.swing.JTextField mobileno;
    private javax.swing.JLabel mobilenovalidation;
    private javax.swing.JComboBox<String> month;
    private javax.swing.JRadioButton other;
    private javax.swing.JPasswordField password;
    private javax.swing.JComboBox<String> timing;
    private javax.swing.JRadioButton unmarried;
    private javax.swing.JTextField username;
    private javax.swing.JComboBox<String> year;
    // End of variables declaration//GEN-END:variables
}
