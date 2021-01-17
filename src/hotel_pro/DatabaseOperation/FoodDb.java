
package hotel_pro.DatabaseOperation;

import hotel_pro.Classes.Food;
import hotel_pro.UI.FoodEntity;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class FoodDb {
    
    Connection conn = DataBaseConnection.connectTODB();
    PreparedStatement statement = null;
    ResultSet result = null;
    
     public void insertFood(Food food) {
        try {
            

               String insertFood ="INSERT INTO food(name,price)"+"VALUES ('"+ food.getName() +"','"+ food.getPrice() +"')";
 

            
            statement = conn.prepareStatement(insertFood);

            statement.execute();

            JOptionPane.showMessageDialog(null, "successfully inserted a new Food Type");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString() + "\n" + "InsertQuery of Food Failed");
        }
        finally
        {
            flushStatmentOnly();
        }
    }
     
     public List<FoodEntity> getFoodItems() {
        List<FoodEntity> foodItems = new ArrayList<>();

        try {
            String query = "select * from food";
            statement = conn.prepareStatement(query);
            result = statement.executeQuery();
            while(result.next()){
                FoodEntity foodEntity = new FoodEntity(
                        result.getInt("food_id"),
                        result.getString("name"),
                        result.getDouble("price"));
                foodItems.add(foodEntity);
            }
            result.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString() + "\n error coming from returning all food DB Operation");
        }
        return foodItems;
    }

    public ResultSet getFoods() {
        try {
            String query = "select * from food";
            statement = conn.prepareStatement(query);
            result = statement.executeQuery();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString() + "\n error coming from returning all food DB Operation");
        }
        

        return result;
    }

    public void updateFood(Food food) {
        try {
            String updateFood = "update food set name= '" + food.getName() + "', price= " + food.getPrice() + " where food_id = " + food.getFood_id();

            
            statement = conn.prepareStatement(updateFood);

            statement.execute();

            JOptionPane.showMessageDialog(null, "successfully updateFood ");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString() + "\n" + "updateFood of Food Failed");
        }
        finally
        {
            flushStatmentOnly();
        }
    }

    public void deleteFood(int foodId) {
        try {
            String deleteQuery = "delete from food where food_id=" + foodId;
            statement = conn.prepareStatement(deleteQuery);
            statement.execute();
            JOptionPane.showMessageDialog(null, "Deleted food");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString() + "\n" + "Delete query FOod Failed");
        }
        finally
        {
            flushStatmentOnly();
        }

    }
    
    public void flushAll()
    {
        {
                        try
                        {
                            statement.close();
                            result.close();
                        }
                        catch(SQLException ex)
                        {System.err.print(ex.toString()+" >> CLOSING DB");}
                    }
    }
    
    private void flushStatmentOnly()
    {
        {
                        try
                        {
                            statement.close();
                        }
                        catch(SQLException ex)
                        {System.err.print(ex.toString()+" >> CLOSING DB");}
                    }
    }
    
}
