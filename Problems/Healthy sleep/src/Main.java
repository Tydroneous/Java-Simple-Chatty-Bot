import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int shouldSleep = scanner.nextInt();
        int noMoreThan = scanner.nextInt();
        int actualHours = scanner.nextInt();

        if (actualHours < shouldSleep) {
            System.out.println("Deficiency");
        } else if (actualHours <= noMoreThan) {
            System.out.println("Normal");
        } else {
            System.out.println("Excess");
        }
    }
}