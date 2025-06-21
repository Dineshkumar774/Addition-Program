import java.util.Scanner;

public class Addition{
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number1:");
        int a=sc.nextInt();
        System.out.println("Enter number2:");
        int b=sc.nextInt();
        System.out.println("Addition of 2 numbers:" +(a+b));
        sc.close();
    }
}