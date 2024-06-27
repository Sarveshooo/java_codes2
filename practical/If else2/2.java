


class If{
	public static void main(String [] s){
		int n='Z';
		if(true){
		
			System.out.println(--n + --n + --n +--n);
			n--;
		}
		System.out.println(n);
		if(n<20){
			n='A';
		}
		System.out.println(n);
	}
}
