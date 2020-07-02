/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel_pro.UI;

import hotel_pro.Classes.Order;
import hotel_pro.DatabaseOperation.BookingDb;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.print.PrinterException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Vector;
import java.util.concurrent.TimeUnit;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.text.JTextComponent;
import net.proteanit.sql.DbUtils;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author Faysal
 */
public final class PaymentPanel extends javax.swing.JDialog {

    /**
     * Creates new form PaymentPanel
     */
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    LocalDateTime now= LocalDateTime.now();
    String dat =dtf.format(now);
    
    BookingDb bookingdB = new BookingDb();
    Vector<String> bookingList = new Vector();
    //OrderDb orderDb = new OrderDb();
    int bookingId = 0;
    ResultSet result;

    public PaymentPanel(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        searchHelper();
        AutoCompleteDecorator.decorate(combo_booking);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        combo_booking = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_payment = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        tf_total = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 677));

        combo_booking.setEditable(true);
        combo_booking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_bookingActionPerformed(evt);
            }
        });
        combo_booking.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                combo_bookingKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                combo_bookingKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                combo_bookingKeyTyped(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/generate.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        table_payment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        table_payment.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                table_paymentPropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(table_payment);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/meme.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(64, 64, 65));
        jLabel1.setText("Total :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(combo_booking, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tf_total, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(446, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(combo_booking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(227, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (bookingId != -1) {
            result = bookingdB.getAllPaymentInfo(bookingId);
            populatePaymentTable(result);
        } else {
            JOptionPane.showMessageDialog(null, "no booking selected, try to select one hitting enter from suggestion box");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
//            MessageFormat heade = new MessageFormat(dtf.format(now) + "\nPrint Bill");
            MessageFormat header = new MessageFormat("Date:\t"+dtf.format(now) +"\n\n#******\tBill\t**********#\n\n");
//            MessageFormat head = new MessageFormat("Date:\t"+dtf.format(now) +"\n\n#******\tBill\t**********#\n\n");
            MessageFormat footer = new MessageFormat("**\t**\tARS Hotel\t**\t**");

            table_payment.print(JTable.PrintMode.NORMAL, header, footer);
            
        } catch (PrinterException ex) {
            JOptionPane.showMessageDialog(null, "Error printer \n" + ex.toString());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void table_paymentPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_table_paymentPropertyChange
        if (table_payment.getModel().getRowCount() != 0) {
            System.out.println(table_payment.getModel().getRowCount() + " ,,,");
            //updateTotalCheckBox();
            
        }

    }//GEN-LAST:event_table_paymentPropertyChange

    private void combo_bookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_bookingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_bookingActionPerformed

    private void combo_bookingKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_combo_bookingKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_bookingKeyPressed

    private void combo_bookingKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_combo_bookingKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_bookingKeyReleased

    private void combo_bookingKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_combo_bookingKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_bookingKeyTyped

    private void updateTotalCheckBox() {
        int total = 0;
        int rows = table_payment.getRowCount();
        //int selectedUserId = (int) table_customer.getModel().getValueAt(row, 0);

        try {
            for (int i = 0; i < rows; i++) {
                total += (int) table_payment.getModel().getValueAt(i, 5);
            }
            tf_total.setText(total + "");
        } catch (ClassCastException ex) {
            System.err.println("waiting for a int value");
        }

    }

    private void populatePaymentTable(ResultSet result) {

        table_payment.setModel(DbUtils.resultSetToTableModel(result));
    }

    public void bookingComboFill(ResultSet result) {
        bookingList.clear();
        try {

            while (result.next()) {
                
                bookingList.add(result.getString("booking_id"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "bookingCombo fill error");
        }

    }

    public void searchHelper() {
        final DefaultComboBoxModel model = new DefaultComboBoxModel(bookingList);
        combo_booking.setModel(model);

        JTextComponent editor = (JTextComponent) combo_booking.getEditor().getEditorComponent();
        editor.addKeyListener(new KeyAdapter() {

            @Override
            public void keyTyped(KeyEvent evt) {

                if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
                    String details = (String) combo_booking.getSelectedItem();
                    System.out.println(details);
                    bookingId = Integer.parseInt(details);
                 /*   if (!details.contains(",")) {
                        JOptionPane.showMessageDialog(null, "no booking found, try adding a new booking");
                    } else {
                        bookingId = Integer.parseInt(details.substring(details.lastIndexOf(",") + 1));
                        //tf_bookingId.setText(bookinId+"");
                        // A if condition should be here, but not required as the last line has no chance of returning -1.

                    }*/

                }

                /// suggestion generation
                String value = "";
                try {
                    value = combo_booking.getEditor().getItem().toString();
                    System.out.println(value +" <<<<<<<<<<<<<");

                } catch (Exception ex) {
                }
                if (value.length() >= 2) {

                    // System.out.println("working");
                    int value1=Integer.parseInt(value);
                    bookingComboFill(bookingdB.getABooking(value1));
                    // bookingdB.flushAll();
                }

            }
        });
    }

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
            java.util.logging.Logger.getLogger(PaymentPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaymentPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaymentPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaymentPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PaymentPanel dialog = new PaymentPanel(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox combo_booking;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_payment;
    private javax.swing.JTextField tf_total;
    // End of variables declaration//GEN-END:variables

}