package listas01ate11atv.lista01;
/*3. Conversão de Temperatura
Crie um programa que leia uma temperatura em graus Celsius e a converta para Fahrenheit.

Fórmula: F = (C × 9/5) + 32. */
import java.util.Scanner;
public class exerc03{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("Digite a temperatura em Celcius: ");
		double celcius=scan.nextDouble();
		double fahrenheit=(celcius*1.8)+32;
		System.out.println("A temperatura em Fahrenheit é: "+fahrenheit);
		scan.close();
	}
}