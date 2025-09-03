package listas01ate11atv.lista02;
/*Exercício 2: construir um programa em Java que leia a idade de uma pessoa e imprima “Maior
de idade”, se a idade lida for maior ou igual a 18 e imprima “Menor de idade”, caso contrário. */
import java.util.Scanner;

public class exerc02{
    public static void main (String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("insira a sua idade: ");
        int idade=scanner.nextInt();

        System.out.println(((idade)>=18?"maior":"menor")+" de idade");
        scanner.close();
    }
}