package aula07.Qa;

public class Player {

	private static int lastId = 0;
	private int id;
	private String name;
	private String club;

	public Player(String name, String club) {
		this.id = generateID();
		this.name = name;
		this.club = club;
	}
	
	private int generateID(){
		return lastId++;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getClub() {
		return club;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setClub(String club) {
		this.club = club;
	}

	
	
}
