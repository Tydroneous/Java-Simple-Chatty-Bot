import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // get beginning / start time
        int firstHour = scanner.nextInt();
        int firstMin = scanner.nextInt();
        int firstSec = scanner.nextInt();
        // get end time
        int secondHour = scanner.nextInt();
        int secondMin = scanner.nextInt();
        int secondSec = scanner.nextInt();
        // convert hours and min to seconds
        int firstHourToSeconds = firstHour * 60 * 60;
        int firstMinToSeconds = firstMin * 60;
        int secondHourToSeconds = secondHour * 60 * 60;
        int secondMinToSeconds = secondMin * 60;
        // subtract second from first seconds for each time segment
        int hourCalc = secondHourToSeconds - firstHourToSeconds;
        int minCalc = secondMinToSeconds - firstMinToSeconds;
        int secCalc = secondSec - firstSec;
        // print out all seconds added together.
        System.out.println(hourCalc + minCalc + secCalc);
    }
}