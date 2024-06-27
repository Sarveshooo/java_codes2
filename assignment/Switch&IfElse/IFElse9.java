public class IFElse9 {
    public static void main(String[] args) {
        
        int  english = 65 ;
        int  math    = 76 ;
        int  marathi = 83 ;
        int  science = 95 ;
        int  geo     = 59 ;

        if( english >= 50 || math >= 50 || marathi >= 50 || science >= 50 || geo >= 50) {
            int marks  = (english + math + marathi + science + geo)/50;

            switch(marks){
                case 10:
                    System.out.println( "Excellent" );
                    break;
                case 9 :
                case 8 :
                    System.out.println("Very Good");
                    break;
                case 7 :
                case 6 :
                case 5 :
                    System.out.println("Good");
                    break;
                default :
                    System.out.println("Pass");
            }
        } else{
            System.out.println("Fail");
        }
    }
}
