package class10;


import java.util.Arrays;
import java.util.Scanner;

public class ForeachLoopDemo5 {
          public static void main(String[] args) {
              // create  empty array of 5      int[] numbers=new int[5];
              Scanner scanner=new Scanner(System.in);
              System.out.println("please enter 5 numbers");
            int[] numbers=new int[5];
            // store same value elements inside AND THIS METHOD CAN MANUALLY STORE
              /*
               numbers[0]=40;
              numbers[1]=50;
              numbers[3]=60;
              numbers[2]=70;
              numbers[4]=80;

              /*
              numbers[0]=scanner.nextInt();
              numbers[1]=scanner.nextInt();
              numbers[3]=scanner.nextInt();
              numbers[2]=scanner.nextInt();
              numbers[4]=scanner.nextInt();
              */
              //BELOW CODE USES A NORMAL FOR LOOP TO ASK THE USER FOR NUMBERS AND STORE THEM IN THE ARRAY
              for (int i = 0; i < numbers.length; i++) {
                  numbers[i]=scanner.nextInt();
              }
              System.out.println(Arrays.toString(numbers));
              }
          }






