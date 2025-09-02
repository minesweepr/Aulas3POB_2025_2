package listas01ate11atv.lista04;

import java.util.Scanner;
public class exerc01 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] numeros=new int[5];
        int menor=Integer.MAX_VALUE, maior=Integer.MIN_VALUE;

        System.out.println("digite 5 numeros");
        for(int i=0;i<numeros.length;i++){
            System.out.print("\nnumero"+(i+1)+": ");
            numeros[i]=scanner.nextInt();
            if(numeros[i]<menor){
                menor=numeros[i];
            }
            if(numeros[i]>maior){
                maior=numeros[i];
            }
        }

        System.out.println("\nmaior numero: "+maior);
        System.out.println("menor numero: "+menor);
        scanner.close();
    }
}
