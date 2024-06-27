 class Demo {
    public static void main(String[] args) {
        
        int x = 10 ;
        int y = 20 ;

        if( x >= 0 && y >= 0 ) {
            int prod = x * y  ;
            
            switch(prod % 2){
                case 0:
                    System.out.println("It is a even number");
                    break;
                case 1:
                    System.out.println("It is a Odd number");
                    break ;
            }
        }else {
            System.out.println("Sorry negative numbers are not allowed");
        }
        }
    }

