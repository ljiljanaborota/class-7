package class9;

public class ArraysDemo2 {
    public static void main(String[] args) {
        // write code to STORE THOSE NUMBERS IN A ARRAY  10 20 30 40 50
        // write code to add all of those numbers

        int  []  numbers={10,20,30,45,50};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        int sum=0;
        for (int i = 0; i < numbers.length; i++) {
            sum=sum+numbers[i]; // adding all the numbers
        }
        System.out.println(sum);
        }


        }



