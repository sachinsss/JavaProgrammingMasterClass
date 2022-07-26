public class CodingExercise16 {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(5));
    }

    public static int sumFirstAndLastDigit(int number) {
        int first=0, last=number%10, temp=0;
        if(number<0) return -1;
        else {
            while(number!=0){
                temp=number%10;
                number=number/10;
            }
            first=temp;
        }
        return (first+last);
    }
}
