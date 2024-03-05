
package finalGradeCalculator;
import java.util.Scanner;


public class finalGradeCalculator {
	
	private Student s;
	
	private double finalGrade;
	
	private String courseName;
	
	Scanner input = new Scanner(System.in);
	
	public finalGradeCalculator() {
		s = new Student(input.next());
		this.finalGrade = s.getFinalGrade();
		this.courseName = s.getCourseName();
	}
	
	public static void main(String[] args) {
		System.out.println("Hello, student!");
		System.out.println("To begin, please enter your name below:");
		System.out.printf("This program needs to know what makes up your overall grade.%nPretend for a moment your course is similar to the video example shown in the ReadMe:%n%n"
				+ "Assignments (Category #1), Exam 1 (Category #2), Exam 2 (Category #3), and Final Exam (Category #4) are all seperate categories.%nThe total number of categories in this case? 4.%n%n"
				+ "Exam 1 is worth 25 percent of the overall course grade in the README example.%nWe scored 97.5 out of 100 (or 24.38 points out of 25)."
				+ "%nWhen the program asks for weight?\t\tEnter 25.%nWhen the program asks for maximum points?\tEnter 100 (OR 25).%nWhen the program asks for your score?\t\tEnter 97.5 (OR 24.38)."
				+ "%n%n-------------------------------------------------------------------------------------%n");
		finalGradeCalculator sim = new finalGradeCalculator();
		sim.printReport();
	}
	
	public void printReport() {
		System.out.println(courseName + " Grade Report for " + s.getStudentName());
		for (int i = 0; i < s.getGrades().length; i++) {
			System.out.printf("Category %d:\t%s%n", i + 1, s.getGrades()[i]);
		}
		System.out.println();
		System.out.printf("Your final grade is: %.1f", finalGrade);
		
	}
		
	
}


