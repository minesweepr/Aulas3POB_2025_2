package listas01ate11atv.lista02;
/*Exercício 11: construir um programa em Java que leia os valores de A, B e C e que imprima
“Não forma triângulo”, se um dos valores for maior que a soma dos outros 2, caso contrário,
imprimir “Forma triângulo”. */
import java.util.Scanner;

public class exerc11 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("digite o valor a: ");
        int a=scanner.nextInt();
        System.out.print("digite o valor b: ");
        int b=scanner.nextInt();
        System.out.print("digite o valor c: ");
        int c=scanner.nextInt();
        
        if (a<b+c && b<a+c && c<a+b) {
            System.out.println("forma triângulo");
        } else {
            System.out.println("não forma triângulo");
        }

        scanner.close();
    }
}
