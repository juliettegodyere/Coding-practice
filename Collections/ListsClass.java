package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;

public class ListsClass {
    public static void main(String args[]){
        /**
         * Practice List Interface and it's method
         * 
         */
        List<String> list = new ArrayList<>();

        //Add elements
        list.add("Juliet");
        list.add(null);
        list.add("Grace");
        list.add("Chibuike");

        //Iterator
        Iterator<String> itr = list.iterator();
        // while(itr.hasNext()){
        //     System.out.println(itr.next());
        // }
        //ListIterator
        ListIterator<String> litr = list.listIterator(1);
        // while(litr.hasNext()){
        //     System.out.println(litr.next());
        // }
        // while(litr.hasPrevious()){
        //     System.out.println(litr.previous());
        // }

        //indexOf
        // System.out.println(list.indexOf("Jane"));
        // System.out.println(list.lastIndexOf("Juliet"));

        //replaceAll(UnaryOperator<E> operator)
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        System.out.println("Original List: " + numbers);

        // Using replaceAll to square each element in the list
        numbers.replaceAll(x -> x * x);

        System.out.println("List after replacing with square values: " + numbers);

        //retainAll(Collection<?> c)?
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        List<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);

        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);

        // Finding the intersection using retainAll
        list1.retainAll(list2);

        System.out.println("Intersection: " + list1);

        //Spliterator<E> spliterator();
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");

        // Get the spliterator for the list
        Spliterator<String> spliterator = names.spliterator();

        // Using Java Streams to perform parallel processing
        names.parallelStream().forEach(System.out::println);

        //SubList()
        /**
         * The subList(int fromIndex, int toIndex) method in the List interface is used to create a view of a portion of the original list. It returns a List that is backed by the original list, meaning changes to the original list will be reflected in the sublist, and vice versa.
         * If you want to find the size of each subarray (sublist) created using subList, you can simply use the size() method on each sublist. Here's an example:
         */
        List<Integer> sublist1 = numbers.subList(0, 2);
        List<Integer> sublist2 = numbers.subList(2, 4);
        List<Integer> sublist3 = numbers.subList(4, 5);

        // Finding the size of each sublist
        int size1 = sublist1.size();
        int size2 = sublist2.size();
        int size3 = sublist3.size();

        System.out.println("Size of Sublist 1: " + size1);
        System.out.println("Size of Sublist 2: " + size2);
        System.out.println("Size of Sublist 3: " + size3);

        //toArray()
        List<String> stringList = new ArrayList<>();
        stringList.add("Java");
        stringList.add("Python");
        stringList.add("JavaScript");

        // Using toArray() to convert list to array
        Object[] array = stringList.toArray();

        // Printing the elements of the array
        for (Object element : array) {
            System.out.println(element);
        }
        //	toArray(T[] a)
        List<String> stringList2 = new ArrayList<>();
        stringList.add("Java");
        stringList.add("Python");
        stringList.add("JavaScript");

        // Using toArray(T[] a) to convert list to array
        String[] array2 = stringList2.toArray(new String[0]);

        // Printing the elements of the array
        for (String element : array2) {
            System.out.println(element);
        }

        ArrayList<String> result = new ArrayList<>();
              result = list.stream().map((l) -> l.length() > 3)
               .Collectors.asList();
            return result;

        public ArrayList<String> countString(ArrayList<String> list){
            ArrayList<String> result = new ArrayList<>();
              result = list.stream().map((l) -> l.length() > 3)
               .Collectors.asList();
            return result;
          }
    }
}
