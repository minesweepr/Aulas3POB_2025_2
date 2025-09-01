package listas01ate11atv.lista01;

import java.util.Scanner;
/*2. Área de um Círculo
Desenvolva um programa que leia o raio de um círculo e calcule sua área.

Fórmula: Área = π * raio² */
public class exerc02 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("insira o raio de um circulo: ");
        double raio=scanner.nextDouble();

        double area=Math.PI*Math.pow(raio, 2);
        System.out.printf("PI × %.2f² = %.2f cm²", raio, area);
        scanner.close();
    }
}
