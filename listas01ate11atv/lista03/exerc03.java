package listas01ate11atv.lista03;

import java.util.Scanner;
public class exerc03 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("insira um numero: ");
        int numero=scanner.nextInt();

        do { 
            System.out.println(numero--);
        } while (numero>=0);

        scanner.close();
    }
}
