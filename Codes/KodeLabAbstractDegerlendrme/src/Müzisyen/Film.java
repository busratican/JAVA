package Müzisyen;

public  class Film extends Medya{


	public String name;
	public int yýl;
	public String media;
	public double tane;

	public Film(String name,int cýkýsYýlý, String medyaBaslýk, double satýsAdedi) {
		super(cýkýsYýlý, medyaBaslýk, satýsAdedi);
		this.name=name;
	}
	
	
public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getYýl() {
		return yýl;
	}


	public void setYýl(int yýl) {
		this.yýl = yýl;
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

	public void MedyaBaslýk()
{
		
		
	this.media=medyaBaslýk;
}

public void satýsAdedi(){



this.tane=satýsAdedi;

}

public void Yýl(){
	

	this.yýl=cýkýsYýlý;
}


public String toString(){
	return String.format("%s: %s\n%s", "Name ", getName(), super.toString());
}



}
