import java.util.*;
import java.io.*;

public class Wisielec {

    private static final String[] SLOWa = {"kot", "pies", "dom", "szkola", "komputer", "telefon", "samochód", "rower", "książka", "zegarek"};

    private static final int MAX_PROBY = 6;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String haslo = losujHaslo();
        int proby = MAX_PROBY;

        StringBuilder dostepneLitery = new StringBuilder(haslo.length());
        for (int i = 0; i < haslo.length(); i++) {
            dostepneLitery.append("-");
        }

        while (proby > 0 && dostepneLitery.toString().contains("-")) {
            System.out.println("Masz " + proby + " prób.");
            System.out.println("Dostępne litery: " + dostepneLitery);

            String input = "";
            while (input.isEmpty()) {
                System.out.print("Podaj literę: ");
                input = scanner.nextLine();
            }

            char litera = input.charAt(0);

            boolean poprawna = false;
            for (int i = 0; i < haslo.length(); i++) {
                if (haslo.charAt(i) == litera) {
                    dostepneLitery.setCharAt(i, litera);
                    poprawna = true;
                }
            }

            if (poprawna) {
                System.out.println("Brawo! Odgadłeś literę.");
            } else {
                proby--;
                System.out.println("Źle! Pozostało " + proby + " prób.");
            }
        }

        if (dostepneLitery.toString().equals(haslo)) {
            System.out.println("Gratulacje! Odgadłeś hasło: " + haslo);
        } else {
            System.out.println("Niestety, nie udało Ci się odgadnąć hasła. Hasło to: " + haslo);
        }
    }

    private static String losujHaslo() {
        Random random = new Random();
        int index = random.nextInt(SLOWa.length);
        return SLOWa[index];
    }
}
