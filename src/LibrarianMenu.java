/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IFTI
 */
public class LibrarianMenu extends javax.swing.JFrame {

    /**
     * Creates new form LibrarianMenu
     */
    public LibrarianMenu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Publishers = new javax.swing.JToggleButton();
        Books = new javax.swing.JToggleButton();
        Author = new javax.swing.JToggleButton();
        IssueBook = new javax.swing.JToggleButton();
        StudentList = new javax.swing.JToggleButton();
        Category = new javax.swing.JToggleButton();
        TeachersList = new javax.swing.JToggleButton();
        ReturnBook = new javax.swing.JToggleButton();
        Logout = new javax.swing.JToggleButton();
        RegStudents = new javax.swing.JToggleButton();
        RegTeacher = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1000, 650));
        setPreferredSize(new java.awt.Dimension(1000, 650));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Publishers.setBackground(new java.awt.Color(255, 255, 255));
        Publishers.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        Publishers.setIcon(new javax.swing.ImageIcon("C:\\Users\\IFTI\\Documents\\Icons\\Publishers.jpg")); // NOI18N
        Publishers.setText("Publishers");
        Publishers.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Publishers.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Publishers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PublishersActionPerformed(evt);
            }
        });
        getContentPane().add(Publishers, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 300, 110));

        Books.setBackground(new java.awt.Color(255, 255, 255));
        Books.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        Books.setIcon(new javax.swing.ImageIcon("C:\\Users\\IFTI\\Documents\\Icons\\Book.jpg")); // NOI18N
        Books.setText("Books");
        Books.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Books.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Books.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BooksActionPerformed(evt);
            }
        });
        getContentPane().add(Books, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 300, 110));

        Author.setBackground(new java.awt.Color(255, 255, 255));
        Author.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        Author.setIcon(new javax.swing.ImageIcon("C:\\Users\\IFTI\\Documents\\Icons\\Author.jpg")); // NOI18N
        Author.setText("Author");
        Author.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Author.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Author.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AuthorActionPerformed(evt);
            }
        });
        getContentPane().add(Author, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 300, 110));

        IssueBook.setBackground(new java.awt.Color(255, 255, 255));
        IssueBook.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        IssueBook.setIcon(new javax.swing.ImageIcon("C:\\Users\\IFTI\\Documents\\Icons\\IssueBook.jpg")); // NOI18N
        IssueBook.setText("Issue Book");
        IssueBook.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        IssueBook.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        IssueBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IssueBookActionPerformed(evt);
            }
        });
        getContentPane().add(IssueBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 300, 110));

        StudentList.setBackground(new java.awt.Color(255, 255, 255));
        StudentList.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        StudentList.setIcon(new javax.swing.ImageIcon("C:\\Users\\IFTI\\Documents\\Icons\\Student.jpg")); // NOI18N
        StudentList.setText("Students List");
        StudentList.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        StudentList.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        StudentList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentListActionPerformed(evt);
            }
        });
        getContentPane().add(StudentList, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 40, 300, 110));

        Category.setBackground(new java.awt.Color(255, 255, 255));
        Category.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        Category.setIcon(new javax.swing.ImageIcon("C:\\Users\\IFTI\\Documents\\Icons\\Category.jpg")); // NOI18N
        Category.setText("Category");
        Category.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Category.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Category.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoryActionPerformed(evt);
            }
        });
        getContentPane().add(Category, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 300, 110));

        TeachersList.setBackground(new java.awt.Color(255, 255, 255));
        TeachersList.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        TeachersList.setIcon(new javax.swing.ImageIcon("C:\\Users\\IFTI\\Documents\\Icons\\Teacher.jpg")); // NOI18N
        TeachersList.setText("Teachers List");
        TeachersList.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TeachersList.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        TeachersList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TeachersListActionPerformed(evt);
            }
        });
        getContentPane().add(TeachersList, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 280, 300, 110));

        ReturnBook.setBackground(new java.awt.Color(255, 255, 255));
        ReturnBook.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        ReturnBook.setIcon(new javax.swing.ImageIcon("C:\\Users\\IFTI\\Documents\\Icons\\ReturnBook.jpg")); // NOI18N
        ReturnBook.setText("Return Book");
        ReturnBook.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ReturnBook.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        ReturnBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnBookActionPerformed(evt);
            }
        });
        getContentPane().add(ReturnBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, 300, 110));

        Logout.setBackground(new java.awt.Color(255, 255, 255));
        Logout.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        Logout.setText("Log Out");
        Logout.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });
        getContentPane().add(Logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 560, 210, 50));

        RegStudents.setBackground(new java.awt.Color(255, 255, 255));
        RegStudents.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        RegStudents.setIcon(new javax.swing.ImageIcon("C:\\Users\\IFTI\\Documents\\Icons\\StudentApproval.jpg")); // NOI18N
        RegStudents.setText("Reg Students");
        RegStudents.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        RegStudents.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        RegStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegStudentsActionPerformed(evt);
            }
        });
        getContentPane().add(RegStudents, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 160, 300, 110));

        RegTeacher.setBackground(new java.awt.Color(255, 255, 255));
        RegTeacher.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        RegTeacher.setIcon(new javax.swing.ImageIcon("C:\\Users\\IFTI\\Documents\\Icons\\TeacherApproval.jpg")); // NOI18N
        RegTeacher.setText("Reg Teachers");
        RegTeacher.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        RegTeacher.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        RegTeacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegTeacherActionPerformed(evt);
            }
        });
        getContentPane().add(RegTeacher, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 410, 300, 110));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Library.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PublishersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PublishersActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Publisher publisher = new Publisher();
        publisher.setVisible(true);
    }//GEN-LAST:event_PublishersActionPerformed

    private void BooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BooksActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Books books = new Books();
        books.setVisible(true); 
    }//GEN-LAST:event_BooksActionPerformed

    private void AuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AuthorActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Author author = new Author();
        author.setVisible(true); 
    }//GEN-LAST:event_AuthorActionPerformed

    private void IssueBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IssueBookActionPerformed
        // TODO add your handling code here:
        this.dispose();
        IssueBook ibooks = new IssueBook();
        ibooks.setVisible(true);
    }//GEN-LAST:event_IssueBookActionPerformed

    private void StudentListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentListActionPerformed
        // TODO add your handling code here:
        this.dispose();
        StudentList slist = new StudentList();
        slist.setVisible(true);
    }//GEN-LAST:event_StudentListActionPerformed

    private void CategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoryActionPerformed
        this.dispose();
        Category category = new Category();
        category.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_CategoryActionPerformed

    private void TeachersListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TeachersListActionPerformed
        // TODO add your handling code here:
        this.dispose();
        TeacherList tlist = new TeacherList();
        tlist.setVisible(true);
    }//GEN-LAST:event_TeachersListActionPerformed

    private void ReturnBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnBookActionPerformed
        // TODO add your handling code here:
        this.dispose();
        ReturnBook rbooks = new ReturnBook();
        rbooks.setVisible(true);
        
    }//GEN-LAST:event_ReturnBookActionPerformed

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        // TODO add your handling code here:
        this.dispose();
    Login login = new Login();
    login.setVisible(true); 
    }//GEN-LAST:event_LogoutActionPerformed

    private void RegStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegStudentsActionPerformed
        // TODO add your handling code here:
        this.dispose();
    RegStudent rstudent = new RegStudent();
    rstudent.setVisible(true);
    }//GEN-LAST:event_RegStudentsActionPerformed

    private void RegTeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegTeacherActionPerformed
        // TODO add your handling code here:
        this.dispose();
    RegTeacher rteacher = new RegTeacher();
    rteacher.setVisible(true);
    }//GEN-LAST:event_RegTeacherActionPerformed

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
            java.util.logging.Logger.getLogger(LibrarianMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LibrarianMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LibrarianMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LibrarianMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LibrarianMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Author;
    private javax.swing.JToggleButton Books;
    private javax.swing.JToggleButton Category;
    private javax.swing.JToggleButton IssueBook;
    private javax.swing.JToggleButton Logout;
    private javax.swing.JToggleButton Publishers;
    private javax.swing.JToggleButton RegStudents;
    private javax.swing.JToggleButton RegTeacher;
    private javax.swing.JToggleButton ReturnBook;
    private javax.swing.JToggleButton StudentList;
    private javax.swing.JToggleButton TeachersList;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}