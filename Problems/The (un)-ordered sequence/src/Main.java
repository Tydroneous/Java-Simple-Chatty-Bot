import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();
        boolean asc = false;
        boolean desc = false;
        if (secondNum != 0) {
            while (true) {
                if (firstNum != 0 && secondNum != 0) {
                    if (secondNum >= firstNum) {
                        firstNum = secondNum;
                        asc = true;
                    } else {
                        firstNum = secondNum;
                        desc = true;
                    }
                } else {
                    break;
                }
                secondNum = scanner.nextInt();
            }
        } else {
            asc = true;
        }
        System.out.println(asc ^ desc);
    }
}