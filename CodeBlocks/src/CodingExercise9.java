public class CodingExercise9 {
    public static void main(String[] args) {
        printYearsAndDays(525600);
    }

    public static void printYearsAndDays(long minutes) {
        if(minutes<0) System.out.println("Invalid Value");
        else {
            int year, days, remainingDays;
            days =(int) (minutes / (24*60));
            year =(int) (minutes / (365*24*60));
            remainingDays = days%365;
            System.out.println(minutes+ " min = "+year+" y and "+remainingDays+" d");
        }
    }
}
