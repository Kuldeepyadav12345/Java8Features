package LambdaExpression;

public class TestRunnable {

	public static void main(String[] args) {
		Runnable runnable=new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Annonymous Inner Class ");
				
			}
		};
		Thread one=new Thread(runnable);
		one.start();
		
		
	}

}
