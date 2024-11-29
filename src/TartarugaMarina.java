public class TartarugaMarina extends Rettile {

    public TartarugaMarina(double peso, String sesso, String nome, double altezza, String tipoLocomozione) {
        super(peso, sesso, nome, altezza, tipoLocomozione);
    }

    @Override
    public void cambiaPelle() {
        System.out.println("Sono una tartaruga! Sto cambiando pelle...");
    }

    @Override
    public void riproduciti() {
        System.out.println("Mi chiamo:" + this.getNome() + " e sono una tartaruga marina. Sto deponendo in una buca sulla spiaggia");
    }

    @Override
    public void riproduciVerso() {
        System.out.println("Mi chiamo:" + this.getNome() + " e sono una tartaruga marina. Non so che verso faccia una tartaruga marina");
    }

    @Override
    public void gioca() {
    }
}
