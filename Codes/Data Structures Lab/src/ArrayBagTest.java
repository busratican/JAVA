
public class ArrayBagTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayBag a = new ArrayBag();
		
		a.add(2);
		a.add("CENG");
		a.add("202");
		
		if(a.contains("asdsad")){
			System.out.println("�tem is found !!!");
		}
		else{
			System.out.println("�tem is not found !!!");
		}
	}

}
