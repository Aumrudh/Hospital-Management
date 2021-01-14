package hospitalmanagement;
import java.awt.event.KeyEvent;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.WARNING_MESSAGE;
public class DPUPDATE extends javax.swing.JFrame {
    public final void patadd(){
    try{
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","Jeyakumar28");
    PreparedStatement smt=conn.prepareStatement("Select SSN  from patient");
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
    public DPUPDATE() {
        initComponents();
        patadd();
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
        update = new javax.swing.JButton();
        back = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        disease = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        lastvisit = new com.toedter.calendar.JDateChooser();
        nextvisit = new com.toedter.calendar.JDateChooser();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        dob = new com.toedter.calendar.JDateChooser();
        SSN = new javax.swing.JComboBox<>();
        search = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        firstvisit = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dcotor's Update Patient Form");

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 204));
        jLabel1.setText("Patient's SSN  :");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 125, -1, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 204));
        jLabel2.setText("First Name  :");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 179, 176, 25));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 204));
        jLabel3.setText("Date Of Birth  :");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 231, 176, 25));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 204));
        jLabel4.setText("Gender  :");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 288, 176, 25));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 204));
        jLabel5.setText("Age  :");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 351, 176, 25));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 204));
        jLabel6.setText("Moblie No  :");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 411, 176, 25));
        jPanel2.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 182, 137, -1));

        gender.add(male);
        male.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        male.setForeground(new java.awt.Color(0, 51, 204));
        male.setText("Male");
        jPanel2.add(male, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 285, -1, -1));

        gender.add(female);
        female.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        female.setForeground(new java.awt.Color(0, 51, 204));
        female.setText("Female");
        female.setToolTipText("");
        female.setAutoscrolls(true);
        female.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(female, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 285, -1, -1));

        mobileno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mobilenoKeyPressed(evt);
            }
        });
        jPanel2.add(mobileno, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 414, 135, -1));

        mobilenovalidation.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        mobilenovalidation.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(mobilenovalidation, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 443, 135, 13));

        gender.add(other);
        other.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        other.setForeground(new java.awt.Color(0, 51, 204));
        other.setText("Other");
        jPanel2.add(other, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 285, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 204));
        jLabel7.setText(" Last Name  :");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(466, 179, 125, 25));
        jPanel2.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(721, 182, 154, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 204));
        jLabel8.setText("Blood Group  :");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(538, 231, 147, 25));

        bloodgroup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "O+ve", "A+ve", "B+ve", "AB+ve", "O-ve", "A-ve", "B-ve", "AB-ve" }));
        bloodgroup.setAutoscrolls(true);
        jPanel2.add(bloodgroup, new org.netbeans.lib.awtextra.AbsoluteConstraints(721, 234, -1, -1));

        age.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ageKeyPressed(evt);
            }
        });
        jPanel2.add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 354, 135, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 204));
        jLabel10.setText("Maritial Status  :");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 351, -1, 25));

        martial.add(married);
        married.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        married.setForeground(new java.awt.Color(0, 51, 204));
        married.setText("Married");
        jPanel2.add(married, new org.netbeans.lib.awtextra.AbsoluteConstraints(681, 348, -1, -1));

        martial.add(unmarried);
        unmarried.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        unmarried.setForeground(new java.awt.Color(0, 51, 204));
        unmarried.setText("Unmarried");
        jPanel2.add(unmarried, new org.netbeans.lib.awtextra.AbsoluteConstraints(798, 348, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 51, 204));
        jLabel11.setText("Address  :");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 469, 176, 25));
        jPanel2.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 472, 678, -1));

        jLabel15.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 51, 204));
        jLabel15.setText("                 Update Patient");
        jLabel15.setAutoscrolls(true);
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 19, 483, 52));

        update.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel2.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 122, -1, -1));

        back.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel2.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(846, 40, -1, -1));

        clear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel2.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(786, 643, -1, -1));
        jPanel2.add(disease, new org.netbeans.lib.awtextra.AbsoluteConstraints(721, 291, 202, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 204));
        jLabel9.setText("Disease Name  :");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 288, 153, 25));
        jPanel2.add(lastvisit, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 580, 158, -1));
        jPanel2.add(nextvisit, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 620, 158, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 204));
        jLabel13.setText("Next Visit :");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 615, 113, 34));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 204));
        jLabel14.setText("Last Visit :");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 563, 113, 34));
        jPanel2.add(dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 234, 137, -1));

        jPanel2.add(SSN, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 124, 137, 31));

        search.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel2.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 122, 100, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 204));
        jLabel17.setText("First Visit :");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 113, 34));
        jPanel2.add(firstvisit, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 520, 157, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 965, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mobilenoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mobilenoKeyPressed
        String phone = mobileno.getText();
        int len = phone.length();
        char c = evt.getKeyChar();
        if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9'){
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

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed

        try{
            CONNECTION con = new CONNECTION();
            String ssn1 = (String)SSN.getSelectedItem();
            int ssn = Integer.parseInt(ssn1);
            String first = fname.getText();
            String last = lname.getText();
            String dis = disease.getText();
            SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd");
            String birthdate = dateFormat.format(dob.getDate());
            String blood = (String)bloodgroup.getSelectedItem();
            String gen;
            if(male.isSelected()){
                gen = "Male";
            }
            else if(female.isSelected()){
                gen = "Female";
            }
            else{
                gen = "Other";
            }
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
            String lvisit = dateFormat.format(lastvisit.getDate());
            String nvisit = dateFormat.format(nextvisit.getDate());

            String sql1="update patient set fname=? where SSN = ?";
            PreparedStatement st1 = con.c.prepareStatement(sql1);
            st1.setString(1,first);
            st1.setString(2,ssn1);

            String sql2="update patient set lname=? where SSN = ?";
            PreparedStatement st2 = con.c.prepareStatement(sql2);
            st2.setString(1,last);
            st2.setString(2,ssn1);

            String sql3="update patient set dob=? where SSN = ?";
            PreparedStatement st3 = con.c.prepareStatement(sql3);
            st3.setString(1,birthdate);
            st3.setString(2,ssn1);

            String sql4="update patient set bloodgroup=? where SSN = ?";
            PreparedStatement st4 = con.c.prepareStatement(sql4);
            st4.setString(1,blood);
            st4.setString(2,ssn1);

            String sql5="update patient set gender=? where SSN = ?";
            PreparedStatement st5 = con.c.prepareStatement(sql5);
            st5.setString(1,gen);
            st5.setString(2,ssn1);

            String sql6="update patient set disease=? where SSN = ?";
            PreparedStatement st6 = con.c.prepareStatement(sql6);
            st6.setString(1,dis);
            st6.setString(2,ssn1);

            String sql7="update patient set age=? where SSN = ?";
            PreparedStatement st7 = con.c.prepareStatement(sql7);
            st7.setInt(1,ag);
            st7.setString(2,ssn1);

            String sql8="update patient set maritialstatus=? where SSN = ?";
            PreparedStatement st8 = con.c.prepareStatement(sql8);
            st8.setString(1,mstatus);
            st8.setString(2,ssn1);

            String sql9="update patient set mobileno=? where SSN = ?";
            PreparedStatement st9 = con.c.prepareStatement(sql9);
            st9.setString(1,mobno);
            st9.setString(2,ssn1);

            String sql10="update patient set address=?where SSN = ?";
            PreparedStatement st10 = con.c.prepareStatement(sql10);
            st10.setString(1,add);
            st10.setString(2,ssn1);

            String sql11="update patient set lastvisit=? where SSN = ?";
            PreparedStatement st11 = con.c.prepareStatement(sql11);
            st11.setString(1,lvisit);
            st11.setString(2,ssn1);

            String sql12="update patient set nextvisit=? where SSN = ?";
            PreparedStatement st12 = con.c.prepareStatement(sql12);
            st12.setString(1,nvisit);
            st12.setString(2,ssn1);
            int i1 = st1.executeUpdate();
            int i2 = st2.executeUpdate();
            int i3 = st3.executeUpdate();
            int i4 = st4.executeUpdate();
            int i5 = st5.executeUpdate();
            int i6 = st6.executeUpdate();
            int i7 = st7.executeUpdate();
            int i8 = st8.executeUpdate();
            int i9 = st9.executeUpdate();
            int i10= st10.executeUpdate();
            int i11 =st11.executeUpdate();
            int i12 =st12.executeUpdate();
            if (i1 > 0||i2 > 0||i3 > 0||i4 > 0||i5 > 0||i6 > 0||i7 > 0||i8 > 0||i9 > 0||i10 > 0||i11 > 0||i12 > 0){
                JOptionPane.showMessageDialog(null, "Patient's Details Successfully Updated");
            }
            else {
                JOptionPane.showMessageDialog(null,"Failed try again");
            }
            SSN.setSelectedIndex(0);
            fname.setText("");
            lname.setText("");
            disease.setText("");
            dob.setCalendar(null);
            gender.clearSelection();
            martial.clearSelection();
            bloodgroup.setSelectedIndex(0);
            age.setText("");
            mobileno.setText("");
            address.setText("");
            firstvisit.setCalendar(null);
            lastvisit.setCalendar(null);
            nextvisit.setCalendar(null);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_updateActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        new DOCPAHOME().setVisible(true);
        dispose();
    }//GEN-LAST:event_backActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        SSN.setSelectedIndex(0);
        fname.setText("");
        lname.setText("");
        disease.setText("");
        dob.setCalendar(null);
        gender.clearSelection();
        martial.clearSelection();
        bloodgroup.setSelectedIndex(0);
        age.setText("");
        mobileno.setText("");
        address.setText("");
        lastvisit.setCalendar(null);
        nextvisit.setCalendar(null);
    }//GEN-LAST:event_clearActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        String tssn=(String)SSN.getSelectedItem();
        try{
            if(tssn.equals("")){
                JOptionPane.showMessageDialog(null,"Select patient's SSN !","Alert",WARNING_MESSAGE);
            }
            else{
                int ssn = Integer.parseInt(tssn);
                CONNECTION con = new CONNECTION();// TODO add your handling code here:
                String sql = "Select * from patient where SSN = ?";

                PreparedStatement st = con.c.prepareStatement(sql);

                st.setInt(1,ssn);

                ResultSet rs = st.executeQuery();
                while(rs.next()){
                    fname.setText(rs.getString("fname"));
                    lname.setText(rs.getString("lname"));
                    String [] bloodarr = {"","O+ve","A+ve","B+ve","AB+ve","O-ve","A-ve","B-ve","AB-ve"};
                    for(int i=0;i<9;i++){
                        if(rs.getString("bloodgroup").equals(bloodarr[i]))
                        {
                            bloodgroup.setSelectedIndex(i);
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
                    address.setText(rs.getString("address"));
                    disease.setText(rs.getString("disease"));
                    Date date = new SimpleDateFormat("yyyy-MM-dd").parse(rs.getString("dob"));
                    dob.setDate(date);
                    Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse(rs.getString("firstvisit"));
                    firstvisit.setDate(date1);
                    Date date2 = new SimpleDateFormat("yyyy-MM-dd").parse(rs.getString("lastvisit"));
                    lastvisit.setDate(date2);
                    Date date3 = new SimpleDateFormat("yyyy-MM-dd").parse(rs.getString("nextvisit"));
                    nextvisit.setDate(date3);                    
                }
            }
        }
        catch(Exception e){
            System.out.println("search exception "+e);
        }
    }//GEN-LAST:event_searchActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DPUPDATE().setVisible(true);
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
    private javax.swing.JTextField disease;
    private com.toedter.calendar.JDateChooser dob;
    private javax.swing.JRadioButton female;
    private com.toedter.calendar.JDateChooser firstvisit;
    private javax.swing.JTextField fname;
    private javax.swing.ButtonGroup gender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private com.toedter.calendar.JDateChooser lastvisit;
    private javax.swing.JTextField lname;
    private javax.swing.JRadioButton male;
    private javax.swing.JRadioButton married;
    private javax.swing.ButtonGroup martial;
    private javax.swing.JTextField mobileno;
    private javax.swing.JLabel mobilenovalidation;
    private com.toedter.calendar.JDateChooser nextvisit;
    private javax.swing.JRadioButton other;
    private javax.swing.JButton search;
    private javax.swing.JRadioButton unmarried;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
