public class Cane extends Mammifero implements Addomesticabile{

    public Cane(double peso, String sesso, String nome, double altezza, String viveInGruppo) {
        super(peso, sesso, nome, altezza, viveInGruppo);
    }

    @Override
    public void riproduciti() {
        System.out.println("Mi chiamo:"+this.getNome()+" e sono un cane. Mi sto riproducendo...");
    }

    @Override
    public void riproduciVerso() {
        System.out.println("Mi chiamo:"+this.getNome()+" BAU BAU");
    }

    @Override
    public void gioca() {
        System.out.println("Sto giocando!");
    }
}
