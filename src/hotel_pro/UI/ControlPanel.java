
package hotel_pro.UI;


import hotel_pro.DatabaseOperation.BookingDb;
import hotel_pro.TableModel.CustomCellRenderer;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import javax.swing.text.JTextComponent;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;


public class ControlPanel extends javax.swing.JFrame {

  
    Vector<String> customerList = new Vector();
 
    BookingDb bookingdb = new BookingDb();
    boolean existingCustomer = false;
    
    ResultSet result;

    public ControlPanel() {
        
        initComponents();
       // UIManager.setLookAndFeel(UIManager);
        this.getContentPane().setBackground(new Color(241,241,242));
        
        
        
        
   
       
       

    }



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator7 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        panel_container = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        jButton4 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jButton5 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jSeparator8 = new javax.swing.JToolBar.Separator();
        jButton6 = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        jButton3 = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Welcome To Hotel");

        panel_container.setBackground(new java.awt.Color(241, 241, 242));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel_pro/UI/BN-SE931_201702_G_20170222095044.gif"))); // NOI18N
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jToolBar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 51, 153), new java.awt.Color(0, 0, 255), null, new java.awt.Color(51, 0, 51)));
        jToolBar1.setRollover(true);
        jToolBar1.setBorderPainted(false);
        jToolBar1.add(jSeparator3);

        jButton4.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(204, 0, 0));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/BookingDiary.png"))); // NOI18N
        jButton4.setText("Ordering Diary");
        jButton4.setToolTipText("Order Food");
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setMargin(new java.awt.Insets(2, 15, 15, 14));
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton4);
        jToolBar1.add(jSeparator1);

        jButton5.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(204, 0, 0));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/foods.png"))); // NOI18N
        jButton5.setText("Food");
        jButton5.setFocusable(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setMargin(new java.awt.Insets(2, 15, 15, 14));
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton5);
        jToolBar1.add(jSeparator2);
        jToolBar1.add(jSeparator8);

        jButton6.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(204, 0, 0));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Checkout&Payment.png"))); // NOI18N
        jButton6.setText("Payment");
        jButton6.setFocusable(false);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton6);
        jToolBar1.add(jSeparator6);

        jButton3.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(204, 0, 0));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/LogBook_1.png"))); // NOI18N
        jButton3.setText("Log Book");
        jButton3.setToolTipText("Log Book");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setMargin(new java.awt.Insets(2, 15, 15, 14));
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton3);
        jToolBar1.add(jSeparator4);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel_pro/UI/tenor.gif"))); // NOI18N

        javax.swing.GroupLayout panel_containerLayout = new javax.swing.GroupLayout(panel_container);
        panel_container.setLayout(panel_containerLayout);
        panel_containerLayout.setHorizontalGroup(
            panel_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_containerLayout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addGroup(panel_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(204, Short.MAX_VALUE))
        );
        panel_containerLayout.setVerticalGroup(
            panel_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_containerLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel_containerLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 846, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(panel_container);

        jPanel1.setBackground(new java.awt.Color(0, 0, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1318, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 67, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1318, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // returning true should block the user to execute next processes


     

/*
    private void date_checkInPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_date_checkInPropertyChange
        if (date_checkIn.getDate() != null) {
            try {
                //System.err.println("aise");
                long date = date_checkIn.getDate().getTime() / 1000;
                //System.out.println(">> "+date);
                ResultSet x = db.getAvailableRooms(date);

                DefaultListModel model = new DefaultListModel();

                while (x.next()) {
                    model.addElement(x.getString("room_no"));
                }
                roomsList.setModel(model);

            } catch (SQLException ex) {
                System.err.println("errrrrrrrrrrrr");
            }
        }
    }//GEN-LAST:event_date_checkInPropertyChange
*/
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        PaymentPanel p = new PaymentPanel(this, true);
        p.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        FoodPanel f = new FoodPanel(this, true);
        f.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // true params block the parents to work
        OrderPanel c = new OrderPanel(this, true);
        c.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        LogPanel l = new LogPanel(this, true);
        l.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    







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
            java.util.logging.Logger.getLogger(ControlPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ControlPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ControlPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ControlPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ControlPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JToolBar.Separator jSeparator8;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JPanel panel_container;
    // End of variables declaration//GEN-END:variables
}
