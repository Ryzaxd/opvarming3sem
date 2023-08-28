import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.in;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hej med dig!");
        Scanner scanner = new Scanner(in);

        try {
            System.out.print("Indtast et tal: ");
            double x = scanner.nextDouble();
            System.out.print("Indtast endnu et tal: ");
            double y = scanner.nextDouble();
            double sum = x + y;
            double antalTal = 2;
            double resultat = sum / antalTal;
            System.out.println("Gennemsnittet af alle tal er: " + resultat);

            for (int i = 0; i < 10; i--) {
                try {
                    System.out.print("Indtast endnu et tal: ");
                    y = scanner.nextDouble();
                    sum = sum + y;
                    resultat = sum / ++antalTal;
                    System.out.println("Gennemsnittet af alle tal er: " + resultat);

                    String input = scanner.next();
                    if (input.equalsIgnoreCase("q")) {
                        System.out.println("Programmet afsluttes.");
                        scanner.close();
                        System.exit(0);
                    }

                } catch (InputMismatchException e) {
                    System.out.println("Fejl: Indtast venligst et tal.");
                    scanner.next();
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Fejl: Indtast venligst et tal.");
        }

        String input = scanner.next();
        if (input.equalsIgnoreCase("q")) {
            System.out.println("Programmet afsluttes.");
            scanner.close();
            System.exit(0);
        }
    }
}