import java.util.ArrayList;

public class Kolecko {
    private ArrayList<Prvek> arrayOfPrvek;

    Kolecko() {
        this.setArrayOfPrvek(new ArrayList<>());
    }

    public void setArrayOfPrvek(ArrayList<Prvek> arrayOfPrvek) {
        this.arrayOfPrvek = arrayOfPrvek;
    }

    public ArrayList<Prvek> getArrayOfPrvek() {
        return arrayOfPrvek;
    }

    private Prvek getElementFromArrayOfPrvek(int index) {
        ArrayList<Prvek> arrayOfPrvek = this.getArrayOfPrvek();
        return this.getArrayOfPrvek().get(
                this.lowerIndex(
                        index,
                        this.getArrayOfPrvek().toArray().length
                )
        );
    }

    public void addPrvek(Prvek Prvek) {
        this.arrayOfPrvek.add(Prvek);
    }

    public void printArrayOfPrvek(int pocet) {
        for (int i = 0; i < pocet; i++) {
            System.out.println(this.getOutputOfElement(i));
        }
    }

    private String getOutputOfElement(int index) {
        Prvek prvek = this.getElementFromArrayOfPrvek(index);
        return "Slovo: " + prvek.getSlovo() + " Číslo: " + prvek.getCislo();
    }

    private int lowerIndex(int index, int length) {
        if (index > (length - 1)) {
            index = index - length;
            return this.lowerIndex(index, length);
        }
        return index;
    }
}