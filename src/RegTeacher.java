
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
public class RegTeacher extends javax.swing.JFrame {

    /**
     * Creates new form RegStudent
     */
    Connection con1,con2,con3;
    PreparedStatement select,insert,update,tbl,delete;
    ResultSet rs;
    public RegTeacher() {
        Connect();
        initComponents();
        table_category();
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
private void table_category()
    {
        try{
            tbl = con1.prepareStatement("select * from tempteacher");
            rs = tbl.executeQuery();
            
            javax.swing.table.DefaultTableModel df = (javax.swing.table.DefaultTableModel) jTable2.getModel();
            df.setRowCount(0);
            
            while(rs.next())
            {
                String id = String.valueOf(rs.getInt("id"));
                String username = rs.getString("username");
                String password = rs.getString("pass_word");
                String department = rs.getString("department");
                String email = rs.getString("email");
                String uid = rs.getString("uid");
                
                String row[] = {id,username,password,department,email,uid};
                df.addRow(row);
            }
        }catch(SQLException ex)
        {
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

        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        uname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        pwrd = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        UID = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        dept = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jbuttonDelete = new javax.swing.JToggleButton();
        jbuttonAdd = new javax.swing.JToggleButton();
        back = new javax.swing.JToggleButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel8 = new javax.swing.JLabel();

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Library.jpg"))); // NOI18N
        jLabel5.setText("jLabel1");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Library.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "id", "Username", "Password", "Deparment", "Email", "UNI ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable2);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(462, 0, 540, 650));

        jLabel2.setText("Username");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 80, 30));
        getContentPane().add(uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 310, 30));

        jLabel3.setText("Pasword");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 80, 30));
        getContentPane().add(pwrd, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 310, 30));

        jLabel4.setText("Email");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 80, 30));
        getContentPane().add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 310, 30));
        getContentPane().add(UID, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 310, 30));

        jLabel6.setText("UNI ID");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 80, 30));
        getContentPane().add(dept, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 310, 30));

        jLabel7.setText("Department");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 80, 30));

        jbuttonDelete.setText("Delete");
        jbuttonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuttonDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(jbuttonDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, 90, 30));

        jbuttonAdd.setText("Add");
        jbuttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuttonAddActionPerformed(evt);
            }
        });
        getContentPane().add(jbuttonAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 90, 30));

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 440, 160, 30));

        jToggleButton1.setBackground(new java.awt.Color(255, 255, 255));
        jToggleButton1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jToggleButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\IFTI\\Documents\\Icons\\Smaller\\TeacherApproval.jpg")); // NOI18N
        jToggleButton1.setText("Reg Teacher");
        getContentPane().add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Library.jpg"))); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbuttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuttonAddActionPerformed
        // TODO add your handling code here:
        String username, pass_word, department, email, uid, usernamedb;
        int temp=0;
        
        username = uname.getText();
        pass_word = pwrd.getText();
        department = dept.getText();
        email = Email.getText();
        uid = UID.getText();
        try{
                if(username.isEmpty())
                {
                JOptionPane.showMessageDialog(this,"Please fill up both text field to register");
                }
                else
                {
                insert = con1.prepareStatement("insert into teacher_profile(uni_id,username,email) values(?,?,?)");
                insert.setString(1, uid);
                insert.setString(2, username);
                insert.setString(3, email);
                insert = con1.prepareStatement("insert into teacher_info(username,pass_word) values(?,?)");
                insert.setString(1, username);
                insert.setString(2, pass_word);
    
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
                }
    }//GEN-LAST:event_jbuttonAddActionPerformed

    private void jbuttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuttonDeleteActionPerformed
        // TODO add your handling code here:
        javax.swing.table.DefaultTableModel df = (javax.swing.table.DefaultTableModel) jTable2.getModel();
        int selectIndex = jTable2.getSelectedRow();
        int id = Integer.parseInt(df.getValueAt(selectIndex,0).toString());
        
        String username,password,department,email,uni_id;
        username = uname.getText();
        password = pwrd.getText();
        department = dept.getText();
        email = Email.getText();
        uni_id = UID.getText();
        
        try{
            delete = con1.prepareStatement("delete from teacher_profile where id=?");
            delete.setInt(1, id);
            int k = delete.executeUpdate();
                
            if(k == 1)
              {
                JOptionPane.showMessageDialog(this,"Data Deleted!");
                  
                uname.setText("");
                pwrd.setText("");
                dept.setText("");
                Email.setText("");
                UID.setText("");
                
                
                table_category();
                jbuttonAdd.setEnabled(true);
              }
              else
                {
                    JOptionPane.showMessageDialog(this,"Error!");
                }
        }catch(SQLException ex){
            System.out.println(ex);
        }
    }//GEN-LAST:event_jbuttonDeleteActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
        javax.swing.table.DefaultTableModel df = (javax.swing.table.DefaultTableModel) jTable2.getModel();
        int selectIndex = jTable2.getSelectedRow();
        int id = Integer.parseInt(df.getValueAt(selectIndex,0).toString());
        uname.setText(df.getValueAt(selectIndex,1).toString());
        pwrd.setText(df.getValueAt(selectIndex,2).toString());
        dept.setText(df.getValueAt(selectIndex,3).toString());
        Email.setText(df.getValueAt(selectIndex,4).toString());
        UID.setText(df.getValueAt(selectIndex,5).toString());
        
        jbuttonAdd.setEnabled(true);
    }//GEN-LAST:event_jTable2MouseClicked

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        this.dispose();
        LibrarianMenu back = new LibrarianMenu();
        back.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(RegStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegTeacher().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Email;
    private javax.swing.JTextField UID;
    private javax.swing.JToggleButton back;
    private javax.swing.JTextField dept;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jbuttonAdd;
    private javax.swing.JToggleButton jbuttonDelete;
    private javax.swing.JTextField pwrd;
    private javax.swing.JTextField uname;
    // End of variables declaration//GEN-END:variables
}
