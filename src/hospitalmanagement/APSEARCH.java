
package hospitalmanagement;
import java.awt.event.KeyEvent;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.WARNING_MESSAGE;

public class APSEARCH extends javax.swing.JFrame {

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
    public APSEARCH() {
        initComponents();
        patadd();
        fname.setEditable(false);
        lname.setEditable(false);
        disease.setEditable(false);
        bloodgroup.setEditable(false);
        age.setEditable(false);
        mobileno.setEditable(false);
        address.setEditable(false);
        firstvisit.setEnabled(false);
        lastvisit.setEnabled(false);
        nextvisit.setEnabled(false);
        dob.setEnabled(false);
        docid.setEditable(false);
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
        search = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        disease = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        lastvisit = new com.toedter.calendar.JDateChooser();
        nextvisit = new com.toedter.calendar.JDateChooser();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        dob = new com.toedter.calendar.JDateChooser();
        jLabel17 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        SSN = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        firstvisit = new com.toedter.calendar.JDateChooser();
        jLabel16 = new javax.swing.JLabel();
        docid = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Patient Search  Form");

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 204));
        jLabel1.setText("Patient's SSN  :");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 125, 177, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 204));
        jLabel2.setText("First Name  :");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 181, 177, 25));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 204));
        jLabel3.setText("Date Of Birth  :");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 233, 177, 25));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 204));
        jLabel4.setText("Gender  :");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 177, 25));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 204));
        jLabel5.setText("Age  :");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 353, 177, 25));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 204));
        jLabel6.setText("Moblie No  :");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 413, 177, 25));
        jPanel2.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 184, 137, -1));

        gender.add(male);
        male.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        male.setForeground(new java.awt.Color(0, 51, 204));
        male.setText("Male");
        jPanel2.add(male, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 287, -1, -1));

        gender.add(female);
        female.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        female.setForeground(new java.awt.Color(0, 51, 204));
        female.setText("Female");
        female.setToolTipText("");
        female.setAutoscrolls(true);
        female.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(female, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 287, -1, -1));

        mobileno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mobilenoKeyPressed(evt);
            }
        });
        jPanel2.add(mobileno, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 416, 135, -1));

        mobilenovalidation.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        mobilenovalidation.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(mobilenovalidation, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 449, 135, 13));

        gender.add(other);
        other.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        other.setForeground(new java.awt.Color(0, 51, 204));
        other.setText("Other");
        jPanel2.add(other, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 287, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 204));
        jLabel7.setText(" Last Name  :");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(532, 181, 125, 25));
        jPanel2.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(698, 184, 154, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 204));
        jLabel8.setText("Blood Group  :");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(532, 233, 147, 25));

        bloodgroup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "O+ve", "A+ve", "B+ve", "AB+ve", "O-ve", "A-ve", "B-ve", "AB-ve" }));
        bloodgroup.setAutoscrolls(true);
        jPanel2.add(bloodgroup, new org.netbeans.lib.awtextra.AbsoluteConstraints(697, 236, 81, -1));

        age.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ageKeyPressed(evt);
            }
        });
        jPanel2.add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 356, 135, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 204));
        jLabel10.setText("Maritial Status  :");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 353, -1, 25));

        martial.add(married);
        married.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        married.setForeground(new java.awt.Color(0, 51, 204));
        married.setText("Married");
        jPanel2.add(married, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 350, -1, -1));

        martial.add(unmarried);
        unmarried.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        unmarried.setForeground(new java.awt.Color(0, 51, 204));
        unmarried.setText("Unmarried");
        jPanel2.add(unmarried, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 350, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 51, 204));
        jLabel11.setText("Address  :");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 475, 177, 25));
        jPanel2.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 478, 795, -1));

        search.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel2.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 122, 100, -1));

        clear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel2.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(642, 597, -1, -1));
        jPanel2.add(disease, new org.netbeans.lib.awtextra.AbsoluteConstraints(698, 293, 267, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 204));
        jLabel9.setText("Disease Name  :");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 290, 153, 25));

        lastvisit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel2.add(lastvisit, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 575, 158, -1));

        nextvisit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel2.add(nextvisit, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 627, 158, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 204));
        jLabel13.setText("Next Visit");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 615, 113, 34));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 204));
        jLabel14.setText("Last Visit");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 563, 113, 34));

        dob.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel2.add(dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 236, 137, -1));

        jLabel17.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 102, 255));
        jLabel17.setText("                        Search Patient                    ");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 33, -1, -1));

        back.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel2.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(731, 43, -1, 41));

        jPanel2.add(SSN, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 124, 137, 31));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 204));
        jLabel15.setText("Doctor Id :");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 410, 113, 34));

        firstvisit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel2.add(firstvisit, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 528, 157, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 204));
        jLabel16.setText("First Visit");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 516, 113, 34));
        jPanel2.add(docid, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 420, 146, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        new ADPAT().setVisible(true);
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
        firstvisit.setCalendar(null);
        lastvisit.setCalendar(null);
        nextvisit.setCalendar(null);
        docid.setText("");
    }//GEN-LAST:event_clearActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        String tssn=(String)SSN.getSelectedItem();        
        try{
            if(tssn.equals("")){
                JOptionPane.showMessageDialog(null,"Select patient's SSN !","Alert",WARNING_MESSAGE);
            }
            else{
                int ssn = Integer.parseInt(tssn);
            CONNECTION con = new CONNECTION();
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
                else
                {
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
                String sql1 = "Select * from treats where pssn = ?";
                PreparedStatement st1 = con.c.prepareStatement(sql1);
                st1.setInt(1,ssn);
                ResultSet rs1 = st1.executeQuery();
                while(rs1.next()){
                String t =(String.valueOf(rs.getInt(1)));
                docid.setText(t);
            }          
            }
        }
        }
        catch(Exception e){
            System.out.println("search exception "+e);
        }
    }//GEN-LAST:event_searchActionPerformed

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

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new APSEARCH().setVisible(true);         
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
    private javax.swing.JTextField docid;
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
    private javax.swing.JLabel jLabel16;
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
    // End of variables declaration//GEN-END:variables
}
