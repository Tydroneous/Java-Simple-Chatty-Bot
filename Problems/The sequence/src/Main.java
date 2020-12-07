import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        int tracker = 0;
        for (int input = scanner.nextInt(); count <= input; count++) {
            for (int j = 1; j <= count; j++) {
                if (tracker != input) {
                    tracker++;
                    System.out.print(count + " ");
                } else {
                    break;
                }
            }
        }
    }
}