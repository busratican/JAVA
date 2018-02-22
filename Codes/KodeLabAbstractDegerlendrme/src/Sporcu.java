
public abstract class Sporcu {

	public double cost;
	public String club;
	public String achievement;
	
	public Sporcu( double cost, String club, String achievement) {
	
		
		this.cost = cost;
		this.club = club;
		this.achievement = achievement;
	}

	
	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getClub() {
		return club;
	}

	public void setClub(String club) {
		this.club = club;
	}

	public String getAchievement() {
		return achievement;
	}

	public void setAchievement(String achievement) {
		this.achievement = achievement;
	}

	public abstract void BilgiAl();
	
	
	
	
	public String toString() {
		return String.format("%s: $%,.2f\n%s: %s\n%s: %s\n", "Cost ", getCost(), "club ", getClub(),
				"Achievement ", getAchievement());
	}
	
	
	
}
