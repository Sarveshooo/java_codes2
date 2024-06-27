

class IntegerCache{
	public static void main(String[] args){
		int x=9;
		char ch2='9';
		int y=57;
		System.out.println(System.identityHashCode(ch2));
		System.out.println(System.identityHashCode(x));
		System.out.println(System.identityHashCode(y));
	
	}
}
