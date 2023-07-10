package Thread;
public class ThreadExcep extends Thread{
	public static void main(String[] args) throws InterruptedException{
					Thread t1= new ThreadExcep();
					Thread t2= new ThreadExcep();
					t1.start();
					Thread.sleep(1000);
					t2.start();
					t1.join();
					t2.join();
			}

			public void run()  {
				for( int i=1;i<=5;i++) {
					System.out.println(i+"*"+"3"+"="+ i*3);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
}


