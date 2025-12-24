public class d2foreachloop {
    public static void main(String[] args) {
        // int [] marks={10,20,30,50};
        // System.out.println(marks[3]);
        // System.out.println(marks.length);//to find length of array
String [] student={"satyam","jasstin","nikhil","rohit"};

// System.out.println(student.length);//array has length property which gives the length of the array 
// System.out.println(student[0]);
// System.out.println(sent[1]);
// System.out.println(student[2]);
// System.out.println(student[3]);

// display the array (for loop)
//nive method

// for(int i=0;i<student.length;i++){
//     System.out.println(student[i]);
// }

// printing using while loop

// int i=0;
// while(i>student.length){
//     System.out.println(student[i]);
//     i--;
// }

// for each loop
for(String element: student){
    System.out.println(element);
}

    }
}
