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

        String listaDeFuncoes = "Funcoes:\n"+
                "1 - Assistir TV\n"+
                "2 - Comer\n"+
                "3 - Tomar Banho\n"+
                "4- Ir para a cozinha\n"+
                "5- Brincar com a bola";


        Cozinha cozinha = new Cozinha();

        Bola bola = new Bola();


        // Parte do L
        Flou flou = new Flou(bola);
        flou.setCozinha(cozinha);


        Jimmy jimmy = new Jimmy(bola);
        jimmy.setCozinha(cozinha);


        Poo poo = new Poo(bola);
        poo.setCozinha(cozinha);

        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Qual o seu nome?");
            String nome = scanner.nextLine();

            // Usei regex para fazer a checagem em expressao regular

            if (!nome.matches("[A-zA-Z]+")) {
                System.out.println("Digite um nome valido!");
            } else {
                System.out.println("Seja bem-vindo(a), " + nome + "!");
                break;
            }
        }
        
        try {
            String listaDePet = "Escolha um PET:\n1 - Flou\n2 - Jimmy\n3 - Poo\n";
            System.out.println(listaDePet);

            Scanner escolherPet = new Scanner(System.in);
            int opcoes;
            System.out.println("Selecione uma opcao: ");
            opcoes = escolherPet.nextInt();

            switch (opcoes) {
                case 1:
                    System.out.println("Voce escolheu Flou!");
                    System.out.println("Escolha o que Flou vai fazer");
                    System.out.println(listaDeFuncoes);

                    Scanner escolherFuncao = new Scanner(System.in);
                    int funcoes;

                    System.out.print("\nSelecione uma funcao: ");
                    funcoes = escolherFuncao.nextInt();
                    if (funcoes == 1) {
                        flou.assistir();
                        System.exit(0);
                    } else if (funcoes == 2) {
                        flou.comer();
                        System.exit(0);
                    } else if (funcoes == 3) {
                        flou.tomarBanho();
                        System.exit(0);
                    } else if (funcoes == 4) {
                        cozinha.cozinha();
                        System.exit(0);
                    } else if (funcoes == 5) {
                        flou.brincarCom();
                        System.exit(0);
                    } else {
                        System.out.println("Opcao inexistente.");
                        System.exit(0);
                    }
                case 2:
                    System.out.println("Voce escolheu Jimmy!");
                    System.out.println("Escolha o que Jimmy vai fazer");
                    System.out.println(listaDeFuncoes);

                    Scanner escolherFuncao2 = new Scanner(System.in);
                    int funcoes2;
                    System.out.print("\nSelecione uma funcao: ");
                    funcoes2 = escolherFuncao2.nextInt();
                    if (funcoes2 == 1) {
                        jimmy.assistir();
                        System.exit(0);
                    } else if (funcoes2 == 2) {
                        jimmy.comer();
                        System.exit(0);
                    } else if (funcoes2 == 3) {
                        jimmy.tomarBanho();
                        System.exit(0);
                    } else if (funcoes2 == 4) {
                        jimmy.getCozinha().cozinha();
                        System.exit(0);
                    } else if (funcoes2 == 5) {
                        jimmy.brincarCom();
                        System.exit(0);
                    } else {
                        System.out.println("Opcao inexistente.");
                        System.exit(0);
                    }
                case 3:
                    System.out.println("Voce escolheu Poo!");
                    System.out.println("Escolha o que Poo vai fazer");
                    System.out.println(listaDeFuncoes);

                    Scanner escolherFuncao3 = new Scanner(System.in);
                    int funcoes3;
                    System.out.print("\nSelecione uma funcao: ");
                    funcoes3 = escolherFuncao3.nextInt();
                    if (funcoes3 == 1) {
                        poo.assistir();
                        System.exit(0);
                    } else if (funcoes3 == 2) {
                        poo.comer();
                        System.exit(0);
                    } else if (funcoes3 == 3) {
                        poo.tomarBanho();
                        System.exit(0);
                    } else if (funcoes3 == 4) {
                        poo.getCozinha().cozinha();
                        System.exit(0);
                    } else if (funcoes3 == 5) {
                        poo.brincarCom();
                        System.exit(0);
                    } else {
                        System.out.println("Opcao inexistente.");
                        System.exit(0);
                    }
                default:
                    System.out.println("Opcao inexistente.");
                    System.exit(0);
            }
        }catch (InputMismatchException option){
            System.out.println("Digite apenas numeros.");
            System.exit(0);
        }
    }
}