import java.util.InputMismatchException;
import  java.util.Locale;
import  java.util.Scanner;
import java.lang.NullPointerException;

public class Aboutme {
    public static void main(String[] args) {
        try {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu Sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite sua alura: ");
        double altura = scanner.nextDouble();


        System.out.println("Olá me chamo: " +nome.toUpperCase()+ sobrenome.toUpperCase());
        System.out.println("Tenho: " + idade + "anos");
        System.out.println("Tenho de altura: " + altura + " cm");
        scanner.close();
    } catch (InputMismatchException e) {
            System.err.println("O campos idade e altura precisa ser numéricos");
        }
    }}
