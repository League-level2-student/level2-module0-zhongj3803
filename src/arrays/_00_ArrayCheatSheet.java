package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] string = {"text1","text2","text3","text4","text5"};
		//2. print the third element in the array
		System.out.println(string[2]);
		//3. set the third element to a different value
		string[2]="newtext";
		//4. print the third element again
		System.out.println(string[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i<string.length;i++) {
			System.out.println(string[i]);
		}
		//6. make an array of 50 integers
		int[] integerList = new int[50];
		for (int i = 0; i<integerList.length;i++) {
			integerList[i]=i+1;
		}
		//7. use a for loop to make every value of the integer array a random number
		Random ran = new Random();
		for (int i = 0; i<integerList.length;i++) {
			integerList[i]=ran.nextInt(50);
		}
		//8. without printing the entire array, print only the smallest number in the array
		int smallest = integerList[0];
		for (int i = 1; i<integerList.length;i++){
			if (integerList[i]<smallest) {
				smallest = integerList[i];
			}
		}
		System.out.println(smallest);
		//9 print the entire array to see if step 8 was correct
		for (int i = 0; i<integerList.length;i++) {
			System.out.println(integerList[i]);
		}
		//10. print the largest number in the array.
		int largest = integerList[0];
		for (int i = 1; i<integerList.length;i++){
			if (integerList[i]>largest) {
				largest = integerList[i];
			}
		}
		System.out.println(largest);
	}
}
