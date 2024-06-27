
class Strin{
	public static void main(String[] args){
		
		String s1="c2w";
		System.out.println(s1);
		System.out.println(System.identityHashCode(s1));
		String s2="c2w";
		System.out.println(s2);
		System.out.println(System.identityHashCode(s2));
		String s3=new String("c2w");
		System.out.println(s2);
		System.out.println(System.identityHashCode(s3));
		String s4=new String("c2w");
		System.out.println(s2);
		System.out.println(System.identityHashCode(s4));
		

		
	}
}
