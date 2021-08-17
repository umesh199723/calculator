import java.util.Scanner;

public class Main {
    
    public static int addNo(int firstNo, int secondNo) {
        return firstNo + secondNo;
    } 
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter First Number :");
        int firstNo = scan.nextInt();
        
        System.out.println("Enter Second Number :");
        int secondNo = scan.nextInt();

        int result = addNo(firstNo, secondNo);

        System.out.println("Result = "+result);
    }
}