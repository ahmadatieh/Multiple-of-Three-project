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
    
  
  
  /*=======================================
    
    Do not modify the helper code below!
    But you'll learn something reading it...
        
   We'll learn about how this works *very soon*. If you're
   dying to find out, though, spoilers follow.
  
   This is support code provided to make your life easier.
   
   As we've learned this semester,
   our programs tend to run linearly: line 1, line 2, line 3
   
   We've seen two exceptions to this:
   
   1) With branching statements, like if-else, our program
      will move to one place in code or another depending on
      whether some condition(s) are true or false.
      
   2) With looping statements, like while and for, our program
      will run through some series of steps and then repeat those
      steps until some condition becomes false.
      
   We're about to reveal one more way in which your program's
   execution can jump around: method calling.
   You can think of methods kind of like mini-programs within
   your program that you give a name (an identifier!) and can
   then reuse whenever you want. We've discussed methods briefly,
   things like 'println' or Scannner's 'nextLine' or Math's
   'random'.
   
   What happens when your code above calls, or "invokes" the 
   `println` message is your program "jumps" to the `println`
   method that is defined below. It is passed one input, a 
   String named `message`. This method, in turn, calls the full
   System.out.println(String) method and passes along that message.
   Once that line of code is done running, the program will jump
   _back_ to where it was before and continue along -- kind
   of like inception. 
   
   We'll talk about writing our own methods soon. They're very powerful
   and awesome and da real mvp.
  */
  static void printLine(String message) {
    System.out.println(message);
  }
}