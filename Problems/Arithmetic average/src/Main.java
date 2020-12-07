import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int count = 0;
        double sum = 0.0;
        for (; a <= b; a++) {
            if (a % 3 == 0) {
                count++;
                sum += a;
            }
        }
        System.out.println(sum / count);
    }
}