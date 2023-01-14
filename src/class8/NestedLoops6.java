package class8;

public class NestedLoops6 {
    public static void main(String[] args) {
        /*
        1 2 3 4 5
        1 2 3 4 5
        1 2 3 4 5
         */
       /*
        for (int i = 0; i < 3; i++) {  //print out line 3 times

            for (int j = 1; j < 6; j++) { // print numbers 1 to 5
                System.out.print(j + " "); // adding space after each number
            }
            System.out.println(); // prints one after another
        */
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
    }
}














