public class CodingExercise22 {
    public static boolean isPerfectNumber(int num) {
        int sum=0;
        if(num<1)return false;
        else{
            for(int i=1;i<num;i++){
                if(num%i==0)sum+=i;
            }
        }
        return sum==num;
    }
}
