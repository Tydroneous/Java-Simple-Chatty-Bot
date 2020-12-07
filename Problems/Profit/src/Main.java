import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int money = scanner.nextInt();
        int percent = scanner.nextInt();
        int kGoal = scanner.nextInt();
        int countYear = 0;
        double totalMoney = money;

        while (totalMoney < kGoal) {
            totalMoney += totalMoney * (percent / 100.0f);
            countYear++;
        }
        System.out.println(countYear);
    }
}