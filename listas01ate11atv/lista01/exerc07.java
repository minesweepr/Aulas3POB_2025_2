package listas01ate11atv.lista01;
import java.text.DecimalFormat;
import java.util.Scanner;
/*7. Cálculo do Perímetro e Área de um Retângulo
Faça um programa que solicite a base e a altura de um retângulo e exiba o seu perímetro e sua área.

Fórmulas:

Área = base × altura

Perímetro = 2 × (base + altura). */
public class exerc07 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        DecimalFormat decimal=new DecimalFormat("#.00");
        System.out.print("base: ");
        double base=scanner.nextDouble();
        System.out.print("altura: ");
        double altura=scanner.nextDouble();

        double area=base*altura;
        double perimetro=2*(base+altura);

        System.out.println("\narea = "+decimal.format(area));
        System.out.println("perimetro = "+decimal.format(perimetro));

        scanner.close();
    }
}
