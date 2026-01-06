import java.util.Scanner;
public class a1 {
    public static void main() {
        // wap to print sum of digits of a given number
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the size of array:");
//        int n=sc.nextInt();
//        int [] no=new int[n];
        int [] no={1,2,3,4,5};
        int sum=0;
        //System.out.println("enter"+n+"elements:");
        for(int i=0;i<no.length;i++){
            sum+=no[i];
        }
        System.out.println(sum);
    }
}
