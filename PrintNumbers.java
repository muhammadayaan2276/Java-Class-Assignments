import java.util.Scanner;
public class PrintNumbers {
    public static void main (String[] args){
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        number = input.nextInt();
        if(number <=0){
            System.out.println("Enter a valid positive number");
        } else{
            int i = 1;
            while(i <= number ){
                System.out.println(i);
                i = i + 1;

            }
        }
        input.close();
    }
}