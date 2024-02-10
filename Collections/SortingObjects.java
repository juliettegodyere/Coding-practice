package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student>{
        private String name;
        private int age;

        public Student(String name, int age){
            this.name = name;
            this.age = age;
        }

        public String getName(){
            return this.name;
        }

        public int getAge(){
            return this.age;
        }

        @Override
        public int compareTo(Student o) {
           if(this.age == o.age){
            return 0;
           }else if(this.age > o.age){
            return 1;
           }else{
            return -1;
           }
        }
     }

public class SortingObjects {
    /**
     * The Comparator and the Camparable Interface. First is that they both have a single method that is expected to be
     * implemented.
     * For comparable, use this when you want natural sorting for your object. Check the student class. But what of in 
     * a situation where you want to sort by name? You can obviously see that this offers only a single sorting opportunity.
     * 
     * Let's look at the Comparator class. It is a Funtional Interface meaning it has one method and can be used with Lamda 
     * expression. If I want to sort with an ID and name, I can actually define two diferent comparators and pass it to the 
     * sort function.
     * https://www.youtube.com/watch?v=X-LynP9sVSM
     * https://www.youtube.com/watch?v=ZA2oNhtNk3w
     * 
     */

     public static void main(String [] args){
        List<Student> students = new ArrayList<>();

        Student student1 = new Student("Juliet", 31);
        Student student2 = new Student("Grape", 41);
        Student student3 = new Student("Jim", 24);
        Student student4 = new Student("Frank", 96);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        Comparator<Student> nameComparator = (s1, s2) -> s1.getName().compareTo(s2.getName());
        Comparator<Student> ageComparator = (s1, s2) -> s1.getAge() > s2.getAge() ? 1 : -1;

        //You can also use the comparing static method. Which is more convienient
        Collections.sort(students, Comparator.comparingInt(s -> s.getAge()));
        Collections.sort(students, Comparator.comparing(s -> s.getName()));

        //Natural sorting with Comparable
        // Collections.sort(students);
        // Collections.sort(students,nameComparator);
        // Collections.sort(students,ageComparator);

        students.forEach((e) -> System.out.println("My name is : " + e.getName() + ". I am born in " + e.getAge()));
     }
    
}

