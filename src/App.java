import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {

        Random rdn = new Random();

        int punteggioUtente, punteggioPC, lancioUtente1, lancioUtente2, lancioPC1, lancioPC2, turnoUtente, turnoPC;
        lancioUtente1 = rdn.nextInt(6) + 1;
        lancioUtente2 = rdn.nextInt(6) + 1;
        lancioPC1 = rdn.nextInt(6) + 1;
        lancioPC2 = rdn.nextInt(6) + 1;
        punteggioUtente = lancioUtente1 + lancioUtente2;
        punteggioPC = lancioPC1 + lancioPC2;
        turnoUtente = 0;
        turnoPC = 0;

        for (int index = 0; index < 3; index++) {

            System.out
                    .println("Utente ha lanciato " + lancioUtente1 + " e " + lancioUtente2 + " totale "
                            + punteggioUtente);

            System.out.println("PC ha lanciato " + lancioPC1 + " e " + lancioPC2 + " totale " + punteggioPC);

            if (punteggioUtente > punteggioPC) {
                System.out.println("Ha vinto l'utente");

            } else if (punteggioUtente == punteggioPC) {
                System.out.println("Pareggio");

            } else {
                System.out.println("Vince il PC");
                turnoPC++;

            }

        }   if (turnoUtente > turnoPC) {
                System.out.println("L'utente ha vinto la partita");
            
        }   else if (turnoUtente == turnoPC) {
                System.out.println("Pareggio");

        } else { 
                System.out.println("Vince il PC");

        }


        

    }   
}
