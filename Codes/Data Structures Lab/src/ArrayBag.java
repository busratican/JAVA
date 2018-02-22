
public class ArrayBag implements Bag {

	private Object[] items;
	private int numOfitems=0;
	private static final int SIZE=50;
	
	public ArrayBag(){
		items=new Object[SIZE];
		numOfitems=0;
	}
	
	public boolean add(Object item){
		if(item == null){
			throw new IllegalArgumentException();
		}
		
		if(this.numOfitems == this.items.length){
			return false;
		}
		
		else{
			this.items[numOfitems]=item;
			numOfitems++;
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
	
	public boolean remove(Object item){
		if(this.items == null || this.items.length == 0){
			return false;
		}
		
		for(int i =0; i<this.items.length; i++){
			if(this.items[i].equals(item)){
				this.items[i]=-1;
				return true;
			}
		}
		return false;
	}
	
	public int numOfitems(){
		return this.numOfitems;
	}
}
