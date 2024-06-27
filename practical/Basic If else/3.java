
class If{
	public static void main(String[] s)
	{
		int num=13;
		if(num>10 && num%2==0)
		{	
			System.out.println(num+" is even and greater than 10");
		}
		else if(num>10 && num%2!=0)
		{
			System.out.println(num+" is odd and greater than 10");
		}
		else if(num<10 && num%2==0)
		{

			System.out.println(num+" is even and less than 10");

		}
		else{

			System.out.println(num+" is odd0 and less than 10");
		}
	}
}
