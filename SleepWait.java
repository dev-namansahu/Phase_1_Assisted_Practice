package practice_projects;

public class SleepWait {
	public static void main(String[] args) {
        final Object lock = new Object();

        // Thread 1: Sleep Demo
        Thread sleepThread = new Thread(() -> {
            synchronized (lock) {
                System.out.println("SleepThread is going to sleep for 2 seconds...");
                try {
                    Thread.sleep(2000); // Sleep for 2 seconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("SleepThread woke up after 2 seconds.");
            }
        });

        // Thread 2: Wait Demo
        Thread waitThread = new Thread(() -> {
            synchronized (lock) {
                System.out.println("WaitThread is going to wait...");
                try {
                    lock.wait(); // Wait indefinitely until notified
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("WaitThread is awake!");
            }
        });

        sleepThread.start();
        waitThread.start();

   
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        synchronized (lock) {
            // Notify the waiting thread after 3 seconds
            System.out.println("Main thread is notifying the WaitThread after 3 seconds...");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            lock.notify(); // Notify the waiting thread to wake up
        }

        // Wait for threads to finish
        try {
            sleepThread.join();
            waitThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
