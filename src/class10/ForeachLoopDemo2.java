package class10;

public class ForeachLoopDemo2 {
    public static void main(String[] args) {
       int[] arr={10,13,20,25,45,50};
       // arr[1]=0; this is how we update a single element in an array,its replace a numbers
       // print only the odd numbers from this array from the help of normal loop
        for (int i = 0; i < args.length ; i++) {

            if (arr[i]%2!=0){
                System.out.println(arr[i]);
            }
        }
        // replace all the odd numbers in this array with the help of a normal loop
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2!=0){
                arr[i]=0;
            }
        }
        System.out.println("after replacing all odd numbers with zeros");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
        }
    }

