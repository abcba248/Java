public class Main extends Thread {
  public static void main(String[] args) {
    Main thread = new Main();
    thread.start(); // start method
    System.out.println("Method 1 -getName(): Run by " + Thread.currentThread().getName());
    System.out.println("Method 2 -getState(): Run by " + Thread.currentThread().getState());
    System.out.println("Method 3 -getPriority(): Run by " + Thread.currentThread().getPriority());
  }
  public void run() {
    System.out.println("This code is running in a thread");
  }
}
