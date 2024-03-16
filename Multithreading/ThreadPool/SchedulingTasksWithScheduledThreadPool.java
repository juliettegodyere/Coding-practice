package ThreadPool;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/**https://www.javaguides.net/2018/09/executors-newscheduledthreadpool-method-example.html */
public class SchedulingTasksWithScheduledThreadPool {
    
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Thread main started");
      
        // Create a task
        Runnable task1 = () -> {
         System.out.println("Executing the task1 at: " + new Date());
        };
      
        // Create a task
        Runnable task2 = () -> {
         System.out.println("Executing the task2 at: " + new Date());
        };
      
        //ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(2);
      
       // System.out.println("Scheduling task to run after 5 seconds... " + new Date());

        /**
         * scheduledExecutorService.schedule() function takes a Runnable, a delay value, and the unit of the delay. 
         * The above program executes the task after 5 seconds from the time of submission.
         */
        // scheduledExecutorService.schedule(task1, 5, TimeUnit.SECONDS);
        // scheduledExecutorService.schedule(task2, 5, TimeUnit.SECONDS);
      
        // scheduledExecutorService.shutdown();
        //System.out.println("Thread main finished");

       /**Now let’s see an example where we execute the task periodically -/*
        * Note that if the task encounters an exception, subsequent executions of the task are suppressed. 
        Otherwise, the task will only terminate if you either shut down the executor or kill the program.
        */
       ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
       scheduledExecutorService.scheduleAtFixedRate(task1, 0, 2, TimeUnit.SECONDS);

       System.out.println("Thread main finished");
    }
}
