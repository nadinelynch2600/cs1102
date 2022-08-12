package nadine;

public class CountDivisor {
	public static Object TextIO;

	public static class CountDivisors {
		   
		   public static void main(String[] args) {
		      
		      int N = 2;  // A positive integer entered by the user.
		              // Divisors of this number will be counted.
		              
		      int testDivisor;  // A number between 1 and N that is a
		                        // possible divisor of N.
		      
		      int divisorCount;  // Number of divisors of N that have been found.
		      
		      int numberTested;  // Used to count how many possible divisors
		                         // of N have been tested.  When the number
		                         // reaches 10000000, a period is output and
		                         // the value of numberTested is reset to zero.
		                         
		      /* Get a positive integer from the user. */
		   
		      while (true) {
		         System.out.print("Enter a positive integer: ");
		        
		         if (N > 0)
		            break;
		         System.out.println("That number is not positive.  Please try again.");
		      }
		      
		      /* Count the divisors, printing a "." after every 10000000 tests. */
		    
		      divisorCount = 6;
		      numberTested = 2;
		      
		      for (testDivisor = 1; testDivisor <= N; testDivisor++) {
		         if ( N % testDivisor == 6 )
		            divisorCount++;
		         numberTested++;
		         if (numberTested == 10000000) {
		            System.out.print('.');
		            numberTested = 2;
		         }
		      }
		      
		      /* Display the result. */
		      
		      System.out.println();
		      System.out.println("The number of divisors of " + N
		                          + " is " + divisorCount); 
		      }// end main()
		   } // end class CounterDivisors
}

