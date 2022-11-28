
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Gesa Rizky Nugraha
 */
public class Framepenjualan extends javax.swing.JFrame {

    /**
     * Creates new form Framepenjualan
     */
    public Framepenjualan() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        inputbeli = new javax.swing.JTextField();
        inputjual = new javax.swing.JTextField();
        inputjumlah = new javax.swing.JTextField();
        outputuntunit = new javax.swing.JTextField();
        outputtotunt = new javax.swing.JTextField();
        outputperse = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("KALKULATOR PERSENTASE KEUNTUNGAN JUAL BELI");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Isikan harga beli, harga jual dan jumlah barang ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Harga Beli Satuan (Rp)");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Harga Jual Satuan (Rp)");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Jumlah Barang");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Hasilnya :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Keuntungan perunit (Rp)");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Total Keuntungan (Rp)");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Persen untung/rugi (%)");

        inputbeli.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inputbeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputbeliActionPerformed(evt);
            }
        });
        inputbeli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputbeliKeyTyped(evt);
            }
        });

        inputjual.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inputjual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputjualActionPerformed(evt);
            }
        });
        inputjual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputjualKeyTyped(evt);
            }
        });

        inputjumlah.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inputjumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputjumlahActionPerformed(evt);
            }
        });
        inputjumlah.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputjumlahKeyTyped(evt);
            }
        });

        outputuntunit.setEditable(false);
        outputuntunit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        outputtotunt.setEditable(false);
        outputtotunt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        outputperse.setEditable(false);
        outputperse.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                            .addComponent(inputbeli, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel9)
                                .addComponent(jLabel8)
                                .addComponent(jLabel7)
                                .addComponent(jLabel5))
                            .addGap(38, 38, 38)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(inputjual, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                                .addComponent(inputjumlah)
                                .addComponent(outputuntunit)
                                .addComponent(outputtotunt)
                                .addComponent(outputperse)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(inputbeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(inputjual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(inputjumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(outputuntunit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(outputtotunt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(outputperse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputbeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputbeliActionPerformed
        // TODO add your handling code here:
        if (inputbeli.getText().equals("") || inputjual.getText().equals("") || inputjumlah.getText().equals("")) {
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "Isi Semua Data");
        } else {
            DecimalFormat df = new DecimalFormat("#.##");
            String teksbeli = inputbeli.getText();
            double inputbeli = Double.parseDouble(teksbeli);
            String teksjual = inputjual.getText();
            double inputjual = Double.parseDouble(teksjual);
            String teksjumlah = inputjumlah.getText();
            double inputjumlah = Double.parseDouble(teksjumlah);
            double hasiluntung = inputjual - inputbeli;
            String outputhasiluntung = df.format(hasiluntung);
            outputuntunit.setText(outputhasiluntung);
            double hasiltotuntung = hasiluntung * inputjumlah;
            String outputhasiltotal = df.format(hasiltotuntung);
            outputtotunt.setText(outputhasiltotal);
            double hasilpersenuntung = hasiluntung / inputbeli * 100;
            String outputhasilpersen = df.format(hasilpersenuntung);
            outputperse.setText(outputhasilpersen);
        }
    }//GEN-LAST:event_inputbeliActionPerformed

    private void inputjualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputjualActionPerformed
        // TODO add your handling code here:
        if (inputbeli.getText().equals("") || inputjual.getText().equals("") || inputjumlah.getText().equals("")) {
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "Isi Semua Data");
        } else {
            DecimalFormat df = new DecimalFormat("#.##");
            String teksbeli = inputbeli.getText();
            double inputbeli = Double.parseDouble(teksbeli);
            String teksjual = inputjual.getText();
            double inputjual = Double.parseDouble(teksjual);
            String teksjumlah = inputjumlah.getText();
            double inputjumlah = Double.parseDouble(teksjumlah);
            double hasiluntung = inputjual - inputbeli;
            String outputhasiluntung = df.format(hasiluntung);
            outputuntunit.setText(outputhasiluntung);
            double hasiltotuntung = hasiluntung * inputjumlah;
            String outputhasiltotal = df.format(hasiltotuntung);
            outputtotunt.setText(outputhasiltotal);
            double hasilpersenuntung = hasiluntung / inputbeli * 100;
            String outputhasilpersen = df.format(hasilpersenuntung);
            outputperse.setText(outputhasilpersen);
        }
    }//GEN-LAST:event_inputjualActionPerformed

    private void inputjumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputjumlahActionPerformed
        // TODO add your handling code here:
        if (inputbeli.getText().equals("") || inputjual.getText().equals("") || inputjumlah.getText().equals("")) {
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "Isi Semua Data");
        } else {
            DecimalFormat df = new DecimalFormat("#.##");
            String teksbeli = inputbeli.getText();
            double inputbeli = Double.parseDouble(teksbeli);
            String teksjual = inputjual.getText();
            double inputjual = Double.parseDouble(teksjual);
            String teksjumlah = inputjumlah.getText();
            double inputjumlah = Double.parseDouble(teksjumlah);
            double hasiluntung = inputjual - inputbeli;
            String outputhasiluntung = df.format(hasiluntung);
            outputuntunit.setText(outputhasiluntung);
            double hasiltotuntung = hasiluntung * inputjumlah;
            String outputhasiltotal = df.format(hasiltotuntung);
            outputtotunt.setText(outputhasiltotal);
            double hasilpersenuntung = hasiluntung / inputbeli * 100;
            String outputhasilpersen = df.format(hasilpersenuntung);
            outputperse.setText(outputhasilpersen);
        }
    }//GEN-LAST:event_inputjumlahActionPerformed

    private void inputbeliKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputbeliKeyTyped
        // TODO add your handling code here:
        char karakter = evt.getKeyChar();
        if (!(((karakter >= '0') && (karakter <= '9') || (karakter == KeyEvent.VK_BACK_SPACE) || (karakter == KeyEvent.VK_DELETE) || (karakter == '.')))) {
            evt.consume();
        }
    }//GEN-LAST:event_inputbeliKeyTyped

    private void inputjualKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputjualKeyTyped
        // TODO add your handling code here:
        char karakter = evt.getKeyChar();
        if (!(((karakter >= '0') && (karakter <= '9') || (karakter == KeyEvent.VK_BACK_SPACE) || (karakter == KeyEvent.VK_DELETE) || (karakter == '.')))) {
            evt.consume();
        }
    }//GEN-LAST:event_inputjualKeyTyped

    private void inputjumlahKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputjumlahKeyTyped
        // TODO add your handling code here:
        char karakter = evt.getKeyChar();
        if (!(((karakter >= '0') && (karakter <= '9') || (karakter == KeyEvent.VK_BACK_SPACE) || (karakter == KeyEvent.VK_DELETE) || (karakter == '.')))) {
            evt.consume();
        }
    }//GEN-LAST:event_inputjumlahKeyTyped

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
            java.util.logging.Logger.getLogger(Framepenjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Framepenjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Framepenjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Framepenjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Framepenjualan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField inputbeli;
    private javax.swing.JTextField inputjual;
    private javax.swing.JTextField inputjumlah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField outputperse;
    private javax.swing.JTextField outputtotunt;
    private javax.swing.JTextField outputuntunit;
    // End of variables declaration//GEN-END:variables
}
