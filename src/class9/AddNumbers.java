package class9;

public class AddNumbers {
    public static void main(String[] args) {
        // add all th numbers from below loop
        int sum=0;
        for (int i = 0; i < 4; i++) {

           sum=sum+i;
        }
        System.out.println(sum); // when system.out.println is out of the loop{} it will print only final result
    }
}
