package Question3;


public class Question3App {

	
	public static void main(String[] args) {
		
		Runnable TextRunnable = new TextRunnable();
		
		Thread word1 = new Thread(TextRunnable);
		word1.setName("Word 1");
		
		Thread word2 = new Thread(TextRunnable);
		word2.setName("Word 2");
		
		Thread word3 = new Thread(TextRunnable);
		word3.setName("Word 3");
		
//		Thread statementThread = new StatementPrinter();
//		statementThread.setName("statementThread");
		
		
		// Execute thread
		word1.start();
		word2.start();
		word3.start();
	}
	
}
