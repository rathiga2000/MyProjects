package Thread;

public class runable implements Runnable{
	  public static void main(String[] args) {
				
				Runnable r = new runable();
				Runnable r1 = new runable();
				Thread t1 = new Thread(r);
				Thread t2 = new Thread(r1);
				t1.start();
				t2.start();
			}
               public void run() {
				for( int i=1;i<=5;i++) {
					System.out.println(i + " Welcome");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
}


