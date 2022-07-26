public class CodingExercise5 {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        System.out.println(num1);
        System.out.println(num2);
        int integerNum1 = (int)(num1*1000);
        int integerNum2 = (int)(num2*1000);
        System.out.println(integerNum1);
        System.out.println(integerNum2);
        if(integerNum1 == integerNum2) return true;
        return false;

    }
}
