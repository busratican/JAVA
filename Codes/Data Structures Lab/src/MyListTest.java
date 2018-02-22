
public class MyListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyContains co = new MyContains();
		
		co.add(2);
		co.add("AYLA");
		co.add("AhSEN");
		co.add(8);
		
		if(co.contains(8)){
			System.out.println("Ýtem found !!");
		}
		
		else{
			System.out.println("Item is not found !!");
		}
	
	co.reverse();
	}

}
