class rectangle{
    int length;
    int breadth;
    public int area(){
        return length*breadth;
    }
    public int perimeter(){
        return 2*(length+breadth);
    }
}

public class a4 {
    public static void main(String[] args) {
        rectangle side= new rectangle();
    side.length=20;
    side.breadth=30;
    System.out.println("the area of rectangle is :"+side.area());

    }
}
