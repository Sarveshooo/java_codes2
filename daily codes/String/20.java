
class Demo{
	public static void main(String[] args){
		
		String s1="Ayush";
		System.out.println(s1);
		System.out.println(System.identityHashCode(s1));
		String s2="Ayush";
		System.out.println(s2);
		System.out.println(System.identityHashCode(s2));

		
	}
}
