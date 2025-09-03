package listas01ate11atv.lista05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class exerc05 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);

		ArrayList<Integer> lista=new ArrayList<>();
		System.out.println("quantos numeros deseja inserir?");
		int tamanho=scanner.nextInt();
		for(int i=1;i<=tamanho;i++){
		    System.out.print("\nnumero "+i+": ");
		    lista.add(scanner.nextInt());
		}
		
		Collections.sort(lista);
		System.out.println(lista);
		
		scanner.close();
	}
}
