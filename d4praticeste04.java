public class d4praticeste04{
  //write a java programto add two matrix of 2*3  
    public static void main(String[] args) {
        int [][]matrix1={{1,2,4},{3,4,5}};
        int [][]matrix2={{5,4,7},{6,7,8}};
        int [][]result={{0,0,0},{0,0,0}};
        for(int i=0;i<matrix1.length;i++){
            for(int j=0;j<matrix1[i].length;j++){
System.out.format("i=%d and j=%d\n",i,j);
                result[i][j]=matrix1[i][j]+matrix2[i][j];
                
            }

            //for pronting the result
        }
//          for(int i=0;i<result.length;i++){
//             for(int j=0;j<result[i].length;j++){
// System.out.print(result[i][j]+" ");
//                 result[i][j]=matrix1[i][j]+matrix2[i][j];
               
//             }
//         System.out.println(" ");
//         }
}
}
