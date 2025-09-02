package listas01ate11atv.lista03;

import java.util.Scanner;
public class exerc02 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("insira um numero: ");
        int numero=scanner.nextInt();

        int i=1;
        while(i<=10){
            System.out.printf("%d x %d = %d\n", i,numero, i*numero);
            i++;
        }

        scanner.close();
    }
}
