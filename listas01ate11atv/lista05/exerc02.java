package listas01ate11atv.lista05;

import java.util.ArrayList;
import java.util.Scanner;

public class exerc02 {
    public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);

		ArrayList<String> lista=new ArrayList<String>();
		System.out.println("insira 5 nomes");
		for(int i=0; i<5; i++) {
			System.out.print("nome "+(i+1)+": ");
			lista.add(scanner.next());
		}

		System.out.print("\n\nescreva o nome que voce deseja remover: ");
		String removido=scanner.next();
		if(lista.contains(removido)) {
			lista.remove(removido);
			
		    System.out.println(lista);

		} else {
			System.out.println("\nnome nao existe na lista");
		}

		scanner.close();
	}
}
