class While2{
	public static void main(String[] s){
		int n=2469185;
		int t=n;
		int r=1;
		int p=1;
		int sq=1;
		System.out.print("");
		while(t>0){
			r=t%10;
			if(r%2==1){
				p=r*r;
				sq=sq+p;
			}t=t/10;
		}
				System.out.print(sq);
	}
}
