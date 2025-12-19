import java.util.Scanner;
public class b1praticeset {
    public static void main(String[]args){
        Scanner marks=new Scanner(System.in);
        System.out.println("enter your maths marks:");
        int maths=marks.nextInt();
         System.out.println("enter your physic marks:");
        int physic=marks.nextInt();
         System.out.println("enter your chemistery marks:");
        int chemistery=marks.nextInt();
         System.out.println("enter your english marks:");
        int english=marks.nextInt();
       
        int total=(maths+physic+chemistery+english)*100/400;
         System.out.println("your total marks:"+total);
if(maths>=34 && physic>=34 && chemistery>= 34 && english >=34 && total>=40){
    System.out.println("fail");
}  
    else{
        System.out.println("you are pass");
    }
    
    

}
    }

    
