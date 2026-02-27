package FirstWeekAssignment.Module1;
import java.util.Scanner;
public class StudentGrade {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter student's marks : ");
	        int marks = sc.nextInt();
	        int gradeCategory = marks / 10;
	        switch (gradeCategory) {
	            case 10:
	            case 9:
	                System.out.println("Grade: A");
	                break;
	            case 8:
	                System.out.println("Grade: B");
	                break;
	            case 7:
	                System.out.println("Grade: C");
	                break;
	            case 6:
	                System.out.println("Grade: D");
	                break;
	            default:
	                System.out.println("Grade: F");
	        }
	        sc.close();
	    }
	}