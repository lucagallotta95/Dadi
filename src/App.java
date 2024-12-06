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

        do {
            System.out.println("Soldi " + soldi);

            do {
                System.out.println("Quanto vuoi puntare?");
                puntata = sc.nextDouble();
                sc.nextLine();
                
                if (puntata <= soldi) {
                    System.out.println("Iniziamo a giocare");

                } else {
                    System.out.println("Non hai abbastanza fondi");
                }

            } while (puntata > soldi);
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

                System.out
                        .println("Utente ha lanciato " + lancioUtente1 + " e " + lancioUtente2 + " totale "
                                + punteggioUtente);

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
                System.out.println("Hai vinto " + puntata);
                soldi = soldi + puntata;

            } else if (turnoUtente == turnoPC) {
                System.out.println("Pareggio");

            } else {
                System.out.println("Hai perso " + puntata);
                soldi = soldi - puntata;

            }
            
            if (soldi > 0) {
                System.out.println("Vuoi continuare a giocare?");
                continua = sc.nextLine();
            } else {
                System.out.println("Non hai i soldi");
            }

        } while (continua.equalsIgnoreCase("si"));
            System.out.println("Grazie per aver giocato");

        sc.close();

    }
}
