package f;



public class recursion {
    
   
    //factorial(0)=1
    //factorial(n)=n*n-1...n
    //factorial(5)=5*4*3*2*1
    //factorial=n*factorial(n-1)
    static int factorila(int x){
if(x==0 || x==1){
    return 1;
}
else{
  int product=1;
  for(int i=1;i<=x;i++){
    product=product*i;
  }
  return product;
}
    }
    public static void main(String[] args) {
        int a=5;
        System.out.println("the factorial is:"+ factorila( a ));
         
    }
}
