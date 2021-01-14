package hospitalmanagement;
import java.awt.event.KeyEvent;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
public class RPINSERT extends javax.swing.JFrame {
    public RPINSERT() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gender = new javax.swing.ButtonGroup();
        martial = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        SSN = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        mobileno = new javax.swing.JTextField();
        mobilenovalidation = new javax.swing.JLabel();
        other = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        bloodgroup = new javax.swing.JComboBox<>();
        age = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        married = new javax.swing.JRadioButton();
        unmarried = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        disease = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        doctor = new javax.swing.JComboBox<>();
        docname = new javax.swing.JTextField();
        firstvisit = new com.toedter.calendar.JDateChooser();
        jLabel13 = new javax.swing.JLabel();
        adddoctor = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        dob = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Receptionist Patient Insert");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 204));
        jLabel1.setText("Patient's SSN  :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 83, -1, 20));

        SSN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SSNKeyReleased(evt);
            }
        });
        jPanel1.add(SSN, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 83, 151, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("First Name  :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 132, 176, 25));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("Date Of Birth  :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 184, 176, 25));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("Gender  :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 238, 176, 25));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setText("Age  :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 295, 176, 25));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 204));
        jLabel6.setText("Moblie No  :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 352, 176, 25));
        jPanel1.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 137, 151, -1));

        gender.add(male);
        male.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        male.setForeground(new java.awt.Color(0, 51, 204));
        male.setText("Male");
        jPanel1.add(male, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 240, -1, -1));

        gender.add(female);
        female.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        female.setForeground(new java.awt.Color(0, 0, 204));
        female.setText("Female");
        female.setToolTipText("");
        female.setAutoscrolls(true);
        female.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(female, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 240, -1, -1));

        mobileno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mobilenoKeyPressed(evt);
            }
        });
        jPanel1.add(mobileno, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 355, 135, -1));

        mobilenovalidation.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        mobilenovalidation.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(mobilenovalidation, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 398, 135, 13));

        gender.add(other);
        other.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        other.setForeground(new java.awt.Color(0, 0, 204));
        other.setText("Other");
        jPanel1.add(other, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 240, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 204));
        jLabel7.setText(" Last Name  :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 134, 147, 25));
        jPanel1.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(656, 137, 242, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 204));
        jLabel8.setText("Blood Group  :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 186, 147, 25));

        bloodgroup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "O+ve", "A+ve", "B+ve", "AB+ve", "O-ve", "A-ve", "B-ve", "AB-ve" }));
        bloodgroup.setAutoscrolls(true);
        jPanel1.add(bloodgroup, new org.netbeans.lib.awtextra.AbsoluteConstraints(656, 189, -1, -1));

        age.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ageKeyPressed(evt);
            }
        });
        jPanel1.add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 297, 135, 25));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 204));
        jLabel10.setText("Maritial Status  :");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 306, -1, 25));

        martial.add(married);
        married.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        married.setForeground(new java.awt.Color(0, 0, 204));
        married.setText("Married");
        jPanel1.add(married, new org.netbeans.lib.awtextra.AbsoluteConstraints(656, 303, -1, -1));

        martial.add(unmarried);
        unmarried.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        unmarried.setForeground(new java.awt.Color(0, 0, 204));
        unmarried.setText("Unmarried");
        jPanel1.add(unmarried, new org.netbeans.lib.awtextra.AbsoluteConstraints(773, 303, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 204));
        jLabel11.setText("Address  :");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 176, 25));
        jPanel1.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 412, 485, 25));

        jLabel15.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 51, 204));
        jLabel15.setText("                  Add  Patient");
        jLabel15.setAutoscrolls(true);
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 13, 483, 52));

        back.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(842, 26, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 204));
        jLabel9.setText("Disease Name  :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(499, 243, -1, 25));
        jPanel1.add(disease, new org.netbeans.lib.awtextra.AbsoluteConstraints(656, 246, 242, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 204));
        jLabel12.setText("Doctor Id");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 463, -1, 43));

        doctor.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                doctorItemStateChanged(evt);
            }
        });
        jPanel1.add(doctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 475, 147, -1));
        jPanel1.add(docname, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 475, 294, -1));
        jPanel1.add(firstvisit, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 536, 184, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 204));
        jLabel13.setText("First Visit");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 524, 113, 34));

        adddoctor.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        adddoctor.setText("Add Patient");
        adddoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adddoctorActionPerformed(evt);
            }
        });
        jPanel1.add(adddoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 590, -1, -1));

        clear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel1.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(608, 590, -1, -1));
        jPanel1.add(dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 187, 151, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 960, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 960, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SSNKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SSNKeyReleased
        int ssn = Integer.parseInt(SSN.getText());
        int f = 0;
        try{
            CONNECTION con = new CONNECTION();
            String sql = "Select SSN from patient";
            PreparedStatement st = con.c.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                if(ssn == rs.getInt("SSN"))
                {
                    f++;
                }
            }
            if(f == 1){
                JOptionPane.showMessageDialog(null,"Patient SSN already exists !");
                SSN.setText("");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_SSNKeyReleased

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
        if(evt.getKeyChar()>='1' && evt.getKeyChar()<='9'){
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
        }       
    }//GEN-LAST:event_ageKeyPressed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        new RPHOME().setVisible(true);
        dispose();
    }//GEN-LAST:event_backActionPerformed

    private void doctorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_doctorItemStateChanged
        String ss1=(String)doctor.getSelectedItem();
        try{
            int s1=Integer.parseInt(ss1);
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","Jeyakumar28");
            PreparedStatement smt=conn.prepareStatement("Select fname,lname from doctor where SSN=?");
            smt.setInt(1,s1);
            ResultSet rs=smt.executeQuery();
            while(rs.next()){
                docname.setText(rs.getString("fname")+" "+rs.getString("lname"));
            }
        }
        catch(Exception e1){
            System.out.print(e1);
        }
    }//GEN-LAST:event_doctorItemStateChanged

    private void adddoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adddoctorActionPerformed

        try{
            CONNECTION con = new CONNECTION();

            String sql = "insert into patient(SSN,fname,lname,dob,bloodgroup,gender,disease,age,maritialstatus,mobileno,address,firstvisit,lastvisit,nextvisit) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement st = con.c.prepareStatement(sql);
            int ssn = Integer.parseInt(SSN.getText());
            String first = fname.getText();
            String last = lname.getText();
            String dis = disease.getText();
            SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd");
            String birthdate = dateFormat.format(firstvisit.getDate());
            String blood = (String)bloodgroup.getSelectedItem();
            String gen = null;
            if(male.isSelected()){
                gen = "Male";
            }
            else if(female.isSelected()){
                gen = "Female";
            }
            else if(other.isSelected()){
                gen = "Other";
            }
            else{}
            int ag = Integer.parseInt(age.getText());
            String mstatus;
            if(married.isSelected()){
                mstatus = "Married";
            }
            else{
                mstatus = "Unmarried";
            }
            String mobno = mobileno.getText();
            String add = address.getText();
            String fvisit = dateFormat.format(firstvisit.getDate());
            st.setInt(1, ssn);
            st.setString(2,first);
            st.setString(3,last);
            st.setString(4,birthdate);
            st.setString(5,blood);
            st.setString(6,gen);
            st.setString(7,dis);
            st.setInt(8,ag);
            st.setString(9,mstatus);
            st.setString(10,mobno);
            st.setString(11,add );
            st.setString(12,fvisit);
            st.setNull(13,Types.NULL);
            st.setNull(14,Types.NULL);
            int i = st.executeUpdate();
            String tdssn=(String)doctor.getSelectedItem();
            int dssn=Integer.parseInt(tdssn);
            String sql1 = "insert into treats(dssn,pssn) values(?,?)";
            PreparedStatement st1 = con.c.prepareStatement(sql1);
            st1.setInt(1,dssn);
            st1.setInt(2, ssn);
            int i1 = st1.executeUpdate();
            if (i > 0&&i1>0){
                JOptionPane.showMessageDialog(null, "Patient's Details Successfully Created");
            }
            else {
                JOptionPane.showMessageDialog(null,"Failed try again");
            }
            SSN.setText("");
            fname.setText("");
            lname.setText("");
            dob.setCalendar(null);
            disease.setText("");
            gender.clearSelection();
            gender.clearSelection();
            bloodgroup.setSelectedIndex(0);
            age.setText("");
            mobileno.setText("");
            address.setText("");
            doctor.setSelectedIndex(0);
            firstvisit.setCalendar(null);
            docname.setText("");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_adddoctorActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        SSN.setText("");
        fname.setText("");
        lname.setText("");
        disease.setText("");
        dob.setCalendar(null);
        gender.clearSelection();
        gender.clearSelection();
        bloodgroup.setSelectedIndex(0);
        age.setText("");
        mobileno.setText("");
        address.setText("");
        doctor.setSelectedIndex(0);
        firstvisit.setCalendar(null);
        docname.setText("");
    }//GEN-LAST:event_clearActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RPINSERT().setVisible(true);
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
    private javax.swing.JTextField disease;
    private com.toedter.calendar.JDateChooser dob;
    private javax.swing.JTextField docname;
    private javax.swing.JComboBox<String> doctor;
    private javax.swing.JRadioButton female;
    private com.toedter.calendar.JDateChooser firstvisit;
    private javax.swing.JTextField fname;
    private javax.swing.ButtonGroup gender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.ButtonGroup martial;
    private javax.swing.JTextField mobileno;
    private javax.swing.JLabel mobilenovalidation;
    private javax.swing.JRadioButton other;
    private javax.swing.JRadioButton unmarried;
    // End of variables declaration//GEN-END:variables
}
