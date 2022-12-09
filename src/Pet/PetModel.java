package Pet;

import Ambientes.Banheiro;
import Ambientes.Cozinha;
import Ambientes.Sala;

public class PetModel {

    Banheiro banheiro;
    Cozinha cozinha;
    Sala sala;

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

    public Banheiro getBanheiro() {
        return banheiro;
    }

    public Cozinha getCozinha() {
        return cozinha;
    }

    public void setCozinha(Cozinha cozinha) {
        this.cozinha = cozinha;
    }

    public Sala getSala() {
        return sala;
    }
}
