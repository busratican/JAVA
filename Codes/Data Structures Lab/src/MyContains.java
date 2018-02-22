
public class MyContains implements MyList {

	private Object[] items;
	private Object[] swapping;
	private int numItems=0;
	private static final int SIZE=5;
	
	
	public MyContains(){
		items=new Object[SIZE];
		swapping=new Object[SIZE];
		numItems++;
	}
	
	public boolean add(Object item){
		if(item == null){
			throw new IllegalArgumentException();
		}
		
	if(this.numItems == this.items.length){
		return false;
	}
	
	else{
		this.items[numItems]=item;
		return true;
	}
	
	
}
	public boolean contains(Object item){
		if(this.items == null || this.items.length == 0){
			return false;
		}
		
		for(int i=0; i<this.items.length; i++){
			if(this.items[i].equals(item)){
				return true;
			}
			
			
		}
		
		return false;
	}
	
	public void reverse(){
		if(this.numItems == this.items.length){
			return;
		}
		
		else{
	   
			for(int i=0; i<this.items.length; i++){
				
				
				swapping[i]=this.items[numItems];
				this.items[numItems]=this.items[i];
				this.items[numItems]=swapping[i];
				
				System.out.println(swapping);
			}
		}
	}
	
	public int numItems(){
		return this.numItems;
	}
}
