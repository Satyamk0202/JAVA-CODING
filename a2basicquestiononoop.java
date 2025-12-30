class student{
 int salary;
 String name;
 public int getSalary(){
    System.out.println("my salary is:"+salary);
    return salary;
   }
   public String getname(){
  return name;
    }
    public void  setName(String n){
        name= n;
    }
    public void setSalary(int s){
        salary=s;
    }
    
 }
 public class a2basicquestiononoop {
    public static void main(String[] args) {
        student x1=new student();
        x1.setName("satyam");
        x1.setSalary(200000);
        x1.getname();
        x1.getSalary();
       
    }
}
