package f;
import java.util.Scanner;
public class countvou{
    static void character(char a){
 
        char []vowel={'a','e','i','o','u','A','E','I','O','U'};
        boolean isvowel=false;
for(int i=0;i<=vowel.length;i++){
    if(a == 'a' || a == 'e' || a == 'i' || a=='u' || a=='A' || a == 'E' || a=='I' || a == 'O' || a == 'U'){
            isvowel=true;
            break;
}
    }
        
 
      if (isvowel){
        System.out.println("it is a vowel");
      }
        else{

            System.out.println("it is not a voul");
        }
    
}
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your char");
        char x=sc.next().charAt( 1);
    character(x);

}
   
    }



    
    

