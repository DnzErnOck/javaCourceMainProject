package kodlamaio.entities;

public class Courses {
	private int id;
	private String name;
	private int completionRate;
	private double price;

	public Courses() {

	}


	public Courses(int id, String name, int completionRate, double price) {
		this.id = id;
		this.name = name;
		this.completionRate = completionRate;
		this.price = price;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
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

	public int getCompletionRate() {
		return completionRate;
	}

	public void setCompletionRate(int completionRate) {
		this.completionRate = completionRate;
	}

}
