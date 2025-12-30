class square{
    int side;

public  int area(){
    
   return side*side;
}
public int  parameter(){
return 4*side;
}
}
public class a3 {
    public static void main(String[] args) {
        
    
    square x1=new square();
    x1.side=2;
    System.out.println(x1.area());
}
}