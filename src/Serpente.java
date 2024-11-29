public class Serpente extends Rettile {

    public Serpente(double peso, String sesso, String nome, double altezza, String tipoLocomozione) {
        super(peso, sesso, nome, altezza, tipoLocomozione);
    }

    @Override
    public void cambiaPelle() {
        System.out.println("Sono un serpente! Sto cambiando pelle...");
    }

    @Override
    public void riproduciti() {
        System.out.println("Mi chiamo:" + this.getNome() + " e sono un serpente. Sto deponendo delle uova...");
    }

    @Override
    public void riproduciVerso() {
        System.out.println("Mi chiamo:" + this.getNome() + " e sono un serpente. PSS PSSSS");
    }

    @Override
    public void gioca() {
        System.out.println("Sto giocando!");
    }
}
