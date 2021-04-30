/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MyPc1
 */
public class MENU_PAGE extends javax.swing.JFrame {

    /**
     * Creates new form MENU_PAGE
     */
    public MENU_PAGE() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        billing = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        burger = new javax.swing.JCheckBox();
        jLabel16 = new javax.swing.JLabel();
        pizza = new javax.swing.JCheckBox();
        noodles = new javax.swing.JCheckBox();
        masaladosa = new javax.swing.JCheckBox();
        paavbhaji = new javax.swing.JCheckBox();
        vadapaav = new javax.swing.JCheckBox();
        samosa = new javax.swing.JCheckBox();
        kachori = new javax.swing.JCheckBox();
        kandapoha = new javax.swing.JCheckBox();
        coffee = new javax.swing.JCheckBox();
        tea = new javax.swing.JCheckBox();
        result = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        next = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENU_PAGE");
        getContentPane().setLayout(null);

        billing.setBackground(new java.awt.Color(255, 255, 255));
        billing.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        billing.setText("PROCEED FOR BILLING");
        billing.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        billing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billingActionPerformed(evt);
            }
        });
        getContentPane().add(billing);
        billing.setBounds(220, 450, 220, 40);

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("         Rs. 15");
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel9);
        jLabel9.setBounds(400, 220, 150, 23);

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("         Rs. 35");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel10);
        jLabel10.setBounds(400, 250, 150, 23);

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("         Rs. 80");
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel11);
        jLabel11.setBounds(400, 280, 150, 23);

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("         Rs. 80");
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel12);
        jLabel12.setBounds(400, 310, 150, 23);

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("         Rs. 70");
        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel13);
        jLabel13.setBounds(400, 340, 150, 23);

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("   Rs. 60");
        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel14);
        jLabel14.setBounds(400, 400, 150, 23);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel3.setText("  FOOD ITEM");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 60, 170, 30);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel4.setText("  PRICE");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel4);
        jLabel4.setBounds(400, 60, 150, 30);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("         Rs. 15");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel8);
        jLabel8.setBounds(400, 190, 150, 23);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("         Rs. 30");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel7);
        jLabel7.setBounds(400, 160, 150, 23);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("         Rs. 30");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel6);
        jLabel6.setBounds(400, 130, 150, 23);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("         Rs. 25");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel5);
        jLabel5.setBounds(400, 100, 150, 23);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("          Welcome User ,Please Select Your Desired Food Stuff From The Menu Below");
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 0, 720, 40);

        burger.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        burger.setText("BURGER");
        burger.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        burger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                burgerActionPerformed(evt);
            }
        });
        getContentPane().add(burger);
        burger.setBounds(60, 400, 170, 19);

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("   Rs. 110");
        jLabel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel16);
        jLabel16.setBounds(400, 370, 150, 23);

        pizza.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        pizza.setText("PIZZA");
        pizza.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(pizza);
        pizza.setBounds(60, 370, 170, 19);

        noodles.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        noodles.setText("NOODLES");
        noodles.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(noodles);
        noodles.setBounds(60, 340, 170, 19);

        masaladosa.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        masaladosa.setText("MASALA DOSA");
        masaladosa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(masaladosa);
        masaladosa.setBounds(60, 310, 170, 19);

        paavbhaji.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        paavbhaji.setText("PAAV BHAJI");
        paavbhaji.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(paavbhaji);
        paavbhaji.setBounds(60, 280, 170, 19);

        vadapaav.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        vadapaav.setText("VADA PAAV");
        vadapaav.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(vadapaav);
        vadapaav.setBounds(60, 250, 170, 19);

        samosa.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        samosa.setText("SAMOSA");
        samosa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(samosa);
        samosa.setBounds(60, 220, 170, 19);

        kachori.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        kachori.setText("KACHORI");
        kachori.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(kachori);
        kachori.setBounds(60, 190, 170, 19);

        kandapoha.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        kandapoha.setText("KANDA POHA");
        kandapoha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(kandapoha);
        kandapoha.setBounds(60, 160, 170, 19);

        coffee.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        coffee.setText("COFFEE");
        coffee.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(coffee);
        coffee.setBounds(60, 130, 170, 19);

        tea.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tea.setText("TEA");
        tea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(tea);
        tea.setBounds(60, 100, 170, 23);

        result.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(result);
        result.setBounds(380, 520, 150, 30);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Your Total Amount");
        jLabel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel15);
        jLabel15.setBounds(120, 520, 240, 30);

        next.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        next.setText("NEXT");
        next.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });
        getContentPane().add(next);
        next.setBounds(600, 570, 90, 25);

        jLabel17.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("** Do Remember This Amount As It Will Be Needed On BILL PAGE As Well **");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(30, 604, 680, 20);

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu_image.jpg"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 720, 640);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void billingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billingActionPerformed
 int amount=0;
if(tea.isSelected())
    amount=amount+25;
if(coffee.isSelected())
    amount=amount+30;
if(kandapoha.isSelected())
    amount=amount+30;
if(kachori.isSelected())
    amount=amount+15;
if(samosa.isSelected())
    amount=amount+15;
if(vadapaav.isSelected())
    amount=amount+35;
if(paavbhaji.isSelected())
    amount=amount+80;
if(masaladosa.isSelected())
    amount=amount+80;
if(noodles.isSelected())
    amount=amount+70;
if(pizza.isSelected())
    amount=amount+110;
if(burger.isSelected())
    amount=amount+60;
result.setText(Integer.toString(amount));
    }//GEN-LAST:event_billingActionPerformed

    private void burgerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_burgerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_burgerActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
 new BILL_PAGE().setVisible(true);
 this.dispose();
    }//GEN-LAST:event_nextActionPerformed

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
            java.util.logging.Logger.getLogger(MENU_PAGE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MENU_PAGE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MENU_PAGE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MENU_PAGE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MENU_PAGE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton billing;
    private javax.swing.JCheckBox burger;
    private javax.swing.JCheckBox coffee;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JCheckBox kachori;
    private javax.swing.JCheckBox kandapoha;
    private javax.swing.JCheckBox masaladosa;
    private javax.swing.JButton next;
    private javax.swing.JCheckBox noodles;
    private javax.swing.JCheckBox paavbhaji;
    private javax.swing.JCheckBox pizza;
    private javax.swing.JTextField result;
    private javax.swing.JCheckBox samosa;
    private javax.swing.JCheckBox tea;
    private javax.swing.JCheckBox vadapaav;
    // End of variables declaration//GEN-END:variables
}
