import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();
        int thirdNum = scanner.nextInt();
        boolean result = firstNum + secondNum == 20 || firstNum + thirdNum == 20 || secondNum + thirdNum == 20;
        System.out.println(result);
    }
}