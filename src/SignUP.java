
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IFTI
 */
public class SignUP extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    Connection con1,con2,con3;
    PreparedStatement select,insert;
    
    public SignUP() {
        Connect();
        initComponents();
    }
    public void Connect()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SignUP.class.getName()).log(Level.SEVERE, null, ex);
        }
            try {
                con1 = DriverManager.getConnection("jdbc:mysql://localhost/librarymanagement","root","");
            } catch (SQLException ex) {
                System.out.print(ex);
            }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton4 = new javax.swing.JToggleButton();
        uname2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pwrd = new javax.swing.JTextField();
        SSignup = new javax.swing.JToggleButton();
        TSignUp = new javax.swing.JToggleButton();
        dept = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        uname = new javax.swing.JTextField();
        Back = new javax.swing.JToggleButton();
        UID = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jToggleButton4.setText("jToggleButton4");

        uname2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uname2ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Username");
        jLabel6.setPreferredSize(new java.awt.Dimension(100, 30));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Username");
        jLabel1.setPreferredSize(new java.awt.Dimension(100, 30));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password");
        jLabel2.setPreferredSize(new java.awt.Dimension(100, 30));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, -1, -1));

        pwrd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwrdActionPerformed(evt);
            }
        });
        getContentPane().add(pwrd, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 200, 30));

        SSignup.setText("Sign Up as Student");
        SSignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SSignupActionPerformed(evt);
            }
        });
        getContentPane().add(SSignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 380, 210, 45));

        TSignUp.setText("Sign Up as Teacher");
        TSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TSignUpActionPerformed(evt);
            }
        });
        getContentPane().add(TSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, 210, 45));

        dept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deptActionPerformed(evt);
            }
        });
        getContentPane().add(dept, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 200, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Deparment");
        jLabel5.setPreferredSize(new java.awt.Dimension(100, 30));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, -1, -1));

        Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailActionPerformed(evt);
            }
        });
        getContentPane().add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 200, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Email");
        jLabel7.setPreferredSize(new java.awt.Dimension(100, 30));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 50, -1));

        uname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unameActionPerformed(evt);
            }
        });
        getContentPane().add(uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 200, 30));

        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        getContentPane().add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, -1, -1));

        UID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UIDActionPerformed(evt);
            }
        });
        getContentPane().add(UID, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 200, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("University ID");
        jLabel8.setPreferredSize(new java.awt.Dimension(100, 30));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 120, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/w7n7rb (1).jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-350, 0, 1080, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pwrdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwrdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwrdActionPerformed

    private void TSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TSignUpActionPerformed
        String username, pass_word, department, email, uid, usernamedb;
        int temp=0;
        
        username = uname.getText();
        try{
                con1 = DriverManager.getConnection("jdbc:mysql://localhost/librarymanagement","root","");
                select = con1.prepareStatement("select * From teacher_info");
                ResultSet rs = select.executeQuery();
                while(rs.next())
                {
                usernamedb = rs.getString("username");
                if(username.equals(usernamedb)){
                    JOptionPane.showMessageDialog(this, "This Username is already taken");
                    temp++;
                }
                }
        }catch (SQLException ex){
                System.out.print(ex);
                } 
        pass_word = pwrd.getText();
        department = dept.getText();
        email = Email.getText();
        uid = UID.getText();
        if(temp>0){
            this.dispose();
            new SignUP().setVisible(true);
        }     
        else {
                try{
                if(username.isEmpty())
                {
                JOptionPane.showMessageDialog(this,"Please fill up both text field to register");
                }
                else
                {
                insert = con1.prepareStatement("insert into tempteacher(username,pass_word,department,email,uid) values(?,?,?,?,?)");
                insert.setString(1, username);
                insert.setString(2, pass_word);
                insert.setString(3, department);
                insert.setString(4, email);
                insert.setString(5, uid);
    
                int k = insert.executeUpdate();
                
                if(k == 1)
                {
                JOptionPane.showMessageDialog(this,"Data inserted!");
                
                uname.setText("");
                pwrd.setText("");
                dept.setText("");
                Email.setText("");
                UID.setText("");
                
                }
                else
                {
                JOptionPane.showMessageDialog(this,"Error!");
                }
                }
                }catch(SQLException ex){
                System.out.println(ex);
                }   // TODO add your handling code here:
        }   // TODO add your handling code here:
    }//GEN-LAST:event_TSignUpActionPerformed

    private void SSignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SSignupActionPerformed

        String username, pass_word, department, email, uid, usernamedb;
        int temp=0;
        
        username = uname.getText();
        try{
                con1 = DriverManager.getConnection("jdbc:mysql://localhost/librarymanagement","root","");
                select = con1.prepareStatement("select * From student_info");
                ResultSet rs = select.executeQuery();
                while(rs.next())
                {
                usernamedb = rs.getString("username");
                if(username.equals(usernamedb)){
                    JOptionPane.showMessageDialog(this, "This Username is already taken");
                    temp++;
                }
                }
        }catch (SQLException ex){
                System.out.print(ex);
                } 
        pass_word = pwrd.getText();
        department = dept.getText();
        email = Email.getText();
        uid = UID.getText();
        if(temp>0){
            this.dispose();
            new SignUP().setVisible(true);
        }     
        else {
                try{
                if(username.isEmpty())
                {
                JOptionPane.showMessageDialog(this,"Please fill up both text field to register");
                }
                else
                {
                insert = con1.prepareStatement("insert into tempstudent(username,pass_word,department,email,uid) values(?,?,?,?,?)");
                insert.setString(1, username);
                insert.setString(2, pass_word);
                insert.setString(3, department);
                insert.setString(4, email);
                insert.setString(5, uid);
    
                int k = insert.executeUpdate();
                
                if(k == 1)
                {
                JOptionPane.showMessageDialog(this,"Data inserted!");
                
                uname.setText("");
                pwrd.setText("");
                dept.setText("");
                Email.setText("");
                UID.setText("");
                
                }
                else
                {
                JOptionPane.showMessageDialog(this,"Error!");
                }
                }
                }catch(SQLException ex){
                System.out.println(ex);
                }   // TODO add your handling code here:
        }   // TODO add your handling code here:
    }//GEN-LAST:event_SSignupActionPerformed

    private void deptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deptActionPerformed

    private void uname2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uname2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uname2ActionPerformed

    private void EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailActionPerformed

    private void unameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unameActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
    this.dispose();
    Login login = new Login();
    login.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_BackActionPerformed

    private void UIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UIDActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Back;
    private javax.swing.JTextField Email;
    private javax.swing.JToggleButton SSignup;
    private javax.swing.JToggleButton TSignUp;
    private javax.swing.JTextField UID;
    private javax.swing.JTextField dept;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JTextField pwrd;
    private javax.swing.JTextField uname;
    private javax.swing.JTextField uname2;
    // End of variables declaration//GEN-END:variables
}
