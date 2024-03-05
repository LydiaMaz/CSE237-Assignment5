package finalGradeCalculator;

import java.util.Scanner;

public class Course {
	
	private String courseName;
	private int numberOfCategories;
	private Category[] weights;
	
	Scanner input = new Scanner(System.in);
	
	public Course(String courseName) {
		this.courseName = courseName;
		setNumberOfCategories();
		weights = new Category[numberOfCategories];
		setWeights(weights);
	}

	public void setWeights(Category[] possiblePoint) {
		for (int i = 0; i < possiblePoint.length; i++) {
			possiblePoint[i] = new Category();
		}
		this.weights = possiblePoint;
	}
	
	public void setNumberOfCategories() {
		System.out.print("Input the number of grading categories of your class/course: ");
		this.numberOfCategories = input.nextInt();
	}

	public int getNumberOfCategories() {
		return numberOfCategories;
	}
	
	public Category[] getWeights() {
		return weights;
	}
	
	public String getCourseName() {
		return courseName;
	}

}
