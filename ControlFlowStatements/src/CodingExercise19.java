public class CodingExercise19 {
    public static void main(String[] args) {

    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        int num1low, num2low, num3low;
        if(num1<10 || num1>1000 ||num2<10 || num2>1000 || num3<10 || num3>1000) return false;
        else{
            num1low=num1%10;
            num2low=num2%10;
            num3low=num3%10;
            if(num1low==num2low || num1low==num3low || num2low==num3low ) return true;
        }
        return false;
    }


    public static boolean isValid(int num) {
        if(num<10 || num>1000) return false;
        return true;
    }
}

