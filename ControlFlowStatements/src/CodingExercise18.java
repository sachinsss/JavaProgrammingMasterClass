public class CodingExercise18 {
    public static void main(String[] args) {

    }

    public static boolean hasSharedDigit(int num1, int num2) {
        int num1low, num1high, num2low, num2high;
        if(num1<10 || num1>99 ||num2<10 || num2>99) return false;
        else{
            num1low=num1%10;
            num2low=num2%10;
            num1high=num1/10;
            num2high=num2/10;
            if(num1low==num2high || num1low==num2low || num1high==num2high || num1high==num2low ) return true;
        }
        return false;
    }
}
