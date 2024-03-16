package ThreadPool;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
//https://www.javaguides.net/2018/09/executors-utility-class-in-java.html
class Task implements Runnable {
    @Override
    public void run() { 
         for (int i = 0; i < 5; i++) {
              System.out.println("[" + Thread.currentThread().getName() + "] " + "Message " + i);
              try {
                   Thread.sleep(200);
              } catch (final InterruptedException e) {
                   e.printStackTrace();
              }
         }
    }
}

public class FixedThreadPoolExample {
    public static void main(final String[] args) throws InterruptedException, ExecutionException {
  
          System.out.println("Thread main started");
  
          final ExecutorService executorService = Executors.newFixedThreadPool(2);
          executorService.execute(new Task());
          executorService.execute(new Task());
          executorService.execute(new Task());
          executorService.execute(new Task());
          executorService.execute(new Task());
  
          executorService.shutdown();
  
          System.out.println("Thread main finished");
     }
}
