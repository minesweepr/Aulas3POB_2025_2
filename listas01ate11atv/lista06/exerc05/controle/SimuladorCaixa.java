package listas01ate11atv.lista06.exerc05.controle;

import java.util.Scanner;
import listas01ate11atv.lista06.exerc05.dominio.CaixaEletronico;
public class SimuladorCaixa {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("insira o valor no caixa eletronico: R$");
        CaixaEletronico caixa=new CaixaEletronico(sc.nextDouble());

        boolean continuar=true;
        while(continuar){
            System.out.println("\nMENU");
            System.out.println("1 - sacar");
            System.out.println("2 - exibir saldo");
            System.out.println("0 - finalizar programa");
            System.out.print("Opção: ");
            int opcao=sc.nextInt();

            switch (opcao){
                case 1:
                    System.out.print("valor do saque: R$ ");
                    caixa.sacar(sc.nextDouble());
                    break;
                case 2:
                    caixa.exibirSaldo();
                    break;
                case 0:
                    continuar=false;
                    System.out.println("finalizando programa...");
                    break;
                default:
                    System.out.println("opcao invalida. tente novamente");
            }
        }
        sc.close();
    }
}
