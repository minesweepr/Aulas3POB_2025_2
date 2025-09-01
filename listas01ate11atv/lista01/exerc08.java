package listas01ate11atv.lista01;
import java.text.DecimalFormat;
import java.util.Scanner;

/*8. Cálculo do Volume de uma Esfera
Crie um programa que leia o raio de uma esfera e calcule o seu volume.

Fórmula: V = (4/3) * π * raio³.

Use π = 3.14159. */
public class exerc08 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        DecimalFormat decimal=new DecimalFormat("#.00");
        System.out.print("raio: ");
        double raio=scanner.nextDouble();

        double volume=(4.0/3.0)*3.14159*Math.pow(raio, 3);

        System.out.print("Volume = "+decimal.format(volume));

        scanner.close();
    }
}
