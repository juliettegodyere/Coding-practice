package Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/**
 * https://www.hackerrank.com/challenges/jim-and-the-orders/problem?isFullScreen=true
 */

public class JimBurger {
    public static List<Integer> jimOrders(List<List<Integer>> orders) {
    // Write your code here
     List<Burger> activities = new ArrayList<>();
     List<Integer> res = new ArrayList<>();
     int n = orders.size();
     for(int i = 0; i < n; i++){
         //System.out.println(orders.get(i));
         //System.out.println(orders.get(i).get(0));
         //System.out.println(orders.get(i).get(1));
         int delivery = orders.get(i).get(0) + orders.get(i).get(1);
        activities.add(new Burger(orders.get(i).get(0), orders.get(i).get(1), delivery, i+1));
     }
     System.out.println(activities);
     Collections.sort(activities, (a1, a2) -> a1.getDeliveryTime() - a2.getDeliveryTime());
     System.out.println(activities);
     for(int i = 0; i < activities.size(); i++){
         res.add(activities.get(i).getCustomer());
     }
     System.out.println(res);
     return res;
    }

    public static void main(String[] args)
     {
        List<List<Integer>> orders = new ArrayList<>();

        // Create inner lists and add them to the outer list
        orders.add(Arrays.asList(1, 3));
        orders.add(Arrays.asList(2, 3));
        orders.add(Arrays.asList(3, 3));
        int n = orders.size();
  
         System.out.println(jimOrders(orders));
     }
}
class Burger{
    private int customer;
    private int order;
    private int prep;
    private int delivery_time;
    
    public Burger(int order, int prep, int delivery_time, int customer){
        this.order = order;
        this.prep = prep;
        this.delivery_time = delivery_time;
        this.customer = customer;
    }
    
    public int getOrder(){
        return order;
    }
    public int getPrep(){
        return prep;
    }
    public int getDeliveryTime(){
        return delivery_time;
    }
    public int getCustomer(){
        return customer;
    }
    @Override
    public String toString() {
        return "{" +
            " order ='" + getOrder() + "'" +
            ", prep='" + getPrep() + "'" +
            ", delivery time ='" + getDeliveryTime() + "'" +
            ", customer ='" + getCustomer() + "'" +
            "}";
    }
}