 class student{
        String name;
        int age;
        double percentage;// if we create it inside a main function it will valid only inside the main function
 
   public void printdetails(){//method
    System.out.println("my name is :"+name);
    System.out.println("my age is "+age);

   } 
}
public class a1introduction{
    public static void main(String[] args) {
        student a1=new student();//declaration it creates a box and store the data in it
       //setting attributes
        a1.name="satyam";//initalizatation
        a1.age=21;
        a1.percentage=99.5;
        //printing attributes
        // objects are real life entity where as class are blue prints
       
student a2=new student();
a2.name="jasstin";
a2.age=1;
a2.percentage=99.99;
a1.printdetails();
        
    }
}