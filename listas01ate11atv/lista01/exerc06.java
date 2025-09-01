package listas01ate11atv.lista01;
import java.util.Scanner;

/*6. Cálculo do Salário
Escreva um programa que receba o salário bruto de um funcionário 
e o valor de desconto do INSS. O programa deve calcular e exibir o salário líquido. */
public class exerc06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("digite o salário bruto: R$");
        double salarioBruto=scanner.nextDouble();

        System.out.print("digite o desconto do INSS: R$");
        double descontoInss=scanner.nextDouble();

        System.out.printf("R$%.2f - R$%.2f = R$%.2f", salarioBruto, descontoInss, salarioBruto-descontoInss);
        scanner.close();
    }
}
