import java.util.*;
//Programming Excercise 7.5
public class Distinct {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //new scanner
        System.out.print("Enter ten numbers: "); //message        
        int[] numbers = new int[10]; //new array to store numbers
        int count = 0; //counter to determine distinct numbers
        for(int i = 0; i < 10; i++) {
            int value = input.nextInt(); //input value to compare and store in array
            boolean distinct = true; //boolean to determine if doubles
            for(int j = 0; j < count; j++) { //for loop
                if (value == numbers[j]) { 
                    distinct = false; //sets if number is a duplicate 
                }
            }
            if (distinct)
            	numbers[count++] = value; //stores the input value in the array when a non duplicate number is entered
        }
        System.out.print("The number of distinct numbers is " + count + "\nThe distinct numbers are ");  //prints message
        for(int i = 0 ; i < count; i++)
        	System.out.print(numbers[i]+" ");  //prints results following message

	}

}
