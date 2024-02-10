package Collections.Collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MainClass {
    public static void main(String[] args){
        Employees employees1 = new Employees(1, "Mabel", 25, 59000);
        Employees employees2 = new Employees(2, "Frank", 35, 49000);
        Employees employees3 = new Employees(3, "Grace", 18, 40000);

        List<Employees> list = new ArrayList<>();
        list.add(employees1);
        list.add(employees2);
        list.add(employees3);

        //list.stream().forEach((l) -> System.out.println(l));
       // double res = list.stream().collect(Collectors.averagingInt(d -> d.getAge()));
       //long count = list.stream().collect(Collectors.counting());
       String nameUpdated = list.stream()
       .map((name) -> name.getName())
       .collect(Collectors.joining("-"));
        System.out.println("Average: " + nameUpdated);
    }
}
