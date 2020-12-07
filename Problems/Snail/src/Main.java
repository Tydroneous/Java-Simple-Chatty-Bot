import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int progress = 0;
        int day = 0;
        int height = scanner.nextInt();
        int upPerDay = scanner.nextInt();
        int downPerNight = scanner.nextInt();
        while (true) {
            day += 1;
            progress += upPerDay;
            if (progress >= height) {
                System.out.println(day);
                break;
            } else {
                progress -= downPerNight;
            }
        }
    }
}