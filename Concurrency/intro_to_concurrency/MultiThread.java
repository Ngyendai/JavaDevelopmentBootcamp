public class MultiThread {

  // static class LongTask implements Runnable {

  //   @Override
  //   public void run() {
  //     // TODO Auto-generated method stub
  //     longTask();
  //   }
  // }

  public static void main(String[] args) {
    // LongTask runnable = new LongTask();
    // Thread thread2 = new Thread(runnable);
    // thread2.start();
    // longTask();
    // Runnable runnable = new Runnable() {
    //   @Override
    //   public void run() {
    //     // TODO Auto-generated method stub
    //     longTask();
    //   }
    // };
    // Thread thread2 = new Thread(runnable);
    // thread2.start();

    Thread thread2 = new Thread(() -> longTask());
    thread2.start();
    System.out.println("-----------------------");
    thread2.interrupt();
    System.out.println("Doing other work on main thread");
  }

  public static void longTask() {
    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      System.out.println("Doing");
    }
    // long t = System.currentTimeMillis();
    // long end = t + 3000;

    // while (true) {
    //   if (System.currentTimeMillis() == end) {
    //     System.out.println("Finished long task");
    //     break;
    //   } else if (Thread.currentThread().isInterrupted()) {
    //     System.out.println("aaaaaaaaaaaaaaa");
    //     break;
    //   }
    // }
  }
}
