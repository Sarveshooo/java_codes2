

class IntegerCache{
	public static void main(String[] args){
		int x=65;
		int y=97;
		int z=66;
		char ch1='a';
		char ch2='B';
		System.out.println(System.identityHashCode(ch1));
		System.out.println(System.identityHashCode(x));
		System.out.println(System.identityHashCode(ch2));
		System.out.println(System.identityHashCode(y));
		System.out.println(System.identityHashCode(z));
	}
}
