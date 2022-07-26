public class CodingExercise23 {
        // write your code here
        public static void main(String[] args) {
            numberToWords(10);
        }
        public static void numberToWords(int num) {
            int temp, reverseNum, zeroCounter=0;
            String result;
            if(num<0) System.out.println("Invalid Value");
            if(num==0) System.out.println("Zero");
            else {
                reverseNum=reverse(num);
                System.out.println(reverseNum);
                System.out.println(getDigitCount(num));
                System.out.println(getDigitCount(reverseNum));
                zeroCounter=getDigitCount(num)-getDigitCount(reverseNum);
                while(reverseNum!=0){
                    temp=reverseNum%10;
                    switch(temp){
                        case 0: System.out.println("Zero"); break;
                        case 1: System.out.println("One"); break;
                        case 2: System.out.println("Two"); break;
                        case 3: System.out.println("Three"); break;
                        case 4: System.out.println("Four"); break;
                        case 5: System.out.println("Five"); break;
                        case 6: System.out.println("Six"); break;
                        case 7: System.out.println("Seven"); break;
                        case 8: System.out.println("Eight"); break;
                        case 9: System.out.println("Nine"); break;
                    }
                    reverseNum=reverseNum/10;
                    for(int i=0;i<zeroCounter;i++)
                        System.out.println("Zero");
                }
            }
        }

        public static int reverse(int num) {
            int temp, reverseNum=0;
            while(num!=0){
                temp=num%10;
                num=num/10;
                reverseNum=reverseNum*10+temp;
            }
            return reverseNum;
        }
        public static int getDigitCount(int num) {
            if(num<0)return -1;
            if(num==0)return 1;
            int count=0;
            while(num!=0){
                count++;
                num=num/10;
            }
            return count;
        }
    }