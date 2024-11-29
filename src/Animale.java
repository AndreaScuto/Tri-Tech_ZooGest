public abstract class Animale implements Addomesticabile{

    private double peso, altezza;
    private String nome, sesso;

    public Animale() {
    }

    public Animale(double peso, String sesso, String nome, double altezza) {
        this.peso = peso;
        this.sesso = sesso;
        this.nome = nome;
        this.altezza = altezza;
    }

    public abstract void riproduciti();

    public abstract void riproduciVerso();

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSesso(String sesso) {
        this.sesso = sesso;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltezza() {
        return altezza;
    }

    public String getNome() {
        return nome;
    }

    public String getSesso() {
        return sesso;
    }
}
