package exercsaula;
//FAÇA UM PROJETO "CONVERTEDISTANCIA.JAVA" QUE LEIA UM VALOR EM QUILOMETROS E FAÇA A CONVERSAO PARA METROS

import java.util.Scanner;

public class ConverteDistancia{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        
        System.out.print("insira o valor em quilometros: ");
        double quilometros=scanner.nextDouble();
        double metros=quilometros/1000;
        
        System.out.println(quilometros + "km -> " + metros + "m");
        scanner.close();
    }
}