class While2{
	public static void main(String[] s){
		int n=2569185;
		int t=n;
		int r=1;
		int c=1;
		System.out.print(" ");
		while(t>0){
			r=t%10;
			if(r%2==0){
				c=r*r*r;
				System.out.print(c+" ");
			}t=t/10;
		}
	}
}
