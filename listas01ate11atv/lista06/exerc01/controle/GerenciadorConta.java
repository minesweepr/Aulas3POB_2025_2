package listas01ate11atv.lista06.exerc01.controle;

import java.util.*;
import listas01ate11atv.lista06.exerc01.dominio.ContaBancaria;
public class GerenciadorConta {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("cadastre sua conta: ");
        ContaBancaria conta=new ContaBancaria(scanner.nextLine());

        int opcao;
        do { 
            System.out.println("\n\n\nMENU");
            System.out.println("1 - depositar");
            System.out.println("2 - sacar");
            System.out.println("3 - exibir saldo");
            System.out.println("0 - finalizar programa");
            System.out.print("\nopcao: ");
            opcao=scanner.nextInt();

            System.out.print("\n");
            switch(opcao){
                case 1:
                    System.out.print("insira o valor que deseja depositar: ");
                    double deposito=scanner.nextDouble();
                    conta.depositar(deposito);
                    break;
                case 2:
                    System.out.print("insira o valor que deseja sacar: ");
                    double saque=scanner.nextDouble();
                    conta.sacar(saque);
                    break;
                case 3:
                    conta.exibirSaldo();
                    break;
                case 0:
                    System.out.println("finalizando o programa...");
                    break;
                default:
                    System.out.println("opcao invalida");
            }
        } while (opcao!=0);

        scanner.close();
    }
}
