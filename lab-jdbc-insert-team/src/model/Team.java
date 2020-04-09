package model;

public class Team	
{
	private int id;
	private String name;
	private String coach;
	private int home_city_id;
	private int captain;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCoach() {
		return coach;
	}
	public void setCoach(String coach) {
		this.coach = coach;
	}
	public int getHome_city_id() {
		return home_city_id;
	}
	public void setHome_city_id(int home_city_id) {
		this.home_city_id = home_city_id;
	}
	public int getCaptain() {
		return captain;
	}
	public void setCaptain(int captain) {
		this.captain = captain;
	}
	
	public Team(int id, String name, String coach, int home_city_id, int captain) {
		super();
		this.id = id;
		this.name = name;
		this.coach = coach;
		this.home_city_id = home_city_id;
		this.captain = captain;
	}
	
	
	
}
