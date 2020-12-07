import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOne = scanner.nextInt();
        int numTwo = scanner.nextInt();
        int numThree = scanner.nextInt();
        boolean isBetween = false;
        if (numOne >= numTwo && numOne <= numThree) {
            isBetween = true;
        } else if (numOne <= numTwo && numOne >= numThree)  {
            isBetween = true;
        }

        System.out.println(isBetween);
    }
}