package class8;

public class NestedLoops4 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {  // outer for loop  // we will get 3 line with 7 star
            for (int j = 0; j < 5; j++) { // inner for loop
                if (j == 1 || j == 2)
                    continue;
            }
            System.out.print("*");
        }

    }
}






