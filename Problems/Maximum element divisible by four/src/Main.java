import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxNum = 0;
        int nums;
        for (int i = scanner.nextInt(); 0 < i; i--) {
            nums = scanner.nextInt();
            if (nums % 4 == 0 && nums > maxNum) {
                maxNum = nums;
            }
        }
        System.out.println(maxNum);
    }
}