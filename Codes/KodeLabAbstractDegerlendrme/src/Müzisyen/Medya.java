package M�zisyen;

public abstract class Medya {
	
	public int c�k�sY�l�;
	public String medyaBasl�k;
	public double sat�sAdedi;
	
	
	public Medya(int c�k�sY�l�, String medyaBasl�k, double sat�sAdedi) {
		super();
		this.c�k�sY�l� = c�k�sY�l�;
		this.medyaBasl�k = medyaBasl�k;
		this.sat�sAdedi = sat�sAdedi;
	}
	
	public int getC�k�sY�l�() {
		return c�k�sY�l�;
	}
	public void setC�k�sY�l�(int c�k�sY�l�) {
		this.c�k�sY�l� = c�k�sY�l�;
	}
	public String getMedyaBasl�k() {
		return medyaBasl�k;
	}
	public void setMedyaBasl�k(String medyaBasl�k) {
		this.medyaBasl�k = medyaBasl�k;
	}
	public double getSat�sAdedi() {
		return sat�sAdedi;
	}
	public void setSat�sAdedi(double sat�sAdedi) {
		this.sat�sAdedi = sat�sAdedi;
	}
	
	
public abstract void MedyaBasl�k();
public abstract void sat�sAdedi();
public abstract void Y�l();

public String toString(){
	return String.format("%s: %d\n%s: %s\n%s: %.3f\n", "C�k�s Y�l� ", getC�k�sY�l�(), "Medya ", getMedyaBasl�k(), "Sat�s Adedi ", getSat�sAdedi());
}
}
