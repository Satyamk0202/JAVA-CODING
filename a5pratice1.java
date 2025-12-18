import java.util.Scanner;

public class a5pratice1 {
    public static void main(String[] args) {
        System.out.println("calculating no in cbse exam");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter maths number:");
        float maths=sc.nextFloat();
        System.out.println("enter english marks");
        float english=sc.nextFloat();
        System.out.println("enter science marks");
        float science=sc.nextFloat();
        System.out.println("enter hindi marks:");
        float hindi=sc.nextFloat();
        float totalpercentage=(maths+english+science+hindi)/400*100;
        System.out.println("total percentage:"+totalpercentage);

    }
}
