public class ForLoops {
    public static void main(String[] args) {
        /*
        PRINT NUMBERS FROM 8 TO 9
         */
        int number = 0;       // this is creating a variable of type int
        while (number < 10) { // checks the condition if condition is true or false
            System.out.println(number); // prints value of number on the console
            number++; // it adds one to the number variable
        }
           /*
           initialize ; condition ; incrementORdecrement)

            */
        for (int i = 0; i < 10; i++) { //i++ your number will go 1 2 3 4 5 6 7 8 9
            System.out.println(i);
        }
        // using a for loop print odd number from 1 to 20;

        for (int l = 1; l <= 20; l+=2) { // int l=1 l+=2 you got 1 3 5 7 9 11 13 15 17 19 odd, even will be (int l=2

            System.out.println(l);
        }
    }
}


