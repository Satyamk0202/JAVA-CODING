public class d4praticeste05 {
    // write a java program to reverse an array swap two numbers
    public static void main(String[] args) {
        int [] marks={10,20,30,40,50};
        int l=marks.length;
        int n=Math.floorDiv(l, 2);//used to divide two numbers
        int temp;
        for(int i=0;i<n;i++){//i<n because we need only two swap to reverse the number
            temp=marks[i];
            marks[i]=marks[l-i-1];
            marks[l-i-1]=temp;
        }
        for(int element:marks){
            System.out.println(element);
         }

    }
}
