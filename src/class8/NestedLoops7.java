package class8;

public class NestedLoops7 {
    public static void main(String[] args) {
        /*
        0 1 2 3 4 5
        1 2 3 4 5
        2 3 4 5
         */

       /* for (int i = 0; i < 6; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
        for (int j = 1; j < 6; j++) {
            System.out.print(j+" ");

        }
        System.out.println();
        for (int k = 2; k < 6; k++) {
            System.out.print(k+" ");
        }
        System.out.println();

        */
        for (int i = 0; i < 3; i++) {
            for (int j = i; j <=5; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

















