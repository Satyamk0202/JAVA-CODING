import java.util.Scanner;
public class a3 {
    //write a program to sum of given even number
    public static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your numbers here:");

        int num = sc.nextInt();
        int sum=0;
        for(int i=0;i<=num;i++){
            if(i %2 ==0){
                sum=sum+i;
            }

        }
        System.out.println("the sum of your num is:"+sum);

    }
}
