package Pet;

import Exceptions.ValorIncorreto;
import Interfaces.Acoes.*;
import Interfaces.IBrincar;


public class Jimmy extends PetModel implements IAssistir, IComer, ITomarBanho, IBrincar {

    boolean fazerCambalhota;

    IBrincar brincar;

    public Jimmy(){}
    public Jimmy(IBrincar brincar) {
        this.brincar = brincar;
    }

    public void fazerCambalhota(boolean fC) {
        this.fazerCambalhota = fC;
    }

    public void sorri(String s) {
        super.sorri(s);
    }

    public void grita(boolean g){
        super.grita(g);
    }

    public void idade(int i){
        super.idade(i);
    }

    public void nadar(boolean n){
        super.nadar(n);
    }


    @Override
    public void assistir() {
        System.out.println("Jimmy esta assistindo tv.");
    }

    @Override
    public void comer() {
        System.out.println("Jimmy esta comendo.");

    }

    @Override
    public void tomarBanho() {
        System.out.println("Jimmy esta tomando banho.");
    }

    public void brincarCom() throws ValorIncorreto {
        this.brincar.brincarCom();
    }
}
