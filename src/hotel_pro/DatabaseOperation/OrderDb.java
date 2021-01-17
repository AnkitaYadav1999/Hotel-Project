package hotel_pro.DatabaseOperation;

import hotel_pro.Classes.Order;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class OrderDb {

    private static Connection conn = DataBaseConnection.connectTODB();
    private static final String INSER_ORDER_QUERY = "insert into `order_item` values(?, ?, ?, ?, ?)";

    public static void insertOrder(int newOrderId, String currentTime, int id, int itemQuantity, float itemTotal) {
        PreparedStatement insertOrderStatement = null;
        try {
            insertOrderStatement = conn.prepareStatement(INSER_ORDER_QUERY);
            insertOrderStatement.setInt(1, newOrderId);
            insertOrderStatement.setString(2, currentTime);
            insertOrderStatement.setInt(3, id);
            insertOrderStatement.setInt(4, itemQuantity);
            insertOrderStatement.setFloat(5, itemTotal);
            insertOrderStatement.executeUpdate();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.toString() + "\n" + "Order Failed");
        } finally {
            flushStatmentOnly(insertOrderStatement);
        }

    }

    public static int getOrderId() {
        Statement statement = null;
        try {
            String orderCountQuery = "SELECT count(distinct `order_id`) as `newOrderId` FROM `order_item`;";
            statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(orderCountQuery);
            resultSet.next();
            int count = resultSet.getInt("newOrderId");
            return count + 1;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Unabled to get order count, error: " + ex.getMessage());
        } finally {
            flushStatmentOnly(statement);
        }
        return 0;
    }
    
    
    public static int getDate1() {
        Statement statement = null;
        try {
            String orderCountQuery = "SELECT count(distinct `order_date`) as `newDate` FROM `order_item`;";
            statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(orderCountQuery);
            resultSet.next();
            int count = resultSet.getInt("newDate");
            return count + 1;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Unabled to get order count, error: " + ex.getMessage());
        } finally {
            flushStatmentOnly(statement);
        }
        return 0;
    }

    public static void flushAll(Statement statement, ResultSet resultSet) {
        {
            try {
                statement.close();
                resultSet.close();
            } catch (SQLException ex) {
                System.err.print(ex.toString() + " >> CLOSING DB");
            }
        }
    }

    private static void flushStatmentOnly(Statement statement) {
        {
            try {
                statement.close();
            } catch (SQLException ex) {
                System.err.print(ex.toString() + " >> CLOSING DB");
            }
        }
    }

}
