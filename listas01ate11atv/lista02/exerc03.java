package listas01ate11atv.lista02;
/*Exercício 3: construir um programa em Java que leia 2 números inteiros e imprima o maior
número lido. */
import java.util.Scanner;

public class exerc03 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("digite o primeiro número: ");
        int n1=scanner.nextInt();
        System.out.print("digite o segundo número: ");
        int n2=scanner.nextInt();

        System.out.print(((n1>n2)?n1:n2)+" é o maior número.");
        scanner.close();
    }
}
