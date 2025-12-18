import java.util.Scanner;
public class b2switchcas {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your number:");
        int age=sc.nextInt();
        switch (age) {
            case 18:
                System.out.println("you are going to become adult:");
                break;
            case 19:
                System.out.println("you are an adult");
                break;
            case 22:
                System.out.println("you are getting an job");
                break;
            case 60:
                System.out.println("you are retired");
                break;
            default:
                System.out.println("enjoy your life");
                break;
        }
        System.out.println("thankyoufor using my code");
    }
}
