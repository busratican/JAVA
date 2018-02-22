
public class Factorials {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		long factorial=1;
		int counter=1;
		
		System.out.printf("Factorial is showing like that n!\n");
		System.out.print("21!=");
		for(counter=1; counter<21; counter++){
			factorial=factorial*counter;
			System.out.printf("%d*", counter);
			//System.out.print(factorial);
			
		}
		System.out.println();
		System.out.printf("The sum =");
		System.out.print(factorial);
		
	}

}
