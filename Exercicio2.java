/*Objetivo: Programa que calcula a idade futura de uma pessoa

        Seu programa deverá:
        1. Solicitar o nome do usuário.
        2. Solicitar a idade atual.
        3. Perguntar para qual ano futuro ele quer calcular.
        4. Exibir o nome e a idade que ele terá nesse momento.

 */

import java.util.Scanner;
import java.time.LocalDate;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nomeUsuario = "";
        String respostaFezAniversario = "";
        int    idadeUsuario = 0;

        System.out.println("Informe o nome de usuário: ");
        nomeUsuario = scanner.nextLine();

        System.out.println("Informe a sua idade: ");
        while (!scanner.hasNextInt()){
            System.out.println("O valor que voce informou não é inteiro. Tente novamente: ");

        }

        do{
        System.out.println("Voce já fez aniversário?\nDigite S ou N");
        respostaFezAniversario = scanner.next().trim();
        } while (!respostaFezAniversario.equalsIgnoreCase("S") && !respostaFezAniversario.equalsIgnoreCase("N"));

        boolean fezAniversario = respostaFezAniversario.equalsIgnoreCase("S");

        int anoAtual = LocalDate.now().getYear();
        int anoNascimentoUsuario;

        if (!fezAniversario){
            anoNascimentoUsuario = (anoAtual - idadeUsuario) - 1;
        } else {
            anoNascimentoUsuario = anoAtual - idadeUsuario;
        }

        System.out.println("Qual ano futuro você deseja saber qual sua idade? ");
        int anoFuturo = scanner.nextInt();

        while (anoFuturo < anoAtual){
            System.out.println("O ano futuro informado é mais antigo que " +anoAtual+ " . Por favor, tente novamente: ");
            anoFuturo = scanner.nextInt();
        }

        int idadeFuturaUsuario = anoFuturo - anoNascimentoUsuario;

        if (anoFuturo == anoAtual){
            if (!fezAniversario) {
                System.out.println("O ano futuro é igual ao atual.\nPorém até o final do ano " +anoAtual+ " seu nome continuará sendo " +nomeUsuario+ " e você terá " +(idadeUsuario + 1)+ " anos.");
            } else {
                System.out.println("O ano futuro é igual ao atual.\nPortanto hoje em " +anoAtual+ " seu nome é " +nomeUsuario+ " e você tem " +idadeUsuario+ " anos.");
            }
        } else if (anoFuturo < anoAtual){
            System.out.println("Em " +anoFuturo+ " seu nome continuará sendo " +nomeUsuario+ " e você terá " +idadeFuturaUsuario+ " anos até o fim do ano.");
        } else {
            System.out.println("Em " +anoFuturo+ " seu nome continuará sendo " +nomeUsuario+ " e você terá " +idadeFuturaUsuario+ " anos até o fim do ano.");
        }

        scanner.close();
    }
}
