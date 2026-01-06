//import java.util.Scanner;
//public class a4 {
//    public static void main(String[]args){
//        int [] mark={10,20,30,40,50};
//        int n=Math.floorDiv(mark.length,2);
//        int temp;
//        for (int i=0;i<n;i++){
//            temp =mark[i];
//            mark[i]=mark[mark.length-i-1];
//            mark[mark.length-i-1] = temp;
//
//        }
//        for(int element:mark){
//            System.out.println(element);
//        }
//
//    }
//}
import java.util.Scanner;
public class a4{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your number here:");
        int n=sc.nextInt();
        int sum=0;
        while(n!=0){
            int lastDigit=n%10;
            sum=sum+lastDigit;
            n=n/10;
        }
        System.out.println(sum);
    }



}