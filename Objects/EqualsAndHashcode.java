package Objects;
import java.util.ArrayList;
import java.util.Objects;
import java.util.stream.Collectors;

public class EqualsAndHashcode {
    /**
     * If I have a class, and I want to check equality of the objects. Every class is a subclass of the Object class and the Object class
     * has the equals and hashcode methods. The equals method checks for reference equality but if you want a value
     * equality, you can pverride the equals and the hashcode methods and give your own implementations. Two objects are
     * if their hashcodes are the same. Let's write code
     * https://www.youtube.com/watch?v=X2AjBFZfFCY
     * Hashmap time complexity explanation https://www.youtube.com/watch?v=-6x4jqty1Hc
     */
   private int id;
   private String name;
   private int age;
   private double salary; 

   public EqualsAndHashcode(int id, String name, int age, double salary) {
      this.id = id;
      this.name = name;
      this.age = age;
      this.salary = salary;
   }


   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.id = id;
   }   

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getAge() {
      return this.age;
   }

   public void setAge(int age) {
      this.age = age;
   }

   public double getSalary() {
      return this.salary;
   }

   public void setSalary(double salary) {
      this.salary = salary;
   }

   @Override  
   public boolean equals(Object obj) {
      if(this == obj){
         return true;
      }
      if(obj == null || this.getClass() != obj.getClass()){
         return false;
      }
      EqualsAndHashcode eh = (EqualsAndHashcode)obj;
      if(this.hashCode() != eh.hashCode()){
         return false;
      }
      return this.name.equals(eh.name)&& this.age == eh.age && this.salary==eh.salary;
   }

   @Override
   public int hashCode(){
      return Objects.hash(id);
   }
   @Override
   public String toString() {
      return "{" +
         " id='" + getId() + "'" +
         ", name='" + getName() + "'" +
         ", age='" + getAge() + "'" +
         ", salary='" + getSalary() + "'" +
         "}";
   }
     
}





