public class ForLoop3 {
    public static void main(String[] args) {
        // 1 2 4 5 7 8 10 11 12 13 14 16 17 19;
        for (int i = 0; i < 20; i++) {
            if (i % 3 != 0) { // this conditions divides all the num by 3 and check if reminder is 0
                System.out.println(i);

            }
        }
    }
}
