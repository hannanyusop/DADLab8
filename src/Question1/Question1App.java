package Question1;
public class Question1App {
	
	
public static void main(String[] args) {
		
	Thread thread1 = new GetTime();
	Thread thread2 = new GetTime();
	
	Thread printerThread1 = new Thread(thread1, "Thread 1");
	Thread printerThread2 = new Thread(thread2, "Thread 2");

	// Execute threads
	printerThread1.start();
	printerThread2.start();

	}
	

}


