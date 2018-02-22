
public class SumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] array={2,4,6,8,10,12,14,15};
     int total=0;
     
     for(int counter=0; counter<array.length; counter++)
    	 total=total+array[counter];
     
     System.out.printf("Total of array elements : %d\n", total);
	}

}
