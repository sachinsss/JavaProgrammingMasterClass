public class CodingExercise17 {
    public static void main(String[] args) {

    }

    public static int getEvenDigitSum(int number) {
        int temp, sum=0;
        if(number<0) return -1;
        else {
            while(number!=0){
                temp=number%10;
                number=number/10;
                if(temp%2==0)sum+=temp;
            }
        }
        return sum;

    }
}
