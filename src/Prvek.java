public class Prvek {
    private String slovo;
    private int cislo;

    Prvek(String slovo) {
        this.slovo = slovo;
    }

    Prvek(String slovo, int cislo) {
        this.setSlovo(slovo);
        this.setCislo(cislo);
    }

    public int getCislo() {
        return cislo;
    }

    public void setCislo(int cislo) {
        this.cislo = cislo;
    }

    public String getSlovo() {
        return slovo;
    }

    public void setSlovo(String slovo) {
        this.slovo = slovo;
    }
}
