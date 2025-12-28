public class e1methods {
    static int logic(int x, int y){
        int z;
        if(x>y){
            z=x+y;
        }
        else{
            z=(x+y)*5;
        }
        return z;
    }
    public static void main(String[] args) {
        int a=5;// the value of a and b will  be copied in x and y
        int b=7;
        int c;
        //if we dont do static we have to create an object
      //  e1methods obj=new e1methods();
        //c=obj.logic(a,b );
        c=logic(b, a);
        int a1=6;
        int b1=3;
        int c1;
       // c1=obj.logic(a1, b1);
       c1=logic(b1, a1);//it will use logic of the upper logic given
        System.out.println(c);
        System.out.println(c1);

//
    }
    
}
