
class For{
	public static void main(String... args){
		int n=23456789;
		for(;n!=0;n/=10){
			int temp=num%10;
			if(temp%2==0){
				System.out.println(temp*temp+" ");
			}
		}
	}
}
