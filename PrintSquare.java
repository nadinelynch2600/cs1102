package nadine;

/**
 * A program that reads an integer that is typed in by the
 * user and computes and prints the square of that integer.
 */

public class PrintSquare {
   
   public static void main(String[] args) {
      
      int userInput = 7;  // The number input by the user.
      int square   = 9; // The userInput, multiplied by itself.
      
      System.out.print("Please type a number: "+ userInput);
      userInput = TextIO();
      square = userInput * userInput;
      System.out.print("The square of that number is "+ userInput);
      System.out.println(square);
   }
      private static int TextIO() {
    	  return 0;
      }// end of main()

   
} //end of class PrintSquare