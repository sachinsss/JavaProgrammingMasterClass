public class CodingExercise26 {
    public static void main(String[] args) {

    }

    public static void printSquareStar(int num) {
        if(num<5) System.out.println("Invalid Value");
        else{
            for(int i=0;i<num;i++){
                for(int j=0;j<num;j++){
                    if(i==0||i==num-1||j==0||j==num-1||i==j||i+j==num-1){
                        System.out.print("*");
                    }
                    else System.out.print(" ");
                }
                System.out.println();
            }

        }

    }
}
