package Pet;

import Exceptions.ValorIncorreto;
import Interfaces.Acoes.*;
import Interfaces.Acoes.ITomarBanho;
import Interfaces.Ambientes.*;
import Interfaces.IBrincar;
import Pet.Model.PetModel;

public class Flou extends PetModel implements IAssistir, IComer, ITomarBanho, IBanheiro, ICozinha, ISala, IBrincar {

    boolean cantar;

     IBrincar brincar;

    public Flou(IBrincar brincar) {
        this.brincar = brincar;
    }

    public void cantar(boolean c) {
        this.cantar = c;
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
        System.out.println("Flou esta assistindo tv.");
    }

    @Override
    public void comer() {
        System.out.println(getClass().getName() + " esta comendo.");

    }

    @Override
    public void tomarBanho() {
        System.out.println("Flou esta tomando banho.");
    }

    @Override
    public void banheiro() {
        System.out.println("Flou esta no banheiro.");
    }

    @Override
    public void cozinha() {
        System.out.println("Flou esta na cozinha.");

    }

    @Override
    public void sala() {
        System.out.println("Flou esta na sala.");
    }



    public void brincarCom() throws ValorIncorreto {
        this.brincar.brincarCom();
    }
}