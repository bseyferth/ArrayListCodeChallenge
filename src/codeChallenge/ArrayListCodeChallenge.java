package codeChallenge;

// created by  Brian Seyferth 7/30/2018

import java.util.ArrayList;

public class ArrayListCodeChallenge {
	
	
	//method for getting the minimum
	public static String getMin(ArrayList <Square> list) {
		
		double min = 0;
		double x = 1e9;
		int y= 0;
		String finalString = "";
		//try statement to make sure something comes out of the loop 
		try {
			//for loop to count through the lit
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getArea() < x) {
					min = list.get(i).getArea() ;
					x = min;
					y = i;
				} 
			}	
		} catch (IndexOutOfBoundsException ex) {
		finalString = "-1";	
		}
		//final string creation and return 
		finalString = String.valueOf(list.get(y).getName()) + " is the smallest room and has dimenions of " + String.valueOf(list.get(y).getHeight()) + " x " + String.valueOf(list.get(y).getLength());
		return finalString;
	}
	
	//method to return the maximum
	public static String getMax(ArrayList <Square> list) {
		
		double max = 0;
		double x = 0;
		int y = 0;
		String finalString = "";
		
		//try loop to guarantee something is returned
		try {
			
			//this for loop counts through the items in the list
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getArea() > x) {
					max = list.get(i).getArea() ;
					x = max;
					y = i;
				} 
			}	
		} catch (IndexOutOfBoundsException ex) {
		x = -1;	
		}
		//creates and retursn teh final strng
			finalString = String.valueOf(list.get(y).getName()) + " is the largest room and has dimenions of " + String.valueOf(list.get(y).getHeight()) + " x " + String.valueOf(list.get(y).getLength());
			return finalString;
	}
	
	
	//main class programming below
	public static void main(String[] args) {

		//variables declared and rectangles are added
		ArrayList<Square> listOfRects = new ArrayList<>();
		Square rect1 = new Square(15,10, "rect1");
		Square rect2 = new Square(20,10, "rect2");
		Square rect3 = new Square(10,10, "rect3");
		Square rect4 = new Square(25,10, "rect4");
		Square rect5 = new Square(5,10, "rect5");
		String min;
		String max;
	
		//adds the rectangles into the ArrayList
		listOfRects.add(rect1);
		listOfRects.add(rect2);
		listOfRects.add(rect3);
		listOfRects.add(rect4);
		listOfRects.add(rect5);
		
		//runs min method and prints out the result
		min = getMin(listOfRects);
		System.out.println(min);
		
		//runs the max method and prints out the result
		max = getMax(listOfRects);
		System.out.println(max);
		
		
	}

}
