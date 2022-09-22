package reisinger.htl;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int in = 0;
        System.out.println("Dies ist ein Primzahlengenerator: ");
        while (true) {
            System.out.print("Geben sie eine Maximum bis zu dem sie Primzahlen generrieren wollen ein: ");
            Scanner s = new Scanner(System.in);
            String input = s.nextLine();
            try {
                in = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Ungültige Eingabe!");
                continue;
            }
            if (in > 1) {
                break;
            } else {
                System.out.println("Ungültige Eingabe!");
            }

        }
        System.out.println("Ihre Primzahlen: ");
        EratosthenesPrimeSieve m = new EratosthenesPrimeSieve(in);
    }
}
