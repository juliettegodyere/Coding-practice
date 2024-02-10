package Sorting;

import java.util.*;

public class ComparableInterfaceNonPrimitive implements Comparable<ComparableInterfaceNonPrimitive>{
    int x, y;
    ComparableInterfaceNonPrimitive(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
    // compareTo() function defining the
    // nature of sorting i.e., according to
    // x-coordinate
    public int compareTo(ComparableInterfaceNonPrimitive P)
    {
        return this.x - P.x;
    }
}
class GfG 
{ 
    public static void main(String[] args) 
    { 
        // Create a list of Integers 
        List<ComparableInterfaceNonPrimitive> list = new ArrayList<ComparableInterfaceNonPrimitive>(); 
        list.add(new ComparableInterfaceNonPrimitive(5, 10)); 
        list.add(new ComparableInterfaceNonPrimitive(2, 20));  
        list.add(new ComparableInterfaceNonPrimitive(10, 30)); 
        
        // List is sorted in the natural order
        Collections.sort(list);
        
        // Displaying the points
        for (ComparableInterfaceNonPrimitive p: list)
            System.out.println(p.x + " " + p.y);
    } 
}
