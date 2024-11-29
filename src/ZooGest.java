import java.util.Scanner;

public class ZooGest {
    public static void main(String[] args) {
        String nome, temp, sesso;
        int scelta, cat;
        double altezza, peso;
        Zoo zoo = new Zoo();
        Scanner userInput = new Scanner(System.in);
        System.out.println();
        System.out.println("Benvenuto nel menù di ZooGest.");

        do {
            System.out.println();
            System.out.println("1. Aggiungi animale.");
            System.out.println("2. Rimuovi tutti gli animali.");
            System.out.println("3. Cerca animale per codice identificativo.");
            System.out.println("4. Visualizza a schermo tutti gli animali.");
            System.out.println("Premi 0 per uscire dal programma...");
            switch (scelta = Integer.parseInt(userInput.nextLine())) {
                case 1 -> {
                    System.out.println("");
                    System.out.print("Inserisci nome dell'animale: ");
                    nome = userInput.nextLine();
                    System.out.print("Inserisci sesso dell'animale (M/F): ");
                    sesso = userInput.nextLine();
                    System.out.print("Inserisci altezza dell'animale: ");
                    altezza = userInput.nextDouble();
                    System.out.print("Inserisci peso dell'animale: ");
                    peso = userInput.nextDouble();
                    System.out.print("Inserisci categoria animale (1 per mammifero, 2 per rettile): ");
                    cat = userInput.nextInt();

                    switch (cat) {
                        case 1 -> {
                            System.out.println("Che mammifero è? (1 per cane, 2 per gatto)");
                            scelta = userInput.nextInt();
                            if (scelta == 1 ){                                      //CANE
                                System.out.println("Il cane vive in branco?");
                                temp = userInput.nextLine();
                                Cane c = new Cane(peso,sesso,nome,altezza,temp);
                                if (zoo.aggiungiAnimale(c))
                                    System.out.println("Cane aggiunto.");
                                else System.out.println("Errore!");
                            }
                            else {                                                  //GATTO
                                System.out.println("Il gatto vive in branco?");
                                temp = userInput.nextLine();
                                Gatto g = new Gatto(peso,sesso,nome,altezza,temp);
                                if (zoo.aggiungiAnimale(g))
                                    System.out.println("Gatto aggiunto.");
                                else System.out.println("Errore!");
                            }
                        }
                        case 2 -> {
                            System.out.println("Che rettile è? (1 per serpente, 2 per tartaruga marina)");
                            scelta = userInput.nextInt();
                            if (scelta == 1 ){                                      //SERPENTE
                                Serpente s = new Serpente(peso,sesso,nome,altezza,"Striscia");
                                if (zoo.aggiungiAnimale(s))
                                    System.out.println("Serpente aggiunto.");
                                else System.out.println("Errore!");
                            }
                            else {                                                  //GATTO
                                TartarugaMarina t = new TartarugaMarina(peso,sesso,nome,altezza,"Nuota");
                                if (zoo.aggiungiAnimale(t))
                                    System.out.println("Tartaruga aggiunta.");
                                else System.out.println("Errore!");
                            }
                        }
                    }
                }
                case 2 -> {
                    if (zoo.rimuoviAnimali())
                        System.out.println("Animali eliminati.");
                        else System.out.println("Errore!");
                }
                case 3 -> {
                    System.out.print("Inserisci titolo per ricerca: ");
                    titolo = userInput.nextLine();
                    if (!libreria.cercaTitolo(titolo)) {
                        System.out.println("Titolo non trovato...");
                    }
                }
                case 4 -> zoo.stampaAnimali();
                case 5 -> libreria.statistiche();
                case 0 -> {
                } //Esci dal programma.
                default -> System.out.println("Inserisci valore valido!");
            }
        } while (scelta != 0);
        userInput.close();
    }
}
