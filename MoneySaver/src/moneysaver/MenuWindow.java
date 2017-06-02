package moneysaver;

import java.io.*;

public class MenuWindow extends javax.swing.JFrame {

    public MenuWindow() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        incomeText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        outcomeText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        dateText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        saveLable = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(772, 390));
        setMinimumSize(new java.awt.Dimension(772, 380));
        setSize(new java.awt.Dimension(762, 340));
        getContentPane().setLayout(null);
        getContentPane().add(nameText);
        nameText.setBounds(480, 80, 260, 22);

        jLabel1.setText("Name");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(420, 80, 100, 16);
        getContentPane().add(incomeText);
        incomeText.setBounds(480, 120, 260, 22);

        jLabel2.setText("Income");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(420, 120, 90, 16);
        getContentPane().add(outcomeText);
        outcomeText.setBounds(480, 160, 260, 22);

        jLabel3.setText("Outcome");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(420, 160, 100, 16);

        jButton1.setText("Save");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(480, 280, 260, 25);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Menu");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(580, 30, 51, 22);

        jButton2.setText("View profile");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(480, 240, 260, 25);

        dateText.setText("dd/mm/yy");
        dateText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateTextActionPerformed(evt);
            }
        });
        getContentPane().add(dateText);
        dateText.setBounds(480, 200, 260, 22);

        jLabel5.setText("Date");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(420, 200, 80, 16);

        saveLable.setText("Saving");
        getContentPane().add(saveLable);
        saveLable.setBounds(420, 310, 330, 16);

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Desktop\\aaaa.jpg")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 750, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 750, 330);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        Money money = new Money();
        String path = "D://MoneySaver.txt";
        File file = new File(path);
        FileWriter f_write;
        double income = Double.parseDouble(incomeText.getText());
        double outcome = Double.parseDouble(outcomeText.getText());
        double saving;
        money.setName(nameText.getText());
        money.setIncome(income);
        money.setOutcome(outcome);
        money.setDate(dateText.getText());
        saving = income - outcome;
        money.setSaving(saving);
        MoneySaver.moneys.add(money);
        saveLable.setText("Saving : " + saving + " Bath");

        try {
            f_write = new FileWriter(file, true);
            f_write.write("Name : " + money.getName() + "\t" + "Income : " + money.getIncome() + "\t" + "Outcome : " + money.getOutcome() + "\t" + "Date : " + money.getDate() + "\t" + "Saving : " + money.getSaving() + "\r\n");
            f_write.close();

        } catch (IOException e) {
            System.out.println(e);
        }


    }//GEN-LAST:event_jButton1MouseClicked

    private void dateTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateTextActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        ViewProfile view = new ViewProfile();
        view.setAlwaysOnTop(true);
        view.setVisible(true);
    }//GEN-LAST:event_jButton2MouseClicked

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(MenuWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dateText;
    private javax.swing.JTextField incomeText;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nameText;
    private javax.swing.JTextField outcomeText;
    private javax.swing.JLabel saveLable;
    // End of variables declaration//GEN-END:variables
}
