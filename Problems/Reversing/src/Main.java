import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int myInput = scanner.nextInt();

        int a = myInput % 10;
        int b = (myInput % 100) / 10;
        int c = myInput / 100;
        if (a != 0) {
            System.out.print(a + "" + b + "" + c);
        } else {
            System.out.println(b + "" + c);
        }
    }
}