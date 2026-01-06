import java.util.Scanner;
public class a5rev {
    public static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your number here :");
        int n=sc.nextInt();
        int rev=0;
        while(n!=0){
            int lastdigit=n%10;
            rev=rev*10;
            rev +=lastdigit;
            n=n/10;
        }
        System.out.println(rev);

    }
}
