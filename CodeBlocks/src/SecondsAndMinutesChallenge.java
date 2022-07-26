public class SecondsAndMinutesChallenge {
    public static void main(String[] args) {
        System.out.println(getDurationString(3700));
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) return "Invalid value";
        else {
            int hours, remainingMinutes;                        //calculate hours and print in form xxh yym zzs
            hours = minutes / 60;
            remainingMinutes = minutes % 60;
            return (hours + "h " + remainingMinutes + "m " + seconds + "s");
        }
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) return "Invalid value";
        else {
            int minutes, remainingSeconds;                        //calculate hours and print in form xxh yym zzs
            minutes = seconds / 60;
            remainingSeconds = seconds % 60;
            return getDurationString(minutes, remainingSeconds);
        }
    }
}
