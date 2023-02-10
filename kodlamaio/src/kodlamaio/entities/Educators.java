package kodlamaio.entities;

public class Educators {
	private int id;
	private String name;
	private String surname;
	private double score;

	public Educators() {

	}

	public Educators(int id, String name, String surname, double score) {

		this.id = id;
		this.name = name;
		this.surname = surname;
		this.score = score;
	}

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

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}
}
