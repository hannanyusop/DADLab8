package Question2;

public class Question2App {

	public static void main(String[] args) {
		
		Runnable text = new TextRunnable();
		Thread word1 = new Thread(text);
		Thread word2 = new Thread(text);
		
		try {
			
			// Execute the threads
			word1.start();
			word2.start();
			
			
			System.out.println("Program ends");
		
		} catch (Exception ex) {
			
			ex.printStackTrace();
		}
	}
	
	
	
}
