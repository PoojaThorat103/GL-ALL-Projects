package org.example.JavaProgrameTest;

public class JavaTest {

    public static void main (String [] args){

       // 1. Single Dimensional Array in Java ------------------------------------------

        int [] value = new int[5];
        value[0]= 10;
        value[1]= 20;
        value[2] = 30;
        value[3]= 40;
        value[4] = 50;

        for(int i=0; i<value.length; i++){
            System.out.println(value[i]);
        }
               //* for (type variableName : arrayName) {
                    // code block to be executed
                //*

        // For-Each Loop
        for(int aa : value){
            System.out.println(aa);
        }

        //  NOTE :  Another way to Declare, Create and initialsation [another way to create array]

        int [] pra ={10,30,40,88,92};
        System.out.println("--------" +pra[3]);

        for(int aac : pra){
            System.out.println(aac);
        }

    }

    public static class JavaTest3 {

        // Multidimensional Array in Java :2D AND 3D
        // currently will see 2D array


       // ======== 1. way to Declare, create, initialize the array ================
        public static void main ( String [] args){

            /*int[][] ab = new int[2][3];

            ab[0][0]=10;
            ab[0][1]=20;
            ab[0][2]=30;
            ab[1][0]=40;
            ab[1][1]=50;
            ab[1][2]=60;
        System.out.println(ab[0][0]);*/

            // ======== 2. way to Declare, create, initialize the array ================
             int [][] abc = {{10,20,30},{40,50,60}};
            System.out.println(abc[0][0]);

            for(int i=0; i< abc.length; i++){
                    for(int j=0;j<abc[i].length;j++){
                        System.out.print(abc[i][j] + " ");
                    }
                    System.out.println();
            }
        }
    }
}
