package JavaStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
    
    public static void main(String[] args){
        //Filter 
        List<String> list = Arrays.asList("JAVA", "J2EE", "Spring", "Hibernate");

        List<String> list2 =  list.stream().filter((str) -> str.equals("JAVA")).collect(Collectors.toList());

        // list2.forEach((val) -> System.out.println(val));

        //Map
        Person person = new Person(1, "Juliet Nkwor", (double) 60000);
        Person person2 = new Person(2, "Grace Anazia", (double) 80000);
        Person person3 = new Person(3, "Chibuike Nnabugo", (double) 100000);

        List<Person> personlist = new ArrayList<>();
        personlist.add(person);
        personlist.add(person2);
        personlist.add(person3);

        // personlist.stream().map((m) -> m.getName()).collect(Collectors.toList()).forEach((a) -> System.out.println(a));
        //  personlist.stream().map((m) -> m.getName().toUpperCase()).collect(Collectors.toList()).forEach((a) -> System.out.println(a));

        //MaptoInt,
         List<String> list3 = Arrays.asList("200", "400", "600", "1000", "200");

        // list3.stream().mapToInt((m) -> Integer.valueOf(m)).forEach((f) -> System.out.println(f));
        // list3.stream().mapToLong((m) -> Long.valueOf(m)).forEach((f) -> System.out.println(f));
        // list3.stream().mapToDouble((m) -> Double.valueOf(m)).forEach((f) -> System.out.println(f));

        //Max, Min

        list3.stream()
        .mapToInt(Integer::valueOf)
        .max()
        .ifPresent(System.out::println);

        list3.stream()
        .mapToInt(Integer::valueOf)
        .min()
        .ifPresent(System.out::println);

        //AnyMatch

        boolean result = list3.stream().mapToInt((m) -> Integer.valueOf(m)).allMatch(m -> m > 0);
        System.out.println(result);

        boolean result2 = list3.stream().mapToInt((m) -> Integer.valueOf(m)).anyMatch(m -> m == 200);
        System.out.println(result2);

        boolean result4 = list3.stream().mapToInt((m) -> Integer.valueOf(m)).noneMatch(m -> m == 200);
        System.out.println(result4);

    }
}
