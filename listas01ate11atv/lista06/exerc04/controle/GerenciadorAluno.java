package listas01ate11atv.lista06.exerc04.controle;

import java.util.Scanner;
import java.text.DecimalFormat;
import listas01ate11atv.lista06.exerc04.dominio.Aluno;
public class GerenciadorAluno {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        DecimalFormat df=new DecimalFormat("#.0");
        System.out.print("nome do aluno: ");
        String nome=scanner.next();

        double nota;
        while (true) {
            System.out.print("insira a nota do aluno (0 a 10): ");
            nota=scanner.nextDouble();
            Aluno aluno=new Aluno(nome, nota);
            if(aluno.validarNota(nota)){
                System.out.println("\nnome: " + nome);
                System.out.println("nota: " + df.format(nota));
                System.out.println("classificacao: " + aluno.classificarAluno());
                break;
            }else{
                System.out.println("\nnota invalida, tente novamente");
            }
        }

        scanner.close();
    }
}
