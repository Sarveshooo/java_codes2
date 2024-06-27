
class For{
	public static void main(String[] s){
		int n=301071;
		int nv=0;
		int temp=n;
		while(temp!=0){
			nv=nv*10+(temp%10);
			temp/=10;
		}
		System.out.println(temp);
		System.out.println(nv);
		System.out.println(n);
	}
}


