import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();

        int lastDigit = input % 10;
        input = input / 10;
        int secondToLast = input % 10;

        input = input / 10;

        int secondNum = input % 10;

        int firstNum = input / 10;

        if (firstNum == lastDigit && secondNum == secondToLast) {
            System.out.println(1);
        } else {
            System.out.println(37);
        }
    }
}