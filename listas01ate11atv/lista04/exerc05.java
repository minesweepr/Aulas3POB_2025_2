package listas01ate11atv.lista04;

import java.util.Scanner;

public class exerc05 {
        public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] numeros=new int[10];

        System.out.println("digite 10 numeros");
        for(int i=0;i<numeros.length;i++){
            System.out.print("\nnumero"+(i+1)+": ");
            numeros[i]=scanner.nextInt();
        }

        System.out.print("\n\nbusque um numero: ");
        int escolhido=scanner.nextInt();
        boolean achou=false;
        for(int i=0;i<numeros.length;i++){
            if(numeros[i]==escolhido){
                achou=true;
                System.out.println("numero foi encontrado na colocação "+(i+1));
                break;
            }
        }

        if(!achou){
            System.out.println("numero nao encontrado.");
        } 

        scanner.close();
    }
}
