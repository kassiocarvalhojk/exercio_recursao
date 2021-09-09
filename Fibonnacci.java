/**
 * 
 */

/**
 * @author kassiocarvalho
 *
 */
public class Fibonnacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	}
	
		public int fibonacci(int n)  {
			
		    if(n == 0)
		        return 0;
		    else if(n == 1)
		      return 1;
		   else
		      return fibonacci(n - 1) + fibonacci(n - 2);
		System.out.print(fibonacci(5));
	}

}