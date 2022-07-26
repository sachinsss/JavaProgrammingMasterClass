public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimeters(7,5));
    }

    public static double calcFeetAndInchesToCentimeters(int feet, int inches) {
        if ( feet <0 || inches <0 || inches>12 ) return -1;
        double cm;
        cm=feet*30.48 + 2.54*inches;
        return cm;
    }
    public static double calcFeetAndInchesToCentimeters(int inches) {
        if ( inches <0 ) return -1;
        int feet,remainingInches;
        double cm;
        feet=inches/12;
        remainingInches=inches%12;
        cm=calcFeetAndInchesToCentimeters(feet,remainingInches);
        return cm;
    }
}
