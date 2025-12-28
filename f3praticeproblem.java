package f;
//sum of n natural num
public class f3praticeproblem {
    static void naturalno(int n){
        int sum=0;
        for(int i=0;i<=n;i++){
            sum=sum-i;

        }
        System.out.println("your sum is"+sum);
    }
    public static void main(String[] args) {
        naturalno(88);
    }
}
