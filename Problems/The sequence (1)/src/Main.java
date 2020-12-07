import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numSequences = scanner.nextInt();
        int highest = -1;
        while (numSequences > 0 && numSequences <= 1000) {
            int input = scanner.nextInt();
            numSequences--;
            if (input > highest && input % 4 == 0) {
                highest = input;
            }
        }
        System.out.println(highest);
    }
}