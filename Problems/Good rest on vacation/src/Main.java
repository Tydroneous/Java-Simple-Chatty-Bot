import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // get initial input
        int duration = scanner.nextInt();
        int foodCostPerDay = scanner.nextInt();
        int oneWayFlight = scanner.nextInt();
        int hotelPerNightCost = scanner.nextInt();
        // perform calculations
        int totalFood = duration * foodCostPerDay;
        int totalFlight = oneWayFlight * 2;
        int hotelTotal = hotelPerNightCost * (duration - 1);
        // print total
        System.out.println(totalFood + totalFlight + hotelTotal);
    }
}