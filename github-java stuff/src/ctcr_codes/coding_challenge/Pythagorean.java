package coding_challenge;

public class Pythagorean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 1000;
		calculate(sum);

	}
	
	private static void calculate(int value) {

	    int a, b, c;
	    
	    int sroot = (int)Math.sqrt(value);
	    
	    for (int n = 1; n <= sroot; n++) {
	        for (int m = n+1; m <= sroot; m++) {
	        	
	            a = m*m - n*n;
	            b = 2*m*n;
	            c = m*m + n*n;
	            
	            if ( a + b + c == 1000 ) {
	                System.out.println("the product is " + a*b*c);
	                return;
	            }
	        }
	    }
	}

}
