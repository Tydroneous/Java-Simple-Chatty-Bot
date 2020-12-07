import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int largestInt = 2;
        long m = scanner.nextLong();
        long total = 1;
        while (true) {
            total *= largestInt;
            if (total > m) {
                System.out.println(largestInt);
                break;
            } else {
                largestInt++;
            }
        }
    }
}