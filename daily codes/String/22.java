
class Demo{
	public static void main(String[] args){
		
		String s1="a";
		System.out.println(s1);
		System.out.println(System.identityHashCode(s1));
		String s2="a";
		System.out.println(s2);
		System.out.println(System.identityHashCode(s2));
		String s3=new String("a");
		System.out.println(s2);
		System.out.println(System.identityHashCode(s3));
		String s4=new String("a");
		System.out.println(s2);
		System.out.println(System.identityHashCode(s4));
		

		
	}
}
