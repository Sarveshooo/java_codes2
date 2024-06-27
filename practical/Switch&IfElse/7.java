class Demo {
    public static void main(String[] args) {
        
        int budget = 10000 ;
        if(budget == 15000){
            System.out.println("For budget " + budget + "rs destination is Jammu and Kashmir .");
        }else if(budget == 10000){
            System.out.println("For budget " + budget + "rs destination is Manali . ");
        }else if(budget == 6000){
            System.out.println("For budget " + budget + "rs destination is Amritsar .");
        }else if(budget == 2000){
            System.out.println("For budget " + budget + "rs destination is Mahabaleshwar .");
        }else {
            System.out.println("For other budget try next time .");
        }
    }
}
