/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagement;

import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ADSEARCH extends javax.swing.JFrame {
    public final void docadd(){
    try{
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","Jeyakumar28");
    PreparedStatement smt=conn.prepareStatement("Select SSN  from doctor");
    ResultSet rs=smt.executeQuery();
    SSN.addItem("");
    while(rs.next()){
        SSN.addItem(rs.getString("SSN"));        
    }
    }       
    catch(Exception e1){
     System.out.print("patadd"+e1);
    }
    }
    public ADSEARCH() {
        initComponents();
        docadd();
        fname.setEditable(false);
        lname.setEditable(false);
        date.setEditable(false);
        month.setEditable(false);
        year.setEditable(false);
        bloodgroup.setEditable(false);
        dept.setEditable(false);
        age.setEditable(false);
        mobileno.setEditable(false);
        address.setEditable(false);
        experience.setEditable(false);
        username.setEditable(false);
        timing.setEditable(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gender = new javax.swing.ButtonGroup();
        martial = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
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
        username = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        search = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        timing = new javax.swing.JComboBox<>();
        clear = new javax.swing.JButton();
        SSN = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Doctor Search Form");

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 204));
        jLabel1.setText("Doctor's SSN  :");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 89, -1, 44));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 204));
        jLabel2.setText("First Name  :");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 146, 25));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 204));
        jLabel3.setText("Date Of Birth  :");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 146, 25));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 204));
        jLabel4.setText("Gender  :");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 146, 25));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 204));
        jLabel5.setText("Age  :");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 146, 25));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 204));
        jLabel6.setText("Moblie No  :");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 146, 25));
        jPanel2.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 216, -1));

        date.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        date.setAutoscrolls(true);
        jPanel2.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, -1, -1));

        month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        jPanel2.add(month, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, -1, -1));

        year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020" }));
        year.setAutoscrolls(true);
        jPanel2.add(year, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, -1, -1));

        gender.add(male);
        male.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        male.setForeground(new java.awt.Color(0, 51, 204));
        male.setText("Male");
        jPanel2.add(male, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, -1, -1));

        gender.add(female);
        female.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        female.setForeground(new java.awt.Color(0, 51, 204));
        female.setText("Female");
        female.setToolTipText("");
        female.setAutoscrolls(true);
        female.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(female, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, -1, -1));

        mobileno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mobilenoKeyPressed(evt);
            }
        });
        jPanel2.add(mobileno, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, 213, -1));

        mobilenovalidation.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        mobilenovalidation.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(mobilenovalidation, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 440, 135, 13));

        gender.add(other);
        other.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        other.setForeground(new java.awt.Color(0, 51, 204));
        other.setText("Other");
        jPanel2.add(other, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 204));
        jLabel7.setText(" Last Name  :");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 170, 147, 25));
        jPanel2.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 180, 212, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 204));
        jLabel8.setText("Blood Group  :");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, 147, 25));

        bloodgroup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "O+ve", "A+ve", "B+ve", "AB+ve", "O-ve", "A-ve", "B-ve", "AB-ve" }));
        bloodgroup.setAutoscrolls(true);
        jPanel2.add(bloodgroup, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 220, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 204));
        jLabel9.setText("Department  :");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 280, 147, 25));

        dept.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "ALLERGY & IMMUNOLOGY", "ANESTHESIOLOGY", "DERMATOLOGY", "DIAGNOSTIC RADIOLOGY", "EMERGENCY MEDICINE", "NEUROLOGY", "OBSTETRICS AND GYNECOLOGY", "PEDIATRICS", "PSYCHIATRY", "UROLOGY", " " }));
        jPanel2.add(dept, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 280, 242, -1));

        age.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ageKeyPressed(evt);
            }
        });
        jPanel2.add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 213, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 204));
        jLabel10.setText("Maritial Status  :");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 340, -1, 25));

        martial.add(married);
        married.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        married.setForeground(new java.awt.Color(0, 51, 204));
        married.setText("Married");
        jPanel2.add(married, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 340, -1, -1));

        martial.add(unmarried);
        unmarried.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        unmarried.setForeground(new java.awt.Color(0, 51, 204));
        unmarried.setText("Unmarried");
        jPanel2.add(unmarried, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 340, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 51, 204));
        jLabel11.setText("Address  :");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 146, 25));
        jPanel2.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 470, 687, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 204));
        jLabel12.setText("Experience  :");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 400, 147, 25));
        jPanel2.add(experience, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 400, 213, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 51, 204));
        jLabel13.setText("Username  :");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, 146, 25));
        jPanel2.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 520, 213, -1));

        jLabel15.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 51, 204));
        jLabel15.setText("                 Search Doctor");
        jLabel15.setAutoscrolls(true);
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 19, 483, 52));

        back.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel2.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 90, 80, 33));

        search.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel2.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 100, 40));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 51, 204));
        jLabel16.setText("Visit Timinig  :");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, 146, 20));

        timing.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "09.00 AM", "11.00 AM", "01.00 PM", "03.00 PM", "05.00 PM", "08.00 PM" }));
        timing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timingActionPerformed(evt);
            }
        });
        jPanel2.add(timing, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 580, 213, -1));

        clear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel2.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(802, 638, -1, -1));

        jPanel2.add(SSN, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 92, 120, 46));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 970, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
        // TODO add your handling code here:
    }//GEN-LAST:event_mobilenoKeyPressed

    private void ageKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ageKeyPressed
        String a = age.getText();
        int length = a.length();
        char c = evt.getKeyChar();
        if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9'){
            if(length<2){
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

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        new ADDOCTOR().setVisible(true);
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_backActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        String tssn=(String)SSN.getSelectedItem();
        try{
            if(tssn.equals("")){
                JOptionPane.showMessageDialog(null,"Select Doctor SSN");
            }
            else{
                int ssn = Integer.parseInt(tssn);
                CONNECTION con = new CONNECTION();// TODO add your handling code here:
                String sql = "Select * from doctor where SSN = ?";
                String daysql = "Select DATE_FORMAT(dob,'%d')from doctor where SSN = ?";
                String monthsql = "Select DATE_FORMAT(dob,'%m')from doctor where SSN = ?";
                String yearsql = "Select DATE_FORMAT(dob,'%Y')from doctor where SSN = ?";

                PreparedStatement st = con.c.prepareStatement(sql);
                PreparedStatement st1 = con.c.prepareStatement(daysql);
                PreparedStatement st2 = con.c.prepareStatement(monthsql);
                PreparedStatement st3 = con.c.prepareStatement(yearsql);

                st.setInt(1,ssn);
                st1.setInt(1,ssn);
                st2.setInt(1,ssn);
                st3.setInt(1,ssn);

                ResultSet rs = st.executeQuery();
                ResultSet rs1 = st1.executeQuery();
                ResultSet rs2 = st2.executeQuery();
                ResultSet rs3 = st3.executeQuery();
                while(rs.next()){
                    fname.setText(rs.getString("fname"));
                    lname.setText(rs.getString("lname"));
                    String [] bloodarr = {"","O+ve","A+ve","B+ve","AB+ve","O-ve","A-ve","B-ve","AB-ve"};
                    for(int i=0;i<9;i++){
                        if(rs.getString("bloodgroup").equals(bloodarr[i])){
                            bloodgroup.setSelectedIndex(i);
                        }
                    }
                    String [] vtime = {"","09.00 AM","11.00 AM","01.00 PM","03.00 PM","05.00 PM","08.00 PM"};
                    for(int i=0;i<7;i++){
                        if(rs.getString("timing").equals(vtime[i])){
                            timing.setSelectedIndex(i);
                        }
                    }
                    String [] deptarr = {"","ALLERGY & IMMUNOLOGY","ANESTHESIOLOGY","DERMATOLOGY","DIAGNOSTIC RADIOLOGY","EMERGENCY MEDICINE","NEUROLOGY","OBSTETRICS AND GYNECOLOGY","PEDIATRICS","PSYCHIATRYUROLOGY"};
                    int d = 1,b = 1;
                    while(true){
                        if(rs.getString("dept").equals(deptarr[d])){
                            dept.setSelectedIndex(b);
                            break;
                        }
                        else{
                            d++;
                            b++;
                        }
                    }
                    String gen = rs.getString("gender");
                    if(gen.equals("Male")){
                        male.setSelected(true);
                        female.setSelected(false);
                        other.setSelected(false);
                    }
                    else if(gen.equals("Female")){
                        male.setSelected(false);
                        female.setSelected(true);
                        other.setSelected(false);
                    }
                    else{
                        male.setSelected(false);
                        female.setSelected(false);
                        other.setSelected(true);
                    }
                    String mstat = rs.getString("maritialstatus");
                    if(mstat.equals("Married")){
                        married.setSelected(true);
                        unmarried.setSelected(false);
                    }
                    else{
                        married.setSelected(false);
                        unmarried.setSelected(true);
                    }
                    age.setText(String.valueOf(rs.getInt("age")));
                    mobileno.setText(rs.getString("mobileno"));
                    experience.setText(String.valueOf(rs.getInt("experience")));
                    address.setText(rs.getString("address"));
                    username.setText(rs.getString("username"));

                }
                while(rs1.next()){
                    int d = Integer.parseInt(rs1.getString(1));
                    date.setSelectedIndex(d);
                }
                while(rs2.next()){
                    int m = Integer.parseInt(rs2.getString(1));
                    month.setSelectedIndex(m);
                }
                while(rs3.next()){
                    int y = Integer.parseInt(rs3.getString(1));
                    int ye =1990,j=1;
                    for(int i=0;i<31;i++){
                        if(y==ye){
                            year.setSelectedIndex(j);
                        }
                        else{
                            ye++;
                            j++;
                        }
                    }
                }
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_searchActionPerformed

    private void timingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timingActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        SSN.setSelectedIndex(0);
        fname.setText("");
        lname.setText("");
        date.setSelectedIndex(0);
        month.setSelectedIndex(0);
        year.setSelectedIndex(0);
        gender.clearSelection();
        martial.clearSelection();
        bloodgroup.setSelectedIndex(0);
        dept.setSelectedIndex(0);
        age.setText("");
        mobileno.setText("");
        address.setText("");
        experience.setText("");
        username.setText("");
        timing.setSelectedIndex(0);
    }//GEN-LAST:event_clearActionPerformed

    public static void main(String args[]) {       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ADSEARCH().setVisible(true);            
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> SSN;
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
    private javax.swing.ButtonGroup gender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField lname;
    private javax.swing.JRadioButton male;
    private javax.swing.JRadioButton married;
    private javax.swing.ButtonGroup martial;
    private javax.swing.JTextField mobileno;
    private javax.swing.JLabel mobilenovalidation;
    private javax.swing.JComboBox<String> month;
    private javax.swing.JRadioButton other;
    private javax.swing.JButton search;
    private javax.swing.JComboBox<String> timing;
    private javax.swing.JRadioButton unmarried;
    private javax.swing.JTextField username;
    private javax.swing.JComboBox<String> year;
    // End of variables declaration//GEN-END:variables
}
