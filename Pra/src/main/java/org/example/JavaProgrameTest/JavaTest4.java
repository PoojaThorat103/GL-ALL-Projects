package org.example.JavaProgrameTest;

public class JavaTest4 {

    // Jagged Array : Number of columns are not same for that array we called : Jagged Array
        public static void main ( String [] args){

            int [][] JArray = new int[2][]; // only will mention number of rows will not mention number of columns
            JArray[0]= new int[4]; // mention number of columns like here 0th row will have 4 columns
            JArray[1] = new int[3];

            // Another way to Declare, Create and initialsation

            int [][] JArr ={{10,20,30,40},{50,60,70}};
            System.out.println(JArr[0][2]);
    }

}
