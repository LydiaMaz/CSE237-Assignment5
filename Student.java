package finalGradeCalculator;
import java.util.Scanner;

public class Student {

	private Course c;
	private String studentName;
	private double[] earnedPoints;
	private double[] grades;
	private double finalGrade;
	private String courseName;
	
	Scanner input = new Scanner(System.in);
	
	public Student(String name) {
		this.studentName = name;
		c = new Course(inputCourseName());
		this.courseName = c.getCourseName();
		setPoints(new double[c.getNumberOfCategories()]);
		setGradesPerCategory(new double[c.getNumberOfCategories()]);
		setFinalGrade();
	}
	
	public String inputCourseName() {
		System.out.println("Please enter your course name: ");
		return input.next();
	}
	
	public String getStudentName() {
		return studentName;
	}

	public void setPoints(double[] points) {
		System.out.println("Please enter the total points you earned for every category you listed, seaparated by a space: ");
		System.out.println("example: (100 50 60 100)");
		for (int i = 0; i < points.length; i++ ) { 
			points[i] = (double) input.nextDouble();
		}
		this.earnedPoints = points;
	}
	
	public double[] getEarnedPoints() {
		return earnedPoints;
	}
	
	public double[] getGrades() {
		return grades;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public void setGradesPerCategory(double[] calculatedGrades) {
		for (int i = 0; i<calculatedGrades.length; i++) {
			double score = earnedPoints[i] / c.getWeights()[i].getPossiblePoints();
			double scoreAsPercent = 100 * score;
			calculatedGrades[i] = scoreAsPercent;
		}
		this.grades = calculatedGrades;
	}
	
	public double calculateTotalGrade() {
		double gradeSum = 0;
		for (int i = 0; i < grades.length; i++) {
			gradeSum += grades[i];
		}
		return gradeSum / grades.length;
	}
	
	public void setFinalGrade() {
		this.finalGrade = calculateTotalGrade();
	}
	
	public double getFinalGrade() {
		return finalGrade;
	}
	

}
