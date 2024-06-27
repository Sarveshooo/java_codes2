class If{
	public static void main(String[] s){
		char ch=97;
		if(ch==97  && ch<=122)
		{
			System.out.println(ch+" is in lower case");
		}
		else if(ch>=65 && ch<=90){

			System.out.println(ch+" is in Upper case");}
		else{
			System.out.println("Other character");
		}
	}
}

