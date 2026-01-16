import java.util.Scanner;

public class PrintWithIncrement {
    public static void main(String[] args) {
       int n1,n2,n3;
       Scanner input = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        n1 = input.nextInt();
        System.out.println("Enter Second Number: ");
        n2 = input.nextInt();
        System.out.println("Enter Increment Value: ");
        n3 = input.nextInt();
        if(n1>n2){
            System.out.println("Invalid Input");
        } else{
            int i = n1;
            while (i<=n2){
                System.out.println(i);
                i = i + n3;
            }
        }
        input.close();
    }
}
