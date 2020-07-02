package hotel_pro.DatabaseOperation;


import hotel_pro.Classes.Order;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class BookingDb {

    Connection conn;
    PreparedStatement statement = null;
    ResultSet result = null;

    public BookingDb() {
        conn = DataBaseConnection.connectTODB();        
    }
   
    public void insertOrder(Order order) {
        try {

            String insertOrder = "INSERT INTO orderItem(booking_id,item_food,price,quantity,total)"+"VALUES('" + order.getBookingId() + "','" + order.getFoodItem() + "','" + order.getPrice() + "','" + order.getQuantity() + "','" + order.getTotal() + "')";

            statement = conn.prepareStatement(insertOrder);
            System.out.println(">>>>>>>>>> " + insertOrder);
            statement.execute();

            JOptionPane.showMessageDialog(null, "successfully inserted a new Order");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString() + "\n" + "Order Failed");
        } finally {
            flushStatementOnly();
        }

    }

    
    public ResultSet getABooking(int bookingId) {
        try {
//            String query = "select * from booking where booking_id = " + bookingId;
//            String query = "select * from orderItem where booking_id='"+bookingId+"'";
             String query = "select booking_id from orderItem";
            statement = conn.prepareStatement(query);
            result = statement.executeQuery();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString() + "\n error coming from returning A booking DB Operation");
        }

        return result;
    }
    
    public ResultSet getAllPaymentInfo(int bookingId)
    {
        try {
//String sql="select * from userreg where username='"+unm+"' and password='"+pwd+"'";
//            String query = "select * from orderItem where booking_id=" + bookingId;
            String query = "select * from orderItem where booking_id='"+bookingId+"'";
            System.out.println(query);
            statement = conn.prepareStatement(query);
            result = statement.executeQuery();
          
           // flushAll();
            
          } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString() + "\n error coming from returning payment getAllPaymentInfo,bookingDB");
        }
        return result;
    }
public ResultSet bookingsReadyForOrder() {
        try {
           // flushAll();
//            String query = "select * from orderItem where booking_id='"+bookingId+"'";
//            String query = "select booking_id,booking_room,name from booking join userInfo on booking.customer_id = userInfo.user_id where booking_room like '%" + roomName + "%' and has_checked_out = 0 order by booking_id desc";
            String query = "select booking_id from orderItem";
            System.out.println(query);
            statement = conn.prepareStatement(query);
            result = statement.executeQuery();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString() + "\n error coming from returning bookingsReadyForOrder method,BookingDb");
        }

        return result;
    }
    public void flushAll() {
        {
            try {
                statement.close();
                result.close();
            } catch (SQLException ex) {
                System.err.print(ex.toString() + " >> CLOSING DB");
            }
        }
    }

    public void flushStatementOnly() {
        {
            try {
                statement.close();
                //conn.close();
            } catch (SQLException ex) {
                System.err.print(ex.toString() + " >> CLOSING DB");
            }
        }
    }

    
}
