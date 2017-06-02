
package moneysaver;


public class LoginWindow extends javax.swing.JFrame {
    
  User user;
    public LoginWindow() {
        initComponents();
        user = new User();
        user.setUser("admin");
        user.setPassword("nimda");
        
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        userText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        passwordText = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        pictureLable = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(564, 438));
        setMinimumSize(new java.awt.Dimension(564, 438));
        setPreferredSize(new java.awt.Dimension(564, 438));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Saving money ");
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(330, 30, 140, 22);
        getContentPane().add(userText);
        userText.setBounds(300, 100, 207, 22);

        jLabel2.setForeground(new java.awt.Color(251, 7, 4));
        jLabel2.setText("Username");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(370, 80, 100, 16);

        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Password");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(370, 140, 58, 16);

        passwordText.setText("jPasswordField1");
        getContentPane().add(passwordText);
        passwordText.setBounds(300, 170, 210, 22);

        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("Login");
        jButton1.setToolTipText("");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(300, 240, 207, 25);

        pictureLable.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Desktop\\1.jpg")); // NOI18N
        pictureLable.setText("jLabel4");
        getContentPane().add(pictureLable);
        pictureLable.setBounds(0, 0, 550, 430);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        String password = String.valueOf(passwordText.getPassword());
        if(user.getUser().equals(userText.getText()) && user.getPassword().equals(password))
        {
            MenuWindow menu = new MenuWindow();
            menu.setAlwaysOnTop(true);
            menu.setVisible(true);
            
            this.setVisible(false);
            
        }
      
    }//GEN-LAST:event_jButton1MouseClicked

    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField passwordText;
    private javax.swing.JLabel pictureLable;
    private javax.swing.JTextField userText;
    // End of variables declaration//GEN-END:variables
}
