package ExecutorFramework;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * https://www.javaguides.net/2018/09/java-callable-and-future-tutorial.html
 */

class SumNumbers implements Callable<Integer> {
    private int n;

    public SumNumbers(int n) {
         this.n = n;
    }

    public Integer call() {
         int sum = 0;
         for (int i = 1; i <= n; i++) {
  
             sum += i;
             try {
                  Thread.sleep(200);
             } catch (InterruptedException e) {
                  e.printStackTrace();
             }
         }
         System.out.println("[" + Thread.currentThread().getName() + "] of sum " + sum);
         return sum;
    }
}

public class ReturnValuesUsingCallable {
 
    public static void main(String[] args) throws InterruptedException, ExecutionException {
  
    System.out.println("Thread main started");
  
    ExecutorService executorService = Executors.newSingleThreadExecutor();
    Future<Integer> returnedValues = executorService.submit(new SumNumbers(10));
    System.out.println("Result of Future object:: " + returnedValues.get());
    executorService.shutdown();
  
    System.out.println("Thread main finished");
  }
}
