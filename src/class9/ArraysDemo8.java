package class9;

import org.w3c.dom.ls.LSOutput;

public class ArraysDemo8 {
    public static void main(String[] args) {
        //create a program that can tell us how many time the number 10.5 is present in the array
       double[] arr={10.5,12.0,45,10.5,23,10.5};
        int count=0; // create a variable
        for (int i = 0; i < arr.length; i++) { //
            if (arr[i]==10.5){  // loop to ask how many times the number 10.5 shows
                    count++; // can be written count=count+1; // to tell us how many times 10.5 shows
        }
    }
        System.out.println(count);




    }
}














