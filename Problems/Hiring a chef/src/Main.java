//put imports you need here

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        String firstName = myScanner.next();
        myScanner.nextInt();
        myScanner.next();
        myScanner.nextInt();
        String cuisinePreference = myScanner.next();
        System.out.println("The form for " + firstName
                + " is completed. We will contact you if we need a chef that cooks " + cuisinePreference + " dishes.");

    }
}