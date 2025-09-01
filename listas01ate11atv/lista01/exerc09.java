package listas01ate11atv.lista01;
/*9. Conversão de Moeda
Faça um programa que leia um valor em reais (R$) e a cotação do dólar no dia. 
O programa deve calcular e exibir o valor equivalente em dólares (US$). */
import java.util.Scanner;
public class exerc09 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("valor em reais: R$");
        double reais=scanner.nextDouble();

        System.out.print("cotação do dolar: ");
        double cotacao=scanner.nextDouble();

        System.out.printf("R$ %.2f = US$ %.2f", reais, reais/cotacao);
        scanner.close();
    }
}
