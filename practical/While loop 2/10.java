class While2{
	public static void main(String[] sq){
		int n=9367924;
		int t=n;
		int r=1;
		int s=0;
		int p=1;
		System.out.print("");
		while(t>0){
			r=t%10;
			if(r%2==0){
				p=p*r;
			}else{
				s=s+r;
			}t=t/10;
		}
				System.out.print(s+" ");
				System.out.print(p);
	}
}
