package listas01ate11atv.lista01;

import java.util.Scanner;
/*1. Soma de Dois Números
Escreva um programa que solicite ao usuário dois números inteiros e exiba a soma deles. */
public class exerc01 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("numero1: ");
        int numero1=scanner.nextInt();
        System.out.print("numero2: ");
        int numero2=scanner.nextInt();

        System.out.printf("%d + %d = %d", numero1, numero2, numero1 + numero2);
        scanner.close();
    }    
}
