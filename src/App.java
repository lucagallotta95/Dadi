import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Random rdn = new Random();
        Scanner sc = new Scanner(System.in);
        String continua;

        int punteggioUtente, punteggioPC, lancioUtente1, lancioUtente2, lancioPC1, lancioPC2, turnoUtente, turnoPC;
        double soldi, puntata;
        soldi = 100;

        System.out.println("-------------------------------");
        System.out.println("Benvenuto al gioco dei dadi!");
        System.out.println("-------------------------------");
        System.out.println("Saldo attuale: " + soldi + "€");

        do {

            do {
                System.out.println("Quanto vuoi puntare?");
                puntata = sc.nextDouble();
                sc.nextLine();

                if (puntata <= soldi && puntata > 0) {
                    System.out.println("Iniziamo a giocare");

                } else {
                    System.out.println("Puntata non valida, minimo 1€, massimo " + soldi);
                }

            } while (puntata > soldi || puntata <= 0);
            continua = "no";
            turnoUtente = 0;
            turnoPC = 0;

            for (int index = 0; index < 3; index++) {

                lancioUtente1 = rdn.nextInt(6) + 1;
                lancioUtente2 = rdn.nextInt(6) + 1;
                lancioPC1 = rdn.nextInt(6) + 1;
                lancioPC2 = rdn.nextInt(6) + 1;
                punteggioUtente = lancioUtente1 + lancioUtente2;
                punteggioPC = lancioPC1 + lancioPC2;
                
                System.out.println("\nTurno: " + (index + 1));
                System.out.println("Utente ha lanciato " + lancioUtente1 + " e " + lancioUtente2 + " totale " + punteggioUtente);
                System.out.println("PC ha lanciato " + lancioPC1 + " e " + lancioPC2 + " totale " + punteggioPC);

                if (punteggioUtente > punteggioPC) {
                    System.out.println("Ha vinto l'utente");
                    turnoUtente++;
                } else if (punteggioUtente == punteggioPC) {
                    System.out.println("Pareggio");
                } else {
                    System.out.println("Vince il PC");
                    turnoPC++;

                }

            }
            if (turnoUtente > turnoPC) {
                System.out.println("\nComplimenti! Hai vinto la partita e guadagnato: " + puntata + "€");
                soldi = soldi + puntata;

            } else if (turnoUtente == turnoPC) {
                System.out.println("La partita è finita in pareggio");
            } else {
                System.out.println("\nIl computer ha vinto la partita e hai perso: " + puntata + "€");
                soldi = soldi - puntata;
            }

            if (soldi > 0) {
                System.out.print("\nHai " + soldi + "€." +" Vuoi giocare un'altra partita? (si/no): ");

                continua = sc.nextLine();
            } else {
                System.out.println("\nSaldo esaurito. Non puoi più giocare.");

            }

        } while (continua.equalsIgnoreCase("si"));
        System.out.println("\nEsci con: " + soldi + "€. Grazie per aver giocato!");

        sc.close();

    }
}
