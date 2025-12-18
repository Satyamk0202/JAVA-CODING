import java.util.Scanner;

public class a4userinput {
    public static void main(String[] args) {
        System.out.println("taking user input");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1st number a:");
        int a =sc.nextInt();
        System.out.println("enter number b:");
        int b = sc.nextInt();
        int c=a+b;
        System.out.println("the sum of two numbers are:"+c);

    }
}
