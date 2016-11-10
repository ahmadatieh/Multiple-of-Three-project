import java.util.Scanner;

/******************************************************************
 * Lab 2
 *
 * Programmer: Ahmad Atieh
 * 
 * ONYEN: aatieh
 *
 * Due Date: 10/21/2015 at 11:55pm
 *
 * COMP110-002/3, Fall 2015       Instructor: Kris Jordan
 *
 * Pledge: I have neither given nor received unauthorized aid
 *         on this program. 
 *
 * Description: 
 *         This program uses an array to store values which are 
 *         multiples of three and then runs computations on them.
 *
 * Input:  The user provides the size of the array to create. The user
 *         is then asked for that many multiples of 3. Finally the user
 *         selects the mathematical operation to do over those numbers.
 *
 * Output: The sum and/or average of the numbers input.
 *
 ******************************************************************/

public class Lab2 {

  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    
    printLine("Welcome!");
    
    int input1;
    printLine("Please enter multiplesOfThree's desired size:");
    input1 = keyboard.nextInt();
    int[] multiplesOfThree;
    multiplesOfThree = new int[input1];
 
    int input2;
    for (int i = 0; i < input1; i++){
    	printLine("Please enter an integer that is a multiple of 3.");
    	input2 = keyboard.nextInt();
       if(input2 % 3 == 0 ){
     multiplesOfThree[i] = input2;
    } else if (input2 % 3 != 0){
    i--;
    printLine("That is not a multiple of 3. Try again!");
   
    	}
    }
    int input3; 
    printLine("What operation would you like to perform on the array?");
    printLine("1: Compute the sum");
    printLine("2: Compute the average");
    printLine("3: Compute both");
    input3 = keyboard.nextInt();
    int sum = 0;
    double average = 0.0;
    if (input3 == 1){
    for (int i =0; i < multiplesOfThree.length; i++){
    sum = sum + multiplesOfThree[i];
    }
    printLine("The sum is " + sum);
    }else if (input3 == 2){
    for (int i =0; i < multiplesOfThree.length; i++){
    sum = sum + multiplesOfThree[i];
    average = sum / multiplesOfThree.length;
    }
    printLine("The average is " + average);
    }else if (input3 == 3){
    for (int i =0; i < multiplesOfThree.length; i++){
    sum = sum + multiplesOfThree[i];
    average = sum / multiplesOfThree.length;
    }
    printLine("The sum is " + sum);
    printLine("The average is " + average);
    }else{
    printLine("Unrecognized Option");
    }  
  }
    
  
  
  /*=======================================*/
    
  
  static void printLine(String message) {
    System.out.println(message);
  }
}
