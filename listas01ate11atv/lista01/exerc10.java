package listas01ate11atv.lista01;

import java.text.DecimalFormat;
import java.util.Scanner;

/*10. Distância Entre Dois Pontos
Desenvolva um programa que leia as coordenadas x1, y1 e x2, y2 de dois pontos no plano cartesiano e calcule a distância entre eles.

Fórmula: D = sqrt((x2 - x1)² + (y2 - y1)²) */
public class exerc10 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        DecimalFormat decimal=new DecimalFormat("#.00");
        System.out.print("x1: ");
        double x1=scanner.nextDouble();

        System.out.print("y1: ");
        double y1=scanner.nextDouble();

        System.out.print("x2: ");
        double x2=scanner.nextDouble();

        System.out.print("y2: ");
        double y2=scanner.nextDouble();

        double distancia=Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.printf("a distancia é de "+decimal.format(distancia));
        scanner.close();
    }
}
