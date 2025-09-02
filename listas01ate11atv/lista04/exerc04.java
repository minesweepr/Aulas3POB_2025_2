package listas01ate11atv.lista04;

import java.util.Scanner;

public class exerc04 {
        public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] numeros=new int[8];
        int pares=0;

        System.out.println("digite 8 numeros");
        for(int i=0;i<numeros.length;i++){
            System.out.print("\nnumero"+(i+1)+": ");
            numeros[i]=scanner.nextInt();
            if(numeros[i]%2==0){
                pares++;
            }
        }

        System.out.println("\nquantidade de numeros pares: "+pares);
        scanner.close();
    }
}
