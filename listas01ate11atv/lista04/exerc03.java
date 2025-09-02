package listas01ate11atv.lista04;

import java.util.Scanner;
public class exerc03 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] numeros=new int[6];

        System.out.println("digite 6 numeros");
        for(int i=0;i<numeros.length;i++){
            System.out.print("\nnumero"+(i+1)+": ");
            numeros[i]=scanner.nextInt();
        }

        System.out.println("\n\nao contrario");
        for(int i=numeros.length-1;i>=0;i--){
            System.out.println(numeros[i]);
        }

        scanner.close();
    }
}
