import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d = 0;
        int c = 0;
        int b = 0;
        int a = 0;
        int grade;
        for (int totalGrades = scanner.nextInt(); 0 < totalGrades; totalGrades--) {
            grade = scanner.nextInt();
            if (grade == 2) {
                d++;
            } else if (grade == 3) {
                c++;
            } else if (grade == 4) {
                b++;
            } else if (grade == 5) {
                a++;
            }
        }
        System.out.println(d + " " + c + " " + b + " " + a);

    }
}