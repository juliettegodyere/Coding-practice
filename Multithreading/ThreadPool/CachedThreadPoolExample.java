package ThreadPool;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
/**
 * https://www.javaguides.net/2018/09/executors-newcachedthreadpool-method-example.html
 */
public class CachedThreadPoolExample {
    public static void main(final String[] args) throws InterruptedException, ExecutionException {

        System.out.println("Thread main started");

        Runnable task1 = () -> {
             System.out.println("Executing Task1 inside : " + Thread.currentThread().getName());
             try {
                  TimeUnit.SECONDS.sleep(2);
             } catch (InterruptedException ex) {
                  throw new IllegalStateException(ex);
             }
        };

        Runnable task2 = () -> {
             System.out.println("Executing Task2 inside : " + Thread.currentThread().getName());
             try {
                  TimeUnit.SECONDS.sleep(4);
             } catch (InterruptedException ex) {
                  throw new IllegalStateException(ex);
             }
       };

        Runnable task3 = () -> {
            System.out.println("Executing Task3 inside : " + Thread.currentThread().getName());
            try {
                 TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException ex) {
                 throw new IllegalStateException(ex);
            }
        };

        final ExecutorService executorService = Executors.newCachedThreadPool();
        System.out.println("Submitting the tasks for execution...");
        executorService.submit(task1);
        executorService.submit(task2);
        executorService.submit(task3);

        executorService.shutdown();

        System.out.println("Thread main finished");
    }
}
