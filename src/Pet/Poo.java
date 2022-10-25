package Pet;

import Exceptions.ValorIncorreto;
import Interfaces.Acoes.*;
import Interfaces.Ambientes.*;
import Interfaces.IBrincar;
import Pet.Model.PetModel;

public class Poo extends PetModel implements IAssistir, IComer, ITomarBanho, IBanheiro, ICozinha, ISala, IBrincar {

    boolean voar;

    IBrincar brincar;

    public Poo(IBrincar brincar) {
        this.brincar = brincar;
    }

    public void voar(boolean v) {
        this.voar = v;
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
        System.out.println("Poo esta assistindo tv.");
    }

    @Override
    public void comer() {
        System.out.println("Poo esta comendo.");

    }

    @Override
    public void tomarBanho() {
        System.out.println("Poo esta tomando banho.");
    }

    @Override
    public void banheiro() {
        System.out.println("Poo esta no banheiro.");
    }

    @Override
    public void cozinha() {
        System.out.println("Poo esta na cozinha.");

    }

    @Override
    public void sala() {
        System.out.println("Poo esta na sala.");
    }


    public void brincarCom() throws ValorIncorreto {
        this.brincar.brincarCom();
    }
}

