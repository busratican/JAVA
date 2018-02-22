package Müzisyen;

public abstract class Medya {
	
	public int cıkısYılı;
	public String medyaBaslık;
	public double satısAdedi;
	
	
	public Medya(int cıkısYılı, String medyaBaslık, double satısAdedi) {
		super();
		this.cıkısYılı = cıkısYılı;
		this.medyaBaslık = medyaBaslık;
		this.satısAdedi = satısAdedi;
	}
	
	public int getCıkısYılı() {
		return cıkısYılı;
	}
	public void setCıkısYılı(int cıkısYılı) {
		this.cıkısYılı = cıkısYılı;
	}
	public String getMedyaBaslık() {
		return medyaBaslık;
	}
	public void setMedyaBaslık(String medyaBaslık) {
		this.medyaBaslık = medyaBaslık;
	}
	public double getSatısAdedi() {
		return satısAdedi;
	}
	public void setSatısAdedi(double satısAdedi) {
		this.satısAdedi = satısAdedi;
	}
	
	
public abstract void MedyaBaslık();
public abstract void satısAdedi();
public abstract void Yıl();

public String toString(){
	return String.format("%s: %d\n%s: %s\n%s: %.3f\n", "Cıkıs Yılı ", getCıkısYılı(), "Medya ", getMedyaBaslık(), "Satıs Adedi ", getSatısAdedi());
}
}
