public class CodingExercise11 {
    public static void main(String[] args) {
        System.out.println(isCatPlaying(false,36));
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
       int upperLimit = (summer)?45:35;
       return ( (temperature>=25 && temperature<=upperLimit)?true:false );
    }
}
