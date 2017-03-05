import java.util.*;
//Programming Exercise 7.18
public class BubbleSort {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //scanner
		System.out.println("Enter ten numbers: "); //message
		int [] list = new int [10]; //new array of 10
		for (int i = 0; i < 10; i++) //loop to record input numbers into array
			list[i] = input.nextInt();
		sort(list); //method to sort the list
		System.out.print("Sorted list: "); //print message 
		for (int i = 0; i < 10; i++)
			System.out.print(list[i] + " "); //print results
		
		
	}
	
	public static void sort(int [] list){
		boolean sorted = true; //boolean that controls the loop sorting
		do{
			sorted = false; //set to false in order to verify sorting is completed
			for (int i = 0; i < list.length - 1; i++){
				if ( list[i] > list[i + 1]){
					int b = list[i]; //following 3 lines swap the two values in ascending order
					list[i] = list[i + 1];
					list[i + 1] = b;
					sorted = true; //set to true to continue sorting
				}	
			}
		}
		while (sorted); //if true perform sorting again
	}

}
