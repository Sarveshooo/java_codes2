


class If{
	public static void main(String[] s)
	{
		float p=85.00f;
		if(p>85.00)
		{
			System.out.println(p+" Medical");
		}else if(p<=85.00 && p>75.00){
			System.out.println(p+" Engineering");
		}else if(p<=75.00 && p>=65.00)
		{
			System.out.println(p+" Pharmacy");
		}else{
			System.out.println("Nothing");
		}
	}
}
