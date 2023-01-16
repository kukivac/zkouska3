public class Main {
    public static void main(String[] args) {
        Kolecko kolecko = new Kolecko();
        kolecko.addPrvek(new Prvek("Od babičky",6));
        kolecko.addPrvek(new Prvek("Od dedecka",34));
        kolecko.addPrvek(new Prvek("Ze zahrádky",29));
        kolecko.addPrvek(new Prvek("Shnilé",12));
        kolecko.addPrvek(new Prvek("Hnědé"));

        kolecko.printArrayOfPrvek(12);
        System.out.println("");
        Clen clen1 = new Clen("Karel",150,76,73);
        Clen clen2 = new Clen("Antonín",167,80,45);
        Clen clen3 = new Clen("Michal",120,56,23);
        Clen clen4 = new Clen("Vojta",197,95,12);
        Clen clen5 = new Clen("Lukáš",187,85,63);

        Oddil oddil = new Oddil();
        oddil.addClen(clen1);
        oddil.addClen(clen2);
        oddil.addClen(clen3);
        oddil.addClen(clen4);
        oddil.addClen(clen5);

        oddil.prehled();
        oddil.nejmensiBmi();
    }
}