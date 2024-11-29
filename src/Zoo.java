import java.util.ArrayList;

public class Zoo {
    private ArrayList<Animale> animali;

    public Zoo(ArrayList<Animale> animali) {
        this.animali = animali;
    }

    public Zoo() {
        animali = new ArrayList<>();
    }

    public boolean aggiungiAnimale(Animale a){
        try {
            animali.add(a);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public boolean rimuoviAnimali(){
        try {
            animali.clear();
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
