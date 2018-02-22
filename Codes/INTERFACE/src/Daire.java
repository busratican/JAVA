
public class Daire implements GeometrikSekil {
	
	public int radius=1;
	public double pi = Math.PI;
	
	public int alan(){
		
		return (int) ((int) radius*radius*pi);
	}
	public int cevre(){
		
		return (int) (2*pi*radius);
	}

}
