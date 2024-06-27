class While2{
	public static void main(String[] s){
		int n=234;
		int t=n;
		int r=1;
		int p=1;
		System.out.print("");
		while(t>0){
			r=t%10;
			p=p*r;
			t=t/10;
		}
			System.out.print(p);
	}
}
