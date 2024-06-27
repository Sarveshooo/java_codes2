import java.util.Scanner;

class Square{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int numRows = scanner.nextInt();
        
        for (int i = 1; i <= numRows; i++) {
            if (i % 2 == 0) {
                int start = numRows * numRows;
                for (int j = 1; j <= numRows; j++) {
                    System.out.print(start + " ");
                    start--;
                }
            }
            else {
                int start = numRows;
                for (int j = 1; j <= numRows; j++) {
                    if (j % 2 == 0) {
                        System.out.print(start + " ");
                    } else {
                        System.out.print((numRows * numRows) + " ");
                    }
                    start--;
                }
            }
            System.out.println();
        }
        
        scanner.close();
    }
}

