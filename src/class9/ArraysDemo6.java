package class9;

public class ArraysDemo6 {
    public static void main(String[] args) {
       // create the empty array and then store 45 44 33 20 and 10 in it.
        // then use a loop to add all the elements which are present on even index and print


        int [] numbers= new int[5]; // // this is how to create empty array
        numbers[0]=45; // loop to create array to store them
        numbers[1]=44;
        numbers[2]=33;
        numbers[3]=20;
        numbers[4]=10;
        int sum=0; // loop to add elements
        for (int i = 0; i < numbers.length ; i++) { //loop to store  all the elements
            if (i % 2 == 0) { // loop for even numbers
                sum = sum + numbers[i]; // loop to add that numbers
            }
        }
            System.out.println(sum); //how to print them but just last number--out of the {} you have to open new




            }
        }









