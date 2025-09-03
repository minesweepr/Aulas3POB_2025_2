package listas01ate11atv.lista02;
/*Exercício 10: construir um programa em Java que leia o ano de nascimento e o sexo de uma
pessoa e que calcule a sua idade aproximada. Se o sexo for igual a “M” (masculino) e a idade for
igual a 18, imprimir “Serviço Militar Obrigatório”, caso contrário, imprimir “Isento de Serviço
Militar”. */
import java.util.Calendar;
import java.util.Scanner;

public class exerc10 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Calendar calendar=Calendar.getInstance();
        int anoAtual=calendar.get(Calendar.YEAR);
        System.out.print("ano de nascimento: ");
        int anoNascimento=scanner.nextInt();
        System.out.print("sexo: ");
        String sexo=scanner.next().toUpperCase();
        
        if(sexo.equals("M") && anoAtual-anoNascimento>=18){
            System.out.println("serviço militar obrigatório");
        } else{
            System.out.println("isento de serviço militar");
        }

        scanner.close();
    }
}
