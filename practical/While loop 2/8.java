class While2{
	public static void main(String[] s){
		int n=256985;
		int t=n;
		int r=1;
		int p=1;
		System.out.print("Product of odd digit: ");
		while(t>0){
			r=t%10;
			if(r%2==1){
				p=r*p;
			}t=t/10;
		}
				System.out.print(p);
	}
}
