public class MultiThreading implements Runnable{

    private String data;

    public MultiThreading(String data){
        this.data = data;
    }

    @Override
    public void run() {
        for(int i = 0; i < 5; i++){
            System.out.println(i + " "+ Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.print(e.getMessage());
                e.printStackTrace();
            }
        }
        
    }
    
}
