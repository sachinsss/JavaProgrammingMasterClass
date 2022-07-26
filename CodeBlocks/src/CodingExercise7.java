public class CodingExercise7 {
    public static void main(String[] args) {

    }

    public static boolean hasTeen(int n1, int n2, int n3) {
        if(isTeen(n1)) return true;
        else if(isTeen(n2)) return true;
        else if(isTeen(n3)) return true;
        return false;
    }
    public static boolean isTeen(int num){
        return (num >= 13 && num <= 19);
    }
}
