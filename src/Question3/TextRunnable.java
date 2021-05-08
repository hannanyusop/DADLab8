package Question3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TextRunnable implements Runnable {


	public void printText (String threadName) {
		
		String[] arrText = {"It", "is", "recommended", "to","use", "Calendar", "class"};

		
		try {
			
			for (int counter = 0; counter < 10; counter++) {
				
				System.out.println("Thread :"+threadName + "-> " + counter);
				
				
				List<String> list = Arrays.asList(arrText);

			    
				for (int x = 0; x < 10; x++) {
					
					
				    Collections.shuffle(list);
					 
				    int i = x+1;
				    System.out.print("Shuffle word: (count : " + i + " ):");
				    for (String str : list) {
				       System.out.print(str+" ");
				    }
			
					System.out.println(".\n");
				}
				
				if(threadName == "Word 1") {
					System.out.println("\n\nSleep for 3 second. Name :"+threadName);
					Thread.sleep(3000);
					System.out.println("End sleep for 3 second\n\n");
				}
				
				
			}
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
	}

	@Override
	public void run() {
		
		Thread currentThread = Thread.currentThread();
		printText(currentThread.getName() );
		
	}
}