import java.util.*;
//Programming Exercise 7.1
public class Grading {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //new scanner
		System.out.println("Enter the number of students: "); //message
		int s = input.nextInt(); //new variable
		System.out.println("Enter " + s + " scores: "); //message
		int [] grades = new int[s]; //new array of size determined by user input value of students
		String[] scores = {"A", "B", "C", "D", "F"}; //new array to hold letter grades
		int max = 0; //max variable
		for (int i = 0; i < grades.length; i++)
			grades[i] = input.nextInt(); //stores grades from user into array
		for (int i = 0; i < grades.length; i++)
			if (grades[i] > max){
				max = grades[i]; //finds the max grade in the array
			}
		for (int i = 0; i < grades.length; i++){ //using the max variable as a guide, for loop that prints letter grades for user based on the max.
			if (grades[i] >= (max - 10))
				System.out.println("Student " + i + " score is " + grades[i] + " and grade is "+ scores[0] + ".");
			else if (grades[i] >= (max - 20) && grades[i] < (max - 10))
				System.out.println("Student " + i + " score is " + grades[i] + " and grade is "+ scores[1] + ".");
			else if (grades[i] >= (max - 30) && grades[i] < (max - 20))
				System.out.println("Student " + i + " score is " + grades[i] + " and grade is "+ scores[2] + ".");
			else if (grades[i] >= (max - 40) && grades[i] < (max - 30))
				System.out.println("Student " + i + " score is " + grades[i] + " and grade is "+ scores[3] + ".");
			else
				System.out.println("Student " + i + " score is " + grades[i] + " and grade is "+ scores[4] + ".");
		}

	}

}
