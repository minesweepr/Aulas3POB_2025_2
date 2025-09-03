package listas01ate11atv.lista05;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class exerc03 {
    public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		DecimalFormat decimal=new DecimalFormat("#.00");

		ArrayList<Double> lista=new ArrayList<>();
		double numero=0;
		while(numero!=-1){
		    System.out.print("\nnumero: ");
		    numero=scanner.nextDouble();
		    lista.add(numero);
		}
		lista.remove(Double.valueOf(-1));
		
		double soma=0;
		for(double n:lista){
		    soma+=n;
		}
		double media=soma/lista.size();
		
		System.out.print("\n\nmedia: "+decimal.format(media));
		
		scanner.close();
	}
}
