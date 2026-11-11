import java.util.Scanner;

class MyThread extends Thread {

    public MyThread(String name) {
        super(name);
    }

    //Override//
    public void run() {
        System.out.println(getName() + " is " + getState());
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Name the your first thread: ");
        String thread1Name = input.nextLine();

        System.out.print("Name your second thread: ");
        String thread2Name = input.nextLine();

        MyThread t1 = new  MyThread(thread1Name);
        MyThread t2 = new  MyThread(thread2Name);

        System.out.println(t1.getName() + " is " + t1.getState());
        System.out.println(t2.getName() + " is " + t2.getState());

        System.out.println("\nStarting the threads...");

        t1.start();
        t2.start();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("\nAfter sleep...");
        System.out.println(t1.getName() + " is " + t1.getState());
        System.out.println(t2.getName() + " is " + t2.getState());

        input.close();
    }
}
