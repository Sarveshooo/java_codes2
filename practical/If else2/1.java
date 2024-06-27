

class If{
	public static void main(String[] s){
		int num=0;
		if(true){
			System.out.println(num++ + ++num + ++num + ++num);
		}
		System.out.println(num-10);
		if(num>0){
			num=10;
		}
		System.out.println(num);
	}
}
			
