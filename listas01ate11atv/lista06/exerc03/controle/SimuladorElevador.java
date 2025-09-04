package listas01ate11atv.lista06.exerc03.controle;

import java.util.Scanner;
import listas01ate11atv.lista06.exerc03.dominio.Elevador;

public class SimuladorElevador {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("insira o numero de andares do predio: ");
        Elevador elevador=new Elevador(scanner.nextInt());

        int opcao;
        do { 
            System.out.println("\n\n\nMENU");
            System.out.println("1 - subir");
            System.out.println("2 - descer");
            System.out.println("3 - exibir andar");
            System.out.println("0 - finalizar programa");
            System.out.print("\nopcao: ");
            opcao=scanner.nextInt();

            System.out.print("\n");
            switch(opcao){
                case 1:
                    elevador.subir();
                    break;
                case 2:
                    elevador.descer();
                    break;
                case 3:
                    elevador.exibirAndar();
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
