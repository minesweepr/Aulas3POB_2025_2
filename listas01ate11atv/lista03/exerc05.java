package listas01ate11atv.lista03;
/*Exercício 5: Números primos em um intervalo 
Descrição: Escreva um programa que solicite dois 
números ao usuário e exiba todos os números primos 
no intervalo entre eles, utilizando um loop aninhado 
(for dentro de for). 
Requisitos: 
• O programa deve solicitar dois números inteiros positivos (início e fim do intervalo). 
• Deve utilizar um loop externo para percorrer os números dentro do intervalo. 
• Deve utilizar um loop interno para verificar se cada número é primo. 
• Exibir apenas os números primos encontrados. */
import java.util.Scanner;
public class exerc05 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);    
        System.out.print("numero inicial do intervalo: ");
        int inicio=scanner.nextInt();
        System.out.print("numero final do intervalo: ");
        int fim=scanner.nextInt();

        System.out.println("numeros primos no intervalo:");
        for(int i=inicio;i<=fim;i++){
            boolean primo=true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    primo=false;
                    break;
                }
            }
            if(primo){
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
