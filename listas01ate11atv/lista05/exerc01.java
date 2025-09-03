package listas01ate11atv.lista05;

import java.util.ArrayList;
import java.util.Scanner;

public class exerc01 {
	public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        String resposta="sim";
        
        ArrayList<Integer> lista=new ArrayList<>();
        while(!resposta.equals("nao")){
            System.out.print("\nnumero: ");
            lista.add(scanner.nextInt());
            
            System.out.println("deseja continuar?(sim/nao)");
            resposta=scanner.next().toLowerCase();
        }
    
        System.out.print(lista);
        
        scanner.close();
	}
}
