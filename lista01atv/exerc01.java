package lista01atv;
/*Exercício 1: construir um programa em Java que leia a idade de uma pessoa e imprima “Maior
de idade”, se a idade lida for maior ou igual a 18.*/
import java.util.Scanner;

public class exerc01{
    public static void main (String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("insira a sua idade: ");
        int idade=scanner.nextInt();
        if(idade>=18){
            System.out.println("maior de idade");
        }
        scanner.close();
    }
}