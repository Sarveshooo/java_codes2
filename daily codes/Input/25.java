import java.io.*;


class Demo25 {

        public static void main(String[] args) throws IOException {

                InputStreamReader isr =  new InputStreamReader(System.in);
                BufferedReader br  = new BufferedReader(isr);

                System.out.println(" Enter Company Name : ");
                String cmpName = br.readLine();

                System.out.println("Enter Employee Name : "  );
                String empName = br.readLine();
		
		System.out.println("Enter Employee Id : ");
		int empId = Integer.parseInt(br.readLine());

                System.out.println("Company Name : " + cmpName);

                System.out.println("Employee Name : " + empName );

                System.out.println("Employee Id : " + empId );
        }

}
