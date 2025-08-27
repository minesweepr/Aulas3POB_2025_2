package lista01atv;
/*Exercício 5: construir um programa em Java que leia o ano de nascimento de uma pessoa e que
calcule a sua idade aproximada. Se a idade aproximada for maior ou igual a 16, imprimir “Apto
a ser eleitor”, imprimir “Inapto a ser eleitor”, caso contrário. */
import java.util.Calendar;
import java.util.Scanner;

public class exerc05 {
    public static void main (String[] args){
        Scanner scanner=new Scanner(System.in);
        Calendar calendar=Calendar.getInstance();
        int anoAtual=calendar.get(Calendar.YEAR);
        System.out.print("insira seu ano de nascimento: ");
        int anoNascimento=scanner.nextInt();

        System.out.print(((anoAtual-anoNascimento>=16)?"Apto":"Inapto")+" a ser eleitor.");

        scanner.close();
    }
}
