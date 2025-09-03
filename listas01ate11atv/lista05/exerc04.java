package listas01ate11atv.lista05;

import java.util.ArrayList;
import java.util.Scanner;

public class exerc04 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);

		ArrayList<Integer> lista=new ArrayList<>();
		System.out.println("insira 10 numeros");
		for(int i=1;i<=10;i++){
		    System.out.print("\nnumero "+i+": ");
		    lista.add(scanner.nextInt());
		}
		
		System.out.print("\n\nescolha um numero: ");
		int escolhido=scanner.nextInt();
		
		int count=0;
		for(int n:lista){
		    if(escolhido==n){
		        count++;
		    }
		}
		
		/*outros metodos sem loop for:
		https://www.quora.com/How-do-I-count-the-occurrences-of-an-element-in-a-Java-ArrayList
        int count=Collections.frequency(lista, escolhido);
        long count=lista.stream().filter(x->x.equals(escolhido)).count();
		*/
		
		System.out.print("o numero apareceu "+count+" vezes");
		
		scanner.close();
	}
}
