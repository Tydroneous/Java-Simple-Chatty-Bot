import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numReeses = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();

        boolean isSuccessfulWeek = numReeses <= 20 && numReeses >= 10 && isWeekend == false;
        boolean isSuccessfulWeekend = numReeses >= 15 && numReeses <= 25 && isWeekend == true;

        System.out.println(isSuccessfulWeek ^ isSuccessfulWeekend);
    }
}