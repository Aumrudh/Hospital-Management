package hospitalmanagement;
import java.sql.*;
public class Home extends javax.swing.JFrame {

    public Home() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        adminbutton = new javax.swing.JButton();
        doctorbutton = new javax.swing.JButton();
        recepbutton = new javax.swing.JButton();
        admin = new javax.swing.JLabel();
        doc = new javax.swing.JLabel();
        recep = new javax.swing.JLabel();
        header = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Form");
        setBackground(new java.awt.Color(51, 102, 255));
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jButton1.setText("jButton1");
        jPanel1.add(jButton1);
        jButton1.setBounds(186, 200, 79, 25);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(38, 0, 0, 0);

        adminbutton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        adminbutton.setText("ADMIN");
        adminbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(adminbutton);
        adminbutton.setBounds(40, 306, 128, 32);

        doctorbutton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        doctorbutton.setText("DOCTOR");
        doctorbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(doctorbutton);
        doctorbutton.setBounds(232, 306, 121, 32);

        recepbutton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        recepbutton.setText("RECEPTIONIST");
        recepbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recepbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(recepbutton);
        recepbutton.setBounds(393, 306, 165, 32);

        admin.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aumrudh Lal Kumar TJ\\Documents\\NetBeansProjects\\HospitalManagement\\images\\admin.png")); // NOI18N
        getContentPane().add(admin);
        admin.setBounds(40, 140, 128, 135);

        doc.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aumrudh Lal Kumar TJ\\Documents\\NetBeansProjects\\HospitalManagement\\images\\doctor (4).png")); // NOI18N
        getContentPane().add(doc);
        doc.setBounds(232, 138, 121, 130);

        recep.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aumrudh Lal Kumar TJ\\Documents\\NetBeansProjects\\HospitalManagement\\images\\receptionist.png")); // NOI18N
        getContentPane().add(recep);
        recep.setBounds(410, 140, 165, 128);

        header.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        header.setForeground(new java.awt.Color(51, 153, 255));
        header.setText("Hospital Management System");
        getContentPane().add(header);
        header.setBounds(38, 36, 542, 51);

        setSize(new java.awt.Dimension(620, 433));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void adminbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminbuttonActionPerformed
        ADMINLOGIN al = new ADMINLOGIN();
        al.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_adminbuttonActionPerformed

    private void doctorbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorbuttonActionPerformed
        DOCTORLOGIN dl = new DOCTORLOGIN();
        dl.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_doctorbuttonActionPerformed

    private void recepbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recepbuttonActionPerformed
        RECEPLOGIN rl = new RECEPLOGIN();
        rl.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_recepbuttonActionPerformed

    public static void main(String args[]) {
        SPLASH sp = new SPLASH();
        sp.setVisible(true);
        try{
            for(int i=0;i<=100;i++){
                    Thread.sleep(60);
                    sp.lol.setText(Integer.toString(i)+"%");
                    if(i==100){
                        new Home().setVisible(true);
                        sp.dispose();
                    }    
            }
        }
        catch(Exception e){
            System.out.println("Splash Execution Failed");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel admin;
    private javax.swing.JButton adminbutton;
    private javax.swing.JLabel doc;
    private javax.swing.JButton doctorbutton;
    private javax.swing.JLabel header;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel recep;
    private javax.swing.JButton recepbutton;
    // End of variables declaration//GEN-END:variables
}
