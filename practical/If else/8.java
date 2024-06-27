


class If{
	public static void main(String[] s)
	{
		float m=85.00f;
		if(m>=75.00)
		{
			System.out.println(m +" Pass :1st class with Disti");
		}
		else if(m>=60.00 && m<75.00)
		{
			System.out.println(m +" Pass: 1st class ");
		}
		else if(m>=50.00 && m<60.00)
		{
			System.out.println(m +" Pass: 2st class ");
		}
		else if(m>=40.00&& m<50.00)
		{
			System.out.println(m +" Pass");
		}
		else{
		
			System.out.println(m +" Fail");
		}
	}
}
