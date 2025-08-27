package lista01atv;
/*Exercício 4: construir um programa em Java que leia um número inteiro e imprima “PAR”, se o
número for par e imprima “ÍMPAR”, se o número for ímpar. */
import java.util.Scanner;

public class exerc04 {
    static public void main (String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("insira um número: ");
        int numero=scanner.nextInt();

        System.out.print((numero%2==0)?"PAR":"ÍMPAR");
        scanner.close();
    }
}
