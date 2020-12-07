import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int heightOfBus = scanner.nextInt();
        int numBridges = scanner.nextInt();
        int i;
        boolean willCrash = false;
        for (i = 1; i <= numBridges; i++) {
            int bridgeHeight = scanner.nextInt();
            if (heightOfBus < bridgeHeight) {
                continue;
            } else {
                willCrash = true;
                break;
            }
        }
        System.out.println(willCrash ? "Will crash on bridge " + i : "Will not crash");
    }
}