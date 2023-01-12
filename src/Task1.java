public class Task1 {
    public static void main(String[] args) {
        /*
        create a boolean variable Workday and assign true
        create int variable day and assign it to 1
        As long as it is workDay print "i need a day off" and increase day.
        Once day is 6 print "I do not need a day off anymore"

         */
        boolean workDay = true;
        int day = 1;
        while (workDay) {
            if (day <= 5) {
                System.out.println("i need a day off");
            } else {
                System.out.println("i do not need a day off");
                workDay = false;
            }
            day++; // it is equal to day=day+1  day++1
        }
    }
}
