package listas01ate11atv.lista03;

import java.text.DecimalFormat;
import java.util.Scanner;
public class exerc04 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        DecimalFormat decimal=new DecimalFormat("#.00");        
        System.out.print("quantidade de alunos na turma: ");
        int quantidadeAlunos=scanner.nextInt();

        double media=0;
        for (int i=1;i<=quantidadeAlunos;i++) {
            System.out.print("digite a nota do aluno "+i+": ");
            double nota=scanner.nextDouble();
            media+=(nota/quantidadeAlunos);
        }

        System.out.println("media da turma: "+decimal.format(media));
        scanner.close();
    }
}
