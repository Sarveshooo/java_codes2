
class Demo{
	public static void main(String[] s)
	{
		int x=14;
		int y=22;
		System.out.println(++x + y++);				//37/
		System.out.println(++x + ++x + ++x + ++x);		//70
		System.out.println( y++ + ++x + ++x);			//64
	}
}
