/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel_pro.UI;

import hotel_pro.Classes.Order;
import hotel_pro.DatabaseOperation.BookingDb;

import hotel_pro.DatabaseOperation.FoodDb;

import hotel_pro.DatabaseOperation.OrderDb;
import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.print.Book;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.text.JTextComponent;
import net.proteanit.sql.DbUtils;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author Faysal
 */
public class OrderPanel extends javax.swing.JDialog {

    /**
     * Creates new form OrderPanel
     */
    BookingDb db = new BookingDb();
    ResultSet result;
    List<FoodEntity> foodItems = new ArrayList<>();
    FoodDb foodDb = new FoodDb();

    //  OrderDb orderDb = new OrderDb();
    public OrderPanel(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.getContentPane().setBackground(new Color(241, 241, 242));
        searchHelper();
        populateFoodCombobox();
        addItemToOrderBtn.setEnabled(false);
        tf_foodItem.setEditable(false);
        tf_price.setEditable(false);
        tf_total.setEditable(false);
    }

    private void populateFoodCombobox() {
        foodsCmbBx.removeAllItems();
        foodItems = foodDb.getFoodItems();
        foodsCmbBx.addItem("Select your food");
        for (FoodEntity entity : foodItems) {
            foodsCmbBx.addItem(entity.getName());
        }
    }

    public void searchHelper() {

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("hotel?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        bookingQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT b FROM Booking b");
        bookingList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : bookingQuery.getResultList();
        foodQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT f FROM Food f");
        foodList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : foodQuery.getResultList();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        tf_foodItem = new javax.swing.JTextField();
        tf_quantity = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf_price = new javax.swing.JTextField();
        tf_total = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        addItemToOrderBtn = new javax.swing.JButton();
        submitOrderBtn = new javax.swing.JButton();
        foodsCmbBx = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        orderedItems = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        totalLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        totalValueLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 500));
        setSize(new java.awt.Dimension(0, 0));

        jPanel1.setBackground(new java.awt.Color(230, 231, 232));

        tf_quantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_quantityKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_quantityKeyTyped(evt);
            }
        });

        jLabel1.setText("Item/Food");

        jLabel2.setText("Quantity");

        tf_price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_priceKeyTyped(evt);
            }
        });

        jLabel3.setText("Subtotal");

        jLabel4.setText("Rate");

        addItemToOrderBtn.setText("Add");
        addItemToOrderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addItemToOrderBtnActionPerformed(evt);
            }
        });

        submitOrderBtn.setBackground(new java.awt.Color(0, 204, 204));
        submitOrderBtn.setText("Submit Order");
        submitOrderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitOrderBtnActionPerformed(evt);
            }
        });

        foodsCmbBx.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        foodsCmbBx.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                foodsCmbBxItemStateChanged(evt);
            }
        });
        foodsCmbBx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foodsCmbBxActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Add food to your order");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tf_foodItem)
                                .addComponent(tf_quantity)
                                .addComponent(tf_total)
                                .addComponent(tf_price, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(35, 35, 35)
                            .addComponent(addItemToOrderBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                            .addComponent(submitOrderBtn)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(foodsCmbBx, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(foodsCmbBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_foodItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addItemToOrderBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(submitOrderBtn))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        orderedItems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Name", "Rate", "Quantity", "Subtotal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Integer.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        orderedItems.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orderedItemsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(orderedItems);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Items in the order:");

        totalLabel.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        totalLabel.setText("Total");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel7.setText("₹");

        totalValueLabel.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        totalValueLabel.setText("0.00");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(totalLabel)
                        .addGap(94, 94, 94)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalValueLabel))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalLabel)
                    .addComponent(jLabel7)
                    .addComponent(totalValueLabel))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void orderedItemsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderedItemsMouseClicked
        int row = orderedItems.getSelectedRow();
        displayToTextField(row);
    }//GEN-LAST:event_orderedItemsMouseClicked

    private void tf_quantityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_quantityKeyReleased
        try {
            String quantityText = tf_quantity.getText();
            if (quantityText.isEmpty()) {
                addItemToOrderBtn.setEnabled(false);
            } else {
                int quantity = Integer.parseInt(tf_quantity.getText());
                float price = Float.parseFloat(tf_price.getText());

                tf_total.setText(quantity * price + "");
                addItemToOrderBtn.setEnabled(true);
            }
        } catch (Exception ex) {

        }
    }//GEN-LAST:event_tf_quantityKeyReleased

    private void addItemToOrderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addItemToOrderBtnActionPerformed
        String itemName = tf_foodItem.getText();
        Float price = Float.parseFloat(tf_price.getText());
        Integer quantity = Integer.parseInt(tf_quantity.getText());
        Float subTotal = Float.parseFloat(tf_total.getText());

        Object[] orderItem = new Object[]{orderedItems.getRowCount() + 1, itemName, price, quantity, subTotal};
        DefaultTableModel model = (DefaultTableModel) orderedItems.getModel();
        model.addRow(orderItem);

        String totalValeuText = totalValueLabel.getText();
        float totalValue = Float.parseFloat(totalValeuText);
        totalValue = totalValue + subTotal;
        totalValueLabel.setText(totalValue + "");

        tf_foodItem.setText("");
        tf_price.setText("");
        tf_quantity.setText("");
        tf_total.setText("");
        addItemToOrderBtn.setEnabled(false);
        foodsCmbBx.setSelectedIndex(0);
    }//GEN-LAST:event_addItemToOrderBtnActionPerformed

    private void tf_priceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_priceKeyTyped
        char c = evt.getKeyChar();

        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_tf_priceKeyTyped

    private void tf_quantityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_quantityKeyTyped
        char c = evt.getKeyChar();

        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_tf_quantityKeyTyped

    private void foodsCmbBxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foodsCmbBxActionPerformed

    }//GEN-LAST:event_foodsCmbBxActionPerformed

    private void foodsCmbBxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_foodsCmbBxItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            if (foodsCmbBx.getSelectedIndex() > 0) {
                String selectedFoodName = (String) evt.getItem();
                FoodEntity searchFood = searchFood(selectedFoodName);
                tf_foodItem.setText(searchFood.getName());
                tf_price.setText("" + searchFood.getRate());
            }
        }

    }//GEN-LAST:event_foodsCmbBxItemStateChanged

    private void submitOrderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitOrderBtnActionPerformed
        int newOrderId = OrderDb.getOrderId();
        if (newOrderId == 0) {
            return;
        }

        for (int rowNumber = 0; rowNumber < orderedItems.getRowCount(); rowNumber++) {
            DefaultTableModel model = (DefaultTableModel) orderedItems.getModel();
            String itemName = model.getValueAt(rowNumber, 1).toString();
            int itemQuantity = Integer.parseInt(model.getValueAt(rowNumber, 3).toString());
            float itemTotal = Float.parseFloat(model.getValueAt(rowNumber, 4).toString());
            FoodEntity itemEntity = searchFood(itemName);
            String currentTime = ZonedDateTime.now().toString();
            OrderDb.insertOrder(newOrderId, currentTime, itemEntity.getId(), itemQuantity, itemTotal);
        }
        JOptionPane.showMessageDialog(null,
                "Successfully placed your order, order number is " + newOrderId, "Success", JOptionPane.INFORMATION_MESSAGE);
        DefaultTableModel model = (DefaultTableModel) orderedItems.getModel();
        model.setRowCount(0);
    }//GEN-LAST:event_submitOrderBtnActionPerformed

    private FoodEntity searchFood(String selectedFood) {
        for (FoodEntity entity : foodItems) {
            if (selectedFood.equalsIgnoreCase(entity.getName())) {
                return entity;
            }
        }
        return null;
    }

    private void displayToTextField(int row) {
        tf_foodItem.setText(orderedItems.getModel().getValueAt(row, 1) + "");
        tf_price.setText(orderedItems.getModel().getValueAt(row, 2) + "");

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
            java.util.logging.Logger.getLogger(OrderPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                OrderPanel dialog = new OrderPanel(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton addItemToOrderBtn;
    private java.util.List<hotel_pro.UI.Booking> bookingList;
    private javax.persistence.Query bookingQuery;
    private javax.persistence.EntityManager entityManager;
    private java.util.List<hotel_pro.UI.Food> foodList;
    private javax.persistence.Query foodQuery;
    private javax.swing.JComboBox foodsCmbBx;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable orderedItems;
    private javax.swing.JButton submitOrderBtn;
    private javax.swing.JTextField tf_foodItem;
    private javax.swing.JTextField tf_price;
    private javax.swing.JTextField tf_quantity;
    private javax.swing.JTextField tf_total;
    private javax.swing.JLabel totalLabel;
    private javax.swing.JLabel totalValueLabel;
    // End of variables declaration//GEN-END:variables

}
