
/*   *****           i = 1  0
      *****		     i = 2  1
	   *****	     i = 3  2
	    *****        i = 4  3
		 *****       i = 5  4  

*/ 

class Demo {
	public static void main(String[] args) {

		int n = 5;
		for (int i = 1; i <= n; i++) {
			// inner loop for spaces
			for (int j = 1; j <= i-1 ; j++) {
				System.out.print("   ");
			}
			// 1st inner loop for numbers
			for (int j = 1 ; j <= n; j++) {
				System.out.print(  " * ");
			}
			// 2nd inner loop for numbers
			/*for (int j = 1; j <= i; j++) {
				System.out.print(j + "  ");
			}*/
			System.out.println();
		}
	}
}
