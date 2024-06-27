

class If{
	public static void main(String[] s){
		int num=10;
		if(num%2==0 && num%5==0 && num%10==0)
		{
			System.out.println(num+" is divisible by 2,5 and 10");
		}
		else{

			System.out.println(num+" is not divisible by 2,5 and 10");
		}
	}
}
