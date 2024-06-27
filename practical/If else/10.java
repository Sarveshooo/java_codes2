

class If{
	public static void main(String[] s)
	{
		int a=2;
		if(a<=0){
			System.out.println("Temp is -ve");
		}else if(a>=15 && a>0){
			System.out.println("Temp is cold");
		}else if (a>15 && a<40){	

			System.out.println("Temp is Normal");
		}else{

			System.out.println("Temp is Hot");
		}
	}
}


