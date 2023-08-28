import java.util.Scanner;

public class Main {

    // TODO Få det til at virke med decimaltal +
    // TODO Få det til ikke at crashe med en runtime exception, når man ved en fejl indtaster x
    // TODO Få det til at stoppe når man skriver stop

    public static void main(String[] args) {
        System.out.println("Hej med dig!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Indtast et tal: ");
        double x = scanner.nextDouble();
        System.out.print("Indtast endnu et tal: ");
        double y = scanner.nextDouble();
        double sum = x + y;
        double antalTal = 2;
        double resultat = sum / antalTal;
        System.out.println("Gennemsnittet af alle tal er: " + resultat);
        for (int i = 0; i < 10; i--) {
            System.out.print("Indtast endnu et tal: ");
            y = scanner.nextDouble();
            sum = sum + y;
            resultat = sum/ ++antalTal;
            System.out.println("Gennemsnittet af alle tal er: " + resultat);
        }
    }
}