import java.util.Random;


public class App {
    public static void main(String[] args) throws Exception {

        int punteggioUtente, punteggioPC, lancioUtente1, lancioUtente2, lancioPC1, lancioPC2;
        Random rdn = new Random();
        lancioUtente1 = rdn.nextInt(6) + 1;
        lancioUtente2 = rdn.nextInt(6) + 1;
        lancioPC1 = rdn.nextInt(6) + 1;
        lancioPC2 = rdn.nextInt(6) + 1;
        punteggioUtente = lancioUtente1 + lancioUtente2;
        punteggioPC = lancioPC1 + lancioPC2;

        System.out
                .println("Utente ha lanciato " + lancioUtente1 + " e " + lancioUtente2 + " totale " + punteggioUtente);

        System.out.println("PC ha lanciato " + lancioPC1 + " e " + lancioPC2 + " totale " + punteggioPC);

        if (punteggioUtente > punteggioPC) {
            System.out.println("Ha vinto l'utente");

        } else if (punteggioUtente == punteggioPC) {
            System.out.println("Pareggio");

        } else {
            System.out.println("Vince il PC");

        }

        

    }
}
