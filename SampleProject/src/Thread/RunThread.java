package Thread;

class First implements Runnable {
	public void run() {
		add();
	}

	void add() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("welcome");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Second implements Runnable {

	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Thankyou");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}

public class RunThread {
	public static void main(String[] args) throws InterruptedException {
		
		Thread t1 = new Thread(new First());
		Thread t2 = new Thread(new Second());

		t1.start();
		t2.start();

	}		
}
