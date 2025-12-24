// create an array of five float numbers and add their sum
public class d4praticeset01 {
    public static void main(String[] args) {
        float [] marks={10.4f,20.5f,30.6f,40.7f};
        float sum=0;
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
            sum=sum+marks[i];
        }
        
            System.out.println("sum="+sum);
    }
    
}
