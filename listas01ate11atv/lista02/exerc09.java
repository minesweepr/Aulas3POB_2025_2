package listas01ate11atv.lista02;
/*Exercício 9: construir um programa em Java que leia as 2 notas de um aluno e que calcule,
armazene e imprima a média. Se a média for maior ou igual a 7, imprimir “Aprovado”, caso
contrário, realizar a leitura de uma terceira nota, que terá peso 2 e calcular, armazenar e imprimir
uma nova média. Se a nova média for maior ou igual a 6, imprimir “Aprovado”, caso contrário,
imprimir “Reprovado”. */

import java.text.DecimalFormat;
import java.util.Scanner;

public class exerc09 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        DecimalFormat decimal=new DecimalFormat("#.00");
        System.out.print("AV1: ");
        double av1=scanner.nextInt();
        System.out.print("AV2: ");
        double av2=scanner.nextInt();
        
        double media=(av1+av2)/2;

        System.out.println("\nmédia atual: "+decimal.format(media));
        if(media>=7){
            System.out.print("aprovado");
        } else{
            System.out.print("AV3: ");
            double av3=scanner.nextInt();
            media=(media+(av3*2))/3;

            System.out.println("\nnova média: "+decimal.format(media));
            System.out.print((media>=6)?"aprovado":"reprovado");
        }
        scanner.close();
    }
}
