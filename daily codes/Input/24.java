import java.io.*;


class Demo24 {

        public static void main(String[] args) throws IOException {

                InputStreamReader isr =  new InputStreamReader(System.in);
                BufferedReader br  = new BufferedReader(isr);

                System.out.println(" Enter Company Name : ");
                String cmpName = br.readLine();

                System.out.println("Enter Employee Name : "  );
                String empName = br.readLine();
		
		int empId =  br.readLine();

                System.out.println("Company Name : " + cmpName);

                System.out.println("Employee Name : " + empName );

        }

}
