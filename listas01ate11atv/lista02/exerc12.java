package listas01ate11atv.lista02;
/*Exercício 12: construir um programa em Java que leia os valores de A, B e C e que imprima
“Não forma triângulo”, se um dos valores for maior que a soma dos outros 2, caso contrário,
imprimir qual é o tipo do triângulo, que pode ser “Equilátero”, se tiver os 3 lados iguais,
“Isósceles”, se tiver 2 lados iguais e “Escaleno”, se os 3 lados forem diferentes. */
import java.util.Scanner;

public class exerc12 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("digite o valor a: ");
        int a=scanner.nextInt();
        System.out.print("digite o valor b: ");
        int b=scanner.nextInt();
        System.out.print("digite o valor c: ");
        int c=scanner.nextInt();
        
        if (a<b+c && b<a+c && c<a+b) {
            if (a==b && b==c) {
                System.out.println("equilátero");
            } else if (a==b || a==c || b==c) {
                System.out.println("isósceles");
            } else {
                System.out.println("escaleno");
            }
        } else {
            System.out.println("não forma triângulo");
        }

        scanner.close();
    }
}

