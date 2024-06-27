import java.util.Scanner;


class Demo9 {

        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                System.out.print("Enter name : ");
                String name = sc.next();

                System.out.print("Enter College Name : ");
                String clgname = sc.next();

                System.out.print("Enter Student id : ");
                String studid = sc.next();
		
		System.out.print("Enter CGPA : ");
		String marks = sc.next();


                System.out.println("Name :" + name);
                System.out.println("College Name : " + clgname);
                System.out.println("Student ID : " + studid);
                System.out.println("CGPA : " + marks );
        }

}
