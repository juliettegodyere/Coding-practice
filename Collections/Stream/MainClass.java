package Collections.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MainClass {
    public static void main(String[] args){
        Employees employees1 = new Employees(1, "Mabel", 25, 59000);
        Employees employees2 = new Employees(2, "Frank", 35, 49000);
        Employees employees3 = new Employees(3, "Grace", 18, 40000);
        Employees employees4 = new Employees(4, "Grace", 18, 40000);

        List<Employees> list = new ArrayList<>();
        list.add(employees1);
        list.add(employees2);
        list.add(employees3);
        list.add(employees4);

        //list.stream().forEach((l) -> System.out.println(l));
        // list.stream()
        // .filter((a) -> a.getAge() > 20)
        // .map((m) -> m.getName())
        // .forEach((l) -> System.out.println(l));
       // boolean alMatch = list.stream().allMatch((b) -> b.getAge() > 30);
       //long count = list.stream().count();
       //List<Employees> list2 = list.stream().distinct().collect(Collectors.toList());
       Optional<Integer> min = list.stream()
       .map((a) -> a.getAge())
       .min((a, b) -> a.compareTo(b));
        System.out.println(min.get());
    }
}
