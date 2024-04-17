import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua nota:");
        Double Nota = scanner.nextDouble();

        if (Nota > 6) {
            System.out.println("Aprovado !");
        }else{
            System.out.println("Reprovado OnO!");
        }
    }
}
