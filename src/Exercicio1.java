import java.util.Scanner; // importando a classe interna Scanner

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // criando variável e obejet do tipo Scanner indicando a entrada padrão do programa que receberá os dados

        System.out.println("Informe o seu nome: ");
        String nome = scanner.nextLine(); // chamamos o metodo nextLine() do objeto scanner que lê uma linha de texto digitada pelo usuário

        System.out.println("Informe a sua idade: ");
        int idade = scanner.nextInt(); // chamamos o metodo nextInt() do objeto scanner que lê um número digitada pelo usuário

        System.out.println("Seja muito bem-vindo, " +nome+ "!");

        if (idade < 18) {
            System.out.println(nome+ ", você é menor de idade!");
        } else {
            System.out.println(nome+ ", você é maior de idade!");
        }

        System.out.println("Fim do programa!");

        scanner.close(); // encerra o recurso de leitura que esta associado ao Scanner
    }
}
