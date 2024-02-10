package Collections;

import java.util.ArrayList;

import java.util.List;
//https://www.youtube.com/watch?v=9tBxJoQF74E
public class MultiDimentionalArralist {
    
    public static void main(String[] args){
        List<ArrayList<String>> groceryList = new ArrayList<>();

        ArrayList<String> foodList = new ArrayList<>();
        foodList.add("Rice");
        foodList.add("Beans");
        foodList.add("Fufu");

        ArrayList<String> drinkList = new ArrayList<>();
        drinkList.add("Soda");
        drinkList.add("Coffee");

        ArrayList<String> meatList = new ArrayList<>();
       meatList.add("Pork");
       meatList.add("Chicken");
       meatList.add("Turkey");

       groceryList.add(foodList);
       groceryList.add(drinkList);
       groceryList.add(meatList);
       System.out.println(groceryList);

       groceryList.stream()
                .flatMap((list) -> list.stream()) // Flatten each list into a stream
                .forEach(System.out::println); // Print each element

    }
}
