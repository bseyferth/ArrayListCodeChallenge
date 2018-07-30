package codeChallenge;

public class Square {


	private double length;
	private double height;
	private String name;
	
	public double getArea() {
		return length * height;
	}
	
	public double getPerimeter() {
		return (length*2) + (height*2);
	}
	
	
	//getter for length
	public double getLength() {
		return length;
	}

	//setter for length
	public void setLength(double length) {
		this.length = length;
	}

	//getter for height
	public double getHeight() {
		return height;
	}

	//setter for height
	public void setHeight(double height) {
		this.height = height;
	}

	
	public String getName() {
		return name;
	}

	//setter for height
	public void setName(String name) {
		this.name = name;
	}
	
	
	//constructor
	public Square(double length, double height, String name) {
		super();
		this.length = length;
		this.height = height;
		this.name = name;
	}	
}

	
	

