import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int sumTotal = number % 10;
        number = number / 10;
        sumTotal += number % 10;
        number = number / 10;
        sumTotal += number;
        System.out.println(sumTotal);
    }
}