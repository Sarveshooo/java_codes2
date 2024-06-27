

class Continue{
	public static void main(String[] s){
		for(int i=1;i<50;i++){
			if(i%4==0 && i%5==0){
				continue;
			}System.out.println(i);
		}
	}
}
