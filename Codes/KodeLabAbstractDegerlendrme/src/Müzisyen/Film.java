package M�zisyen;

public  class Film extends Medya{


	public String name;
	public int y�l;
	public String media;
	public double tane;

	public Film(String name,int c�k�sY�l�, String medyaBasl�k, double sat�sAdedi) {
		super(c�k�sY�l�, medyaBasl�k, sat�sAdedi);
		this.name=name;
	}
	
	
public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getY�l() {
		return y�l;
	}


	public void setY�l(int y�l) {
		this.y�l = y�l;
	}


	public String getMedia() {
		return media;
	}


	public void setMedia(String media) {
		this.media = media;
	}


	public double getTane() {
		return tane;
	}


	public void setTane(double tane) {
		this.tane = tane;
	}

	public void MedyaBasl�k()
{
		
		
	this.media=medyaBasl�k;
}

public void sat�sAdedi(){



this.tane=sat�sAdedi;

}

public void Y�l(){
	

	this.y�l=c�k�sY�l�;
}


public String toString(){
	return String.format("%s: %s\n%s", "Name ", getName(), super.toString());
}



}
