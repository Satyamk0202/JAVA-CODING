public class d4praticeste03 {
    public static void main(String[] args) {
        float[] phymarks={100.2f,90.4f,80.5f,60.7f};
        float sum=0;
        
        
        for(int i=0;i<phymarks.length;i++){
            sum=sum+phymarks[i];
            System.out.println(sum);
             }
        System.out.println("the average value is "+sum/phymarks.length);
    }
    
}
