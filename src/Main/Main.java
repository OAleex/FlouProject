package Main;

import Exceptions.ValorIncorreto;
import Ambientes.Cozinha;
import Pet.Jimmy;
import Pet.Model.Bola;
import Pet.Poo;
import Pet.Flou;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws ValorIncorreto {



        Cozinha cozinha = new Cozinha();
//        cozinha.cozinha();

        Bola bola = new Bola();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o seu nome?" );
        String nome = scanner.next();
        System.out.println("Seja bem-vindo(a), " + nome + "!");


        // Parte do L
        Flou flou = new Flou(bola);
        flou.cantar(true);
        flou.sorri("Sorriu :)");
        flou.grita(true);
        flou.idade(7);
        flou.nadar(true);



        Jimmy jimmy = new Jimmy(bola);
        jimmy.fazerCambalhota(true);
        jimmy.sorri("Sorriu :)");
        jimmy.grita(true);
        jimmy.idade(9);
        jimmy.nadar(true);


        Poo poo = new Poo(bola);
        poo.voar(true);
        poo.sorri("Sorriu :)");
        poo.grita(true);
        poo.idade(21);
        poo.nadar(true);
        poo.setCozinha(cozinha);



        String listaDePet = "Escolha um PET:\n1 - Flou\n2 - Jimmy\n3 - Poo\n";
        System.out.println(listaDePet);

        try {
            Scanner escolherPet = new Scanner(System.in);
            int opcoes;
            System.out.println("Selecione uma opcao: ");
            opcoes = escolherPet.nextInt();

            if (opcoes == 1) {
                System.out.println("Você escolheu Flou\n");

            } else if (opcoes == 2) {
                System.out.println("Você escolheu Jimmy\n");
            } else if (opcoes == 3) {
                System.out.println("Você escolheu Poo\n");
            } else {
                System.out.println("Opção inexistente");
                System.exit(0);
            }
        } catch (RuntimeException e) {
            System.out.println("Valor incorreto.");
            System.exit(0);
        }

        // Funcoes

        String listaDeFuncoes = """
                Escolha uma funcao:
                1 - Assistir TV
                2 - Comer
                3 - Tomar Banho
                4- Ir para a cozinha
                5- Brincar com a bola""";
        System.out.println(listaDeFuncoes);


        Scanner escolherFuncao = new Scanner(System.in);
        int funcoes;
        try {
            System.out.print("Selecione uma funcao: ");
            funcoes = escolherFuncao.nextInt();


            if (funcoes == 1) {
                jimmy.assistir();
            } else if (funcoes == 2) {
                jimmy.comer();
            } else if (funcoes == 3) {
                jimmy.tomarBanho();
            } else if (funcoes == 4) {
                System.out.println("Esta brincando com a bola");


            } else if (funcoes == 5) {
                poo.assistir();
            } else if (funcoes == 6) {
                poo.comer();
            }else if(funcoes == 7){
                poo.tomarBanho();
            }
            else if (funcoes == 8) {
                System.out.println("Esta brincando com a bola");
            }


            else if (funcoes == 9){
                flou.assistir();
            }
            else if (funcoes == 10){
                flou.assistir();
            }
            else if (funcoes == 11){
                flou.assistir();
            }
            else if (funcoes == 12) {
                System.out.println("Esta brincando com a bola");
            }
            else {
                System.out.println("Digite um numero valido.");
            }

        }catch (InputMismatchException e){
            System.out.println("Digite um numero.");
        }
    }
}