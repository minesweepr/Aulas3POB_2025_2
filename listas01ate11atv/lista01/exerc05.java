package listas01ate11atv.lista01;
import java.util.Scanner;
/*5. Conversão de Idade para Dias
Desenvolva um programa que leia a idade de uma pessoa em anos e exiba a quantidade aproximada de dias que ela já viveu.

Considere um ano com 365 dias. */
public class exerc05 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("insira sua idade: ");
        int idade=scanner.nextInt();

        System.out.printf("voce ja viveu %d dias", idade*365);
        scanner.close();
    }
}
