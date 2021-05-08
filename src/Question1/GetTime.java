package Question1;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;   

public class GetTime extends Thread {


	public void printTime (String currentThread) {

		for (int counter = 0; counter < 10; counter++) {
			
			
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");  
			LocalDateTime now = LocalDateTime.now(); 
						
			System.out.println(currentThread + "->" + dtf.format(now));
		}
	}

	@Override
	public void run() {
		
		Thread currentThread = Thread.currentThread();
		printTime( currentThread.getName());

	}

}