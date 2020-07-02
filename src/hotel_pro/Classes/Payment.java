package hotel_pro.Classes;

import java.util.ArrayList;


public class Payment {
    
    private Order ordering;
    ArrayList<Order> orders;
    int totalRentPrice;
    
    private boolean hasDiscount;
    private float discount;
    
    int totalBill;
    
    public Payment(Order b)
    {
        ordering = b;
        //totalRentPrice = b.getRoomsFare() * 1;
        
    }


    public boolean isHasDiscount() {
        return hasDiscount;
    }

    public void setHasDiscount(boolean hasDiscount) {
        this.hasDiscount = hasDiscount;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }
    
    
    public int calculateTotalBill()
    {
        int orderTotal = 0;
        
        for(Order order: orders)
        {
            orderTotal += order.getQuantity() * order.getPrice();
        }
        totalBill = orderTotal+ totalRentPrice;
        
        return totalBill;
    }
    
    
    
    
    
}
