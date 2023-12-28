package practice_projects;

//Creating a thread by extending the 'Thread' class
class MyThread extends Thread {
 public void run() {
     for (int i = 1; i <= 5; i++) {
         System.out.println(Thread.currentThread().getId() + " - Count (Thread): " + i);
     }
 }
}

//Creating a thread by implementing the 'Runnable' interface
class MyRunnable implements Runnable {
 public void run() {
     for (int i = 1; i <= 5; i++) {
         System.out.println(Thread.currentThread().getId() + " - Count (Runnable): " + i);
     }
 }
}

public class ThreadExample {
 public static void main(String[] args) {
     // Example 1: Using the 'Thread' class
     MyThread thread1 = new MyThread();
     MyThread thread2 = new MyThread();

     thread1.start(); // Starts the first thread
     thread2.start(); // Starts the second thread

     // Example 2: Using the 'Runnable' interface
     MyRunnable myRunnable = new MyRunnable();

     Thread thread3 = new Thread(myRunnable);
     Thread thread4 = new Thread(myRunnable);

     thread3.start(); // Starts the third thread
     thread4.start(); // Starts the fourth thread
 }
}

