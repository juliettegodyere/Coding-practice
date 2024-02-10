package FunctionalInterfaces;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;
import java.util.function.ObjIntConsumer;

/**
 * In Java, the java.util.function package provides a set of functional interfaces that can be used with lambda expressions. 
 * Among these, there are several consumer interfaces, each designed to accept different types of input arguments. 
 * Here's an overview of the consumer interfaces you mentioned:
 */

public class Consumers {
    public static void main(String[] args) {
        /**
         * Consumer (java.util.function.Consumer<T>):
         * Accepts a single argument of type T and performs an operation on it.
         */
        Consumer<String> stringConsumer = s -> System.out.println(s);
        stringConsumer.accept("Hello, Consumer!");

        /**
         * BiConsumer (java.util.function.BiConsumer<T, U>):
         * Accepts two arguments of types T and U and performs an operation on them.
         */
        BiConsumer<String, Integer> biConsumer = (s, i) -> System.out.println(s + " : " + i);
        biConsumer.accept("Number of apples", 10);

        /**
         * DoubleConsumer (java.util.function.DoubleConsumer):
         * Accepts a single argument of type double and performs an operation on it.
         */
        DoubleConsumer doubleConsumer = d -> System.out.println("Value: " + d);
        doubleConsumer.accept(3.14);

        /**
         * IntConsumer (java.util.function.IntConsumer):
         * Accepts a single argument of type int and performs an operation on it.
         */
        IntConsumer intConsumer = i -> System.out.println("Count: " + i);
        intConsumer.accept(5);

        /**
         * LongConsumer (java.util.function.LongConsumer):
         * Accepts a single argument of type long and performs an operation on it.
         */
        LongConsumer longConsumer = l -> System.out.println("Value: " + l);
        longConsumer.accept(123456789L);

        /**
         * ObjIntConsumer<T> (java.util.function.ObjIntConsumer<T>):
         * Accepts two arguments, an object of type T and an int, and performs an operation 
         */

        ObjIntConsumer<String> objIntConsumer = (s, i) -> System.out.println(s + " : " + i);
        objIntConsumer.accept("Count", 42);

        /**
         * In this example, biConsumer1 prints the values, and biConsumer2 multiplies the integer by 2. When you use andThen, 
         * it creates a new BiConsumer (combinedBiConsumer) that first executes biConsumer1 and then biConsumer2. 
         * When you apply combinedBiConsumer, both operations are performed sequentially.
         */

        // First BiConsumer: prints the values
        BiConsumer<String, Integer> biConsumer1 = (s, i) -> System.out.println(s + " : " + i);

        // Second BiConsumer: multiplies the integer by 2
        BiConsumer<String, Integer> biConsumer2 = (s, i) -> System.out.println(s + " * 2 = " + (i * 2));

        // Using andThen to combine the two BiConsumers
        BiConsumer<String, Integer> combinedBiConsumer = biConsumer1.andThen(biConsumer2);

        // Applying the combined BiConsumer
        combinedBiConsumer.accept("Number of apples", 5);
    }
}
