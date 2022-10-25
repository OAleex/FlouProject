package Pet.Model;

public class PetModel {

    protected String sorri;
    protected boolean grita;
    protected int idade;
    protected boolean nadar;

    public void sorri(String s) {
        this.sorri = s;
    }

    public void grita(boolean g) {
        this.grita = g;
    }

    public void idade(int i) {
        this.idade = i;
    }

    public void nadar(boolean n) {
        this.nadar = n;
    }
}
