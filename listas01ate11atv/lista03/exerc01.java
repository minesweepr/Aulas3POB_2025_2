package listas01ate11atv.lista03;

import java.util.Scanner;
public class exerc01 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("insira um numero: ");
        int numero=scanner.nextInt();

        int soma=0;
        for(int i=1;i<=numero;i++){
            soma+=i;
        }

        System.out.print("\nsoma dos valores de 1 à "+numero+" = " +soma);

        scanner.close();
    }
}
