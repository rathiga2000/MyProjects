package Thread;
public class ThreadDemo extends Thread {
      public static void main(String[] args) throws InterruptedException{
			Thread t1= new ThreadDemo();
			Thread t2= new ThreadDemo();
			t1.start();
			Thread.sleep(1000);
			t2.start();
			
			t1.join();
			t2.join();
	}
   public void run()  {
		for( int i=1;i<=5;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i+ " Welcome");
		}
     }
   
    }

