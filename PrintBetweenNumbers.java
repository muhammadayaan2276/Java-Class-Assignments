import java.util.Scanner;

public class PrintBetweenNumbers {
    public static void main(String[] args) {
         int FirstNumber,SecondNumber;
         Scanner input = new Scanner(System.in);
         System.out.println("Enter First Number: ");
         FirstNumber = input.nextInt();
         System.out.println("Enter Second Number: ");
         SecondNumber = input.nextInt();
         if(FirstNumber>SecondNumber){
           System.out.println("Invalid Input");
         } else{
            int i = FirstNumber;
            while(i<=SecondNumber){
                System.out.println(i);
                i = i + 1;
         }
        }
        input.close();
    }
}

