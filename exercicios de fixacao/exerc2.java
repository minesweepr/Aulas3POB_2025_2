//Faltorial
import java.util.Scanner;
public class exerc2{
    public static void main (String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Insira um valor que deseja calcular seu fatorial: ");
        int n=scan.nextInt();

        long fat=1;
        for(int i=1;i<=n;i++){
            fat*=i;
        }
        System.out.println(n+"! = "+fat);
    }
}