// /**
//  * MainClass
//  */
// public class MainClass {

//     public static void main(String[] args){
//         MultiThreading mt = new MultiThreading("Running thread");
//         Thread thread1 = new Thread(mt);
//         thread1.start();
//         thread1.setName("Thead 1");
//         Thread thread2 = new Thread(mt);
//         thread2.start();
//         thread2.setName("Thead 2");
//         try {
//             thread2.join();
//         } catch (InterruptedException e) {
//             e.printStackTrace();
//         }
//     }
// }