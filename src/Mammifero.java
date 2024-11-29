public abstract class Mammifero extends Animale {

    private String viveInGruppo;

    public Mammifero(double peso, String sesso, String nome, double altezza, String viveInGruppo) {
        super(peso, sesso, nome, altezza);
        this.viveInGruppo = viveInGruppo;
    }

    public void setViveInGruppo(String viveInGruppo) {
        this.viveInGruppo = viveInGruppo;
    }

    public String getViveInGruppo() {
        return viveInGruppo;
    }


}
