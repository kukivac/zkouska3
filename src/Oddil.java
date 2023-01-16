import java.util.ArrayList;

public class Oddil {
    private ArrayList<Clen> clenove;

    Oddil() {
        this.clenove = new ArrayList<>();
    }

    public ArrayList<Clen> getClenove() {
        return clenove;
    }

    public void setClenove(ArrayList<Clen> clenove) {
        this.clenove = clenove;
    }

    public void addClen(Clen clen) {
        this.clenove.add(clen);
    }

    public void prehled() {
        for (int i = 0; i < this.getClenove().toArray().length; i++) {
            this.getClenove().get(i).info();
        }
    }

    public void nejmensiBmi() {
        Clen clenSNejmensimBmi = this.getClenove().get(0);
        for (int i = 0; i < this.getClenove().toArray().length; i++) {
            Clen iterationClen = this.getClenove().get(i);
            if (clenSNejmensimBmi.getBmi() > iterationClen.getBmi()) {
                clenSNejmensimBmi = iterationClen;
            }
        }
        System.out.println("Člen s nejmenším BMI:");
        clenSNejmensimBmi.info();
    }
}
