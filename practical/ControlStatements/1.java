
class Switch{
	public static void main(String[] args){
		int data=600;
		if(data<500){
			switch(data){
				case 100:
					System.out.println("1 Hundread");
				case 200:
					System.out.println("2 Hundread");
				case 300:
					System.out.println("3 Hundread");
				case 400:
					System.out.println("4 Hundread");
			}
		}else{
			if(data>500){
				switch(data){
				case 500:
					System.out.println("5 Hundread");
				case 600:
					System.out.println("6 Hundread");
				case 700:
					System.out.println("7 Hundread");
				case 800:
					System.out.println("8 Hundread");
				case 900:
					System.out.println("9 Hundread");
				}
			}else{
				System.out.println("Coder");
			}
		}
	}
}
