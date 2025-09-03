package listas01ate11atv.lista02;
/*Exercício 7: construir um programa em Java que leia um número inteiro e imprima “Positivo”,
se o número lido for maior que 0, imprima “Negativo”, se o número lido for menor que 0 e
imprima “Nulo”, se o número lido for igual a 0. */
import java.util.Scanner;
public class exerc07 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("insira um número: ");
        int numero=scanner.nextInt();
        if(numero<0){
            System.out.print("negativo");
        } else if(numero>0){
            System.out.print("positivo");
        } else{
            System.out.print("nulo");
        }
        scanner.close();
    }
}
