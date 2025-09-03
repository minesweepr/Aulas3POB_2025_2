package listas01ate11atv.lista02;
/*Exercício 8: construir um programa em Java que leia a quantidade de disciplinas em que um
aluno não alcançou a média. Se a quantidade for igual a 0, imprimir “Aprovado”, se a quantidade
for menor ou igual a 5, imprimir “Recuperação” e se a quantidade for maior que 5, imprimir
“Reprovado”. */
import java.util.Scanner;

public class exerc08 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("insira a quantidade de disciplinas que a média não foi alcançada: ");
        int quantidade=scanner.nextInt();

        if(quantidade==0){
            System.out.print("aprovado");
        } else if(quantidade<=5){
            System.out.print("recuperação");
        } else{
            System.out.print("reprovado");
        }

        scanner.close();
    }    
}
