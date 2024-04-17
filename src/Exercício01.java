import java.util.Scanner;
 
public class Exercício01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
 
 
        System.out.println("Informe sua idade: ");
        int Idade = scanner.nextInt();
 
        if (Idade > 18) {
            System.out.println("Maior de idade");
        }else {
            System.out.println("Menor de idade");
        }
 
 
    }
}