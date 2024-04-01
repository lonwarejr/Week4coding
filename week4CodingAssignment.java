package week4codingProject;

import java.util.ArrayList;
import java.util.List;

public class week4CodingAssignment {

	private static final char[] greeting = null;
	public static void main(String[] args) {
		
		
		
		int[] ages = {3,9,23,63,2,8,28,93};
		System.out.println(93 - ages[0]);
        //a. Programmatically subtract the value of the first element in the array from the value in the last element of the array 
		//(i.e. do not use ages[7] in your code). Print the result to the console.
		//Comment: Since i know the element i can use value of last element minus element in position [0] in array 
		//-------------------------------------------------------------------------------------------------
		int[] ages2 = {5,9,25,63,2,8,28,93,23,46,52,78};
		int sum = 0;
		for (int i = 0; i < ages2.length; i++){
			sum += ages2[i];
		}
		double average = sum / ages2.length;
		System.out.println(78 - ages[0]);
		System.out.println(average);
	    //---------------------------------------------------------------------------------------------------------------
        ///b. Create a new array of int called ages2 with 9 elements (ages2 will be longer than the ages array, and have more elements).  
        //i. Make sure that there are 9 elements of type int in this new array.  
        //ii. Repeat the subtraction from Step 1.a. (Programmatically subtract the value of the first element in the new array ages2 from the last element of ages2). 
        //iii. Show that using the index values for the elements is dynamic (works for arrays of different lengths).
        //c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		//Comment: First int a new variable sum to hold the element in the array & Using the same trick from first array & loop for i = 0 & as long as i is less than ages2.length go through all remaining integers 
		//Comment: creating double average equaling the sum of all elements in the array then print double we created (average) 
		//-----------------------------------------------------------------------------------------------------------------------------------------
		
		String[] names = {"Sam", "Tommy","Tim","Sally","Buck", "Bob"};	
		int letter = 0;
		for (int i = 0; i < names.length; i++) {
			letter += names.length;
		} 
		char averageLetter = (char) (letter / names.length);
		System.out.println(names + " ");
		//Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
        ///a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
        //b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
        //Comment dont think my cod was gonna work any, im unsure of how to create the char i need
		
		//----------------------------------------------------------------------------------------------------------------------------
		//3. How do you access the last element of any array?
		//Answer(array.length -1)
		//------------------------------------------------------------------------------------------------------------------
		//4. How do you access the first element of any array?
		//Answer array[0]
		//------------------------------------------------------------------------------------------------------------------------
		int[] nameLengths;
		for (int i = 0; i < names.length; i++) {
			System.out.println(names.length);
		}
		
		//Comment not quite sure is this is even working properly or if this is 5 or 6 being answered 
		//Comment so confused?
		//5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
		//6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
		//------------------------------------------------------------------------------------------------------------------------
		System.out.println("Hello");
		String firstName = "Brian";
		String lastName = "Smith";
		
	}
	public static String greeting3 (String string, int n) {
		String greeting = "Hello"; 
        return greeting;
        
     //   7. Write a method that takes a String, word, and an int, n, as arguments and returns the 
     //word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
     //Comment I dont not understand where to place the values due to question requirements   
  }
    public static String fullName () {
    	return firstName;
    	
    //8. Write a method that takes two Strings, firstName and lastName, and returns a full name 
    //	(the full name should be the first and the last name as a String separated by a space).
    //Comment I know how to print t out but im lost on how the return is formed 	
    }
    //public static boolean () {
		//int sum = 100;
		//for (int i = 0; i > sum; i++) {
		//return (0);
		//Still dont completley understand methods so unable to complete the rest of the coding assignment
	   
}
