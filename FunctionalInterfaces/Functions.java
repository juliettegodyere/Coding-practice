package FunctionalInterfaces;

import java.util.function.BiFunction;
import java.util.function.DoubleFunction;
import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.LongFunction;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.ToDoubleBiFunction;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class Functions {
    public static void main(String[] args) {
        /**
         * Function (java.util.function.Function<T, R>):
         * Accepts an argument of type T and produces a result of type R.
         */
        Function<Integer, String> intToString = i -> "Number: " + i;
        String result = intToString.apply(42);

        /**
         * BiFunction (java.util.function.BiFunction<T, U, R>):
         * Accepts two arguments of types T and U and produces a result of type R.
         */
        BiFunction<String, Integer, String> concat = (s, i) -> s + i;
        String result2 = concat.apply("Hello", 123);

        /**
         * DoubleFunction<R> (java.util.function.DoubleFunction<R>):
         * Accepts a double value and produces a result of type R.
         */
        DoubleFunction<String> doubleToString = d -> "Value: " + d;
        String result3 = doubleToString.apply(3.14);

        /**
         * IntFunction<R> (java.util.function.IntFunction<R>):
         * Accepts an int value and produces a result of type R.
         */
        IntFunction<String> intToString2 = i -> "Number: " + i;
        String result4 = intToString.apply(42);

        /**
         * LongFunction<R> (java.util.function.LongFunction<R>):
         * Accepts a long value and produces a result of type R.
         */
        LongFunction<String> longToString = l -> "Value: " + l;
        String result5 = longToString.apply(123456789L);


        /**
         * DoubleToIntFunction (java.util.function.DoubleToIntFunction):
         * Accepts a double value and produces an int result.
         */

        DoubleToIntFunction doubleToInt = d -> (int) d;
        int result6 = doubleToInt.applyAsInt(3.14);

        /**
         * DoubleToLongFunction (java.util.function.DoubleToLongFunction):
         * Accepts a double value and produces a long result.
         */
        DoubleToLongFunction doubleToLong = d -> (long) d;
        long result7 = doubleToLong.applyAsLong(3.14);

        /**
         * IntToDoubleFunction (java.util.function.IntToDoubleFunction):
         * Accepts an int value and produces a double result.
         */
        IntToDoubleFunction intToDouble = i -> (double) i;
        double result9 = intToDouble.applyAsDouble(42);

        /**
         * IntToLongFunction (java.util.function.IntToLongFunction):
         * Accepts an int value and produces a long result.
         */
        IntToLongFunction intToLong = i -> (long) i;
        long result10 = intToLong.applyAsLong(42);

        /**
         * LongToDoubleFunction (java.util.function.LongToDoubleFunction):
         * Accepts a long value and produces a double result.
         */
        LongToDoubleFunction longToDouble = l -> (double) l;
        double result11 = longToDouble.applyAsDouble(123456789L);

        /**
         * LongToIntFunction (java.util.function.LongToIntFunction):
         * Accepts a long value and produces an int result.
         */

        LongToIntFunction longToInt = l -> (int) l;
        int result12 = longToInt.applyAsInt(123456789L);

        /**
         * ToDoubleBiFunction<T, U> (java.util.function.ToDoubleBiFunction<T, U>):
         * Accepts two arguments of types T and U and produces a double result.
         */

        ToDoubleBiFunction<String, Integer> concatenateAndLength = (s, i) -> (double) (s.length() + i);
        double result13 = concatenateAndLength.applyAsDouble("Hello", 5);

        /**
         * ToDoubleFunction<T> (java.util.function.ToDoubleFunction<T>):
         * Accepts an argument of type T and produces a double result.
         */
        ToDoubleFunction<String> stringToDouble = s -> Double.parseDouble(s);
        double result14 = stringToDouble.applyAsDouble("3.14");

        /**
         * ToIntBiFunction<T, U> (java.util.function.ToIntBiFunction<T, U>):
         * Accepts two arguments of types T and U and produces an int result.
         */
        // ToIntBiFunction<String, Integer> concatenateAndLength2 = (s, i) -> s.length() + i;
        // int result15 = concatenateAndLength.applyAsInt("Hello", 5);

        /**
         * ToIntFunction<T> (java.util.function.ToIntFunction<T>):
         * Accepts an argument of type T and produces an int result.
         */
        ToIntFunction<String> stringToInt = s -> Integer.parseInt(s);
        int result16 = stringToInt.applyAsInt("42");

        /**
         * ToLongBiFunction<T, U> (java.util.function.ToLongBiFunction<T, U>):
         * Accepts two arguments of types T and U and produces a long result.
         */
        // ToLongBiFunction<String, Integer> concatenateAndLength3 = (s, i) -> (long) (s.length() + i);
        // long result17 = concatenateAndLength.applyAsLong("Hello", 5);

        /**
         * ToLongFunction<T> (java.util.function.ToLongFunction<T>):
         * Accepts an argument of type T and produces a long result.
         */
        ToLongFunction<String> stringToLong = s -> Long.parseLong(s);
        long result18 = stringToLong.applyAsLong("123456789");

    }
}
