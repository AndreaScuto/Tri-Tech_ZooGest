public abstract class Rettile extends Animale {

    private String tipoLocomozione;

    public Rettile(double peso, String sesso, String nome, double altezza, String tipoLocomozione) {
        super(peso, sesso, nome, altezza);
        this.tipoLocomozione = tipoLocomozione;
    }

    public abstract void cambiaPelle();

    public void setTipoLocomozione(String tipoLocomozione) {
        this.tipoLocomozione = tipoLocomozione;
    }

    public String getTipoLocomozione() {
        return tipoLocomozione;
    }
}
