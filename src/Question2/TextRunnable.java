package Question2;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TextRunnable implements Runnable {


	public void printText () {
		
		String[] arrText = {"It", "is", "recommended", "to","use", "Calendar", "class"};

		 List<String> list = Arrays.asList(arrText);

		    
		for (int counter = 0; counter < 10; counter++) {
			
			
		    Collections.shuffle(list);
			 
		    int i = counter+1;
		    System.out.print("Word " + i + " :");
		    for (String str : list) {
		       System.out.print(str+" ");
		    }
	
			System.out.println(".");
		}

	}

	@Override
	public void run() {
		
		// Execute task
		printText();
		
	}
}