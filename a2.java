import java.util.Scanner;
public class a2 {
    public static void main() {
        //wap to print product of digits of a given number
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your numbe");
        int n = sc.nextInt();
        int product=1;
       while (n !=0){
           int digit=n%10;
           product=product*digit;
           n=n/10;


        }
        System.out.println(product);
    }
}
