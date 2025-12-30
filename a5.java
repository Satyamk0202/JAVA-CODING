class circle {
    int radius;
    int pi;
    public int area(){
        return pi*radius*radius;
    }
    public int parameter(){
        return 2*(pi*radius*radius);
    }

    }
public class a5 {
    public static void main(String[] args) {
        circle x1=new circle();
        x1.radius=2;
        x1.pi=2;
        System.out.println("the area of the circle is "+x1.area());
    }
    
}
