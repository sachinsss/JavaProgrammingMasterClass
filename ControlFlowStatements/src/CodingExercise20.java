public class CodingExercise20 {
    public static int getGreatestCommonDivisor(int first, int second) {
        int gcd=-1;
        if( first<10 || second<10) return -1;
        else {
            for(int i=2;i<first;i++){
                if(first%i==0 && second%i==0)
                    gcd=i;
            }
        }
        return gcd;
    }
}
