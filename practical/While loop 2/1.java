class While2{
	public static void main(String[] s){
		int n=2569185;
		int t=n;
		int r=1;
		System.out.print("Digit divisible by 2 are: ");
		while(t>0){
			r=t%10;
			if(r%2==0){
				System.out.print(r+" ");
			}t=t/10;
		}
	}
}
