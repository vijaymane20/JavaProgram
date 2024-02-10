package SimpleJavaPrograms;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 20,i;
		int count; //Reset the count for each 'i'
		
		
		// Iterate from 1 up to 'num' to identify prime numbers
	    for (i = 1; i <= num; i++) {
	      count = 0;  // Reset counter for each 'i'

	      // Check for divisibility from 2 up to i/2
	      for (int j = 2; j <= i / 2; j++) {
	        if (i % j == 0) {
	          count++;  // Increment if 'i' is divisible by 'j'
	          break;  // Exit loop if a divisor is found
	        }
	      }

	      // If the count is 0, 'i' is prime
	      if (count == 0) {
	        System.out.println(i);  // Output the prime number
	      }
	    }
	}

}
