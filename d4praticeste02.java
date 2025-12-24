//write a program to find wheter the given integer is present in array or not
public class d4praticeste02 {
    public static void main(String[]args){
        int[] marks ={10,100,99,40};
        int num=99;
        boolean isinarray=true;
        for(int i=0;i<marks.length;i++){
       if(num==i){ 
        isinarray=true;
        break;
        }
    }
    if(isinarray){
        System.out.println("the value is preset in the array:");
    }
    else{
        System.out.println("the value is not present:");
    }
        
    }
    
}
