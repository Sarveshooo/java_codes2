import java.util.Scanner;


class Demo11 {

        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                System.out.print("Enter name : ");
                String name = sc.next();

                System.out.print("Enter College Name : ");
                String clgname = sc.next();

                System.out.print("Enter Student id : ");
                int studid = sc.nextInt();

                System.out.print("Enter CGPA : ");
                float marks = sc.nextFloat();


                System.out.println("Name :" + name);
                System.out.println("College Name : " + clgname);
                System.out.println("Student ID : " + studid);
                System.out.println("CGPA : " + marks );
        }

}
