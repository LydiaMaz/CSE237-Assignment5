package finalGradeCalculator;
import java.util.Scanner;

public class Category {
	
	Scanner input = new Scanner(System.in);
	private String categoryName;
	private double weight;
	private double possiblePoints;
	
	public Category() {
		setName();
		setWeight();
		setPossiblePoints();
	}

	public String getCategoryName() {
		return categoryName;
	}
	
	public void setName() {
		System.out.println("Please enter category name: (ex. homework)");
		this.categoryName = input.next();
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void setWeight() {
		System.out.println("Please enter the weight as a percentage: (ex. 40)");
		this.weight = input.nextDouble();
	}
	
	public double getPossiblePoints() {
		return possiblePoints;
	}
	
	public void setPossiblePoints() {
		System.out.println("Please enter the number of possible points: ");
		this.possiblePoints = input.nextDouble();
	}
	
}
