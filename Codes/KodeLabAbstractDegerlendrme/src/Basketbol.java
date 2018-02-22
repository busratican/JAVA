
public class Basketbol extends Sporcu {
 
	
	public String name;
	
	
	public Basketbol(String name, double cost, String club, String achievement) {
		super(cost, club, achievement);

this.name=name;
	}


	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void BilgiAl(){
		Basketbol b= new Basketbol(name, cost, achievement, club);
		b.getName();
		b.getAchievement();
		b.getClub();
		b.getCost();
		setName(name);
	}
	

	@Override
	public String toString() {
		return String.format("%s: %s\n%s", "Player ", getName(), super.toString());
	}


	
}
