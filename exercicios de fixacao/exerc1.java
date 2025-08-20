import java.util.stream.IntStream;

public class exerc1 {
    public static void main(String[] args){
        int i;
        System.out.println("Usando for:");
        for(i=5;i<=10;i++){
            System.out.println(i);
        }

        System.out.println("\nUsando range: ");
        IntStream.rangeClosed(5, 10).forEach(System.out::println);
    }
}
