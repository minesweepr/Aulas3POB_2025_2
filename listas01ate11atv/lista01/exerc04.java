package listas01ate11atv.lista01;
import java.util.Scanner;
/*
4. Cálculo de Média Simples
Faça um programa que solicite ao usuário três notas (valores decimais) e exiba a média aritmética delas. */
public class exerc04 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("digite a primeira nota: ");
        double nota1=scanner.nextDouble();

        System.out.print("digite a segunda nota: ");
        double nota2=scanner.nextDouble();

        System.out.print("digite a terceira nota: ");
        double nota3=scanner.nextDouble();

        double media=(nota1+nota2+nota3)/3;

        System.out.printf("(%.2f + %.2f + %.2f)/3 = %.2f", nota1, nota2, nota3, media);
        scanner.close();
    }
}
