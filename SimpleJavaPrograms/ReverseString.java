package SimpleJavaPrograms;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String input = "vijay";
		 
	        // convert String to character array
	        // by using toCharArray
	        char[] a = input.toCharArray();
	 
	        for (int i = a.length - 1; i >= 0; i--)
	            System.out.print(a[i]);
	    }

}
