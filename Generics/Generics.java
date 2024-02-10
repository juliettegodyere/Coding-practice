package Generics;

/**
 * Generics in Java refer to a feature that allows you to write classes, interfaces, 
 * and methods that operate with types as parameters. It enables you to create classes, 
 * interfaces, and methods that can work with any data type while providing compile-time type safety. 
 * The main goal of generics is to provide stronger type checks at compile time and to eliminate the risk of 
 * ClassCastException at runtime.
 * 
 * 1. Type Safety: Generics enable you to catch type mismatches at compile time rather than at runtime. 
 * This helps to avoid casting and results in more reliable and maintainable code.
 * 2. Code Reusability: With generics, you can write code that works with a variety of data types. This promotes code 
 * reusability and reduces redundancy.
 * 3. Compile-Time Checking: The Java compiler performs type checking during compile time, and it ensures that only the correct 
data types are used.
https://www.youtube.com/watch?v=Xje5PIhys18
 */

public class Generics <T>{
    
    private Object[] data = new Object[10];
    int count = 0;

    public int add(T value){
        data[count++] = value;
        return count;
    }

    public T get(int index){
        if(index >= 0 && index < count){
            T element = (T) data[index];
            return element;
        }else{
            throw new IndexOutOfBoundsException("Index does not exist" + index);
        }
    }
}
