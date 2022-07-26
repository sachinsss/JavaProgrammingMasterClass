public class CodingExercise15 {
    public static void main(String[] args) {

    }

    public static boolean isPalindrome(int num) {
        int number=num,lsdnum, reverseNum=0;
                while(number!=0){
                    lsdnum=number%10;
                    number=number/10;
                    reverseNum=reverseNum*10+lsdnum;
                }
                return (reverseNum==num)?true:false;


    }
}
