public class d3multidimensionalarray {
    public static void main(String[] args) {
        //multidimension array are array inside array
        // their are two d array 3d array we will not go to 4d array as it is more complex
        // multidimension 2Darray
        //int []marks;//1d array
        int [][]flats;//2d array
        flats=new int[2][3];//2 rows and 3 coloum
        flats[0][0]=101;
         flats[0][1]=102;
         flats[0][2]=103;
          flats[1][0]=201;
           flats[1][1]=202;
            flats[1][2]=203;
             
            for(int i=0;i<flats.length;i++){
                for(int j=0;j<flats[i].length;j++){
                System.out.println(flats[i][j]);
                }
            }
    }
    
}
