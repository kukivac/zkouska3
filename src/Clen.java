import java.util.ArrayList;

public class Clen {
    private String name;
    private double vyska;
    private double vaha;
    private double body;

    private double bmi;

    Clen(String name, double vyska, double vaha, double body) {
        this.setName(name);
        this.setVyska(vyska);
        this.setVaha(vaha);
        this.setBody(body);
        this.calculateBmi(vyska, vaha);
    }
    public double getBmi() {
        return bmi;
    }

    public void setBmi(double bmi) {
        this.bmi = bmi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBody() {
        return body;
    }

    public void setBody(double body) {
        this.body = body;
    }

    public double getVaha() {
        return vaha;
    }

    public void setVaha(double vaha) {
        this.vaha = vaha;
    }

    public double getVyska() {
        return vyska;
    }

    public void setVyska(double vyska) {
        this.vyska = vyska;
    }

    private void calculateBmi(double vyska, double vaha) {
        this.setBmi(vaha / vyska);
    }

    public void info() {
        System.out.println("Jméno: " + this.getName());
        System.out.println("Výška: " + this.getVyska());
        System.out.println("Váha: " + this.getVaha());
        System.out.println("Body: " + this.getBody());
        System.out.println("BMI: " + this.getBmi());
    }
}
