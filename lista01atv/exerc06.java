package lista01atv;
/*Exercício 6: construir um programa em Java que leia o salário bruto e o sexo de um funcionário.
Se o sexo for “M” (masculino), calcular, armazenar e imprimir um desconto de 5% e o salário
líquido, caso contrário, calcular, armazenar e imprimir um desconto de 3% e o salário líquido. */
import java.text.DecimalFormat;
import java.util.Scanner;

public class exerc06 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        DecimalFormat decimal=new DecimalFormat("#.00");
        System.out.print("salário bruto: R$");
        double salarioBruto=scanner.nextDouble();
        System.out.print("sexo: ");
        String sexo=scanner.next().toUpperCase();

        double desconto=((sexo.equals("M"))?0.05:0.03);
        double salarioLiquido=salarioBruto-(salarioBruto*desconto);

        System.out.print("salário bruto: R$"+decimal.format(salarioBruto)+" | desconto: "+ desconto+"% | salário liquido: R$"+decimal.format(salarioLiquido));

        scanner.close();
    }
}
