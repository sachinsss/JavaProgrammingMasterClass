public class CodingExercise25 {

        public static int getLargestPrime (int number) {
            if (number<2) return -1;
            for (int i=number/2; i>1; i--) {
                if(number%i==0) {number=i;break;}
            }
            return number;
        }

    public static void main(String[] args) {
        System.out.println(getLargestPrime(45));
    }

}
