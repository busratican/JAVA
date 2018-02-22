
public class Futbol extends Sporcu{

	public String name;
	
	public Futbol(String name,double cost, String club, String achievement) {
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
	Futbol f=new Futbol(name, cost, achievement, club);
	f.getName();
	f.getAchievement();
	f.getClub();
	f.getCost();
	}
	
@Override
	public String toString() {
		return String.format("%s: %s\n%s", "Name ", getName(), super.toString());
	}
	
}
