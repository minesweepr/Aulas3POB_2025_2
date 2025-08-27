package exercsaula;
//criar um programa que transforma Celsius em Fahrenheit
import java.util.Scanner;
public class Fahrenheit{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("Digite a temperatura em Celcius: ");
		double celcius=scan.nextDouble();
		double fahrenheit=(celcius*1.8)+32;
		System.out.println("A temperatura em Fahrenheit é: "+fahrenheit);
		scan.close();
	}
}