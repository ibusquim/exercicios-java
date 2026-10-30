public class ExemploSwitch {
    public static void main(String[] args) {
        // imprimindo o dia da semana considerando 1 como domingo
        byte dia = 5;

        // char, int, byte, short, enum e String
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
        // utilizar break para sair do switch
            default:
                System.out.println("opção inválida");
                break;
        }

        char sexualidade = 'F';

        switch (sexualidade) {
            case 'M':
                System.out.println("Masculino");
                break;
            case 'F': { // pode ser executado colocando as 'chaves', bloco de código. Pouco utilizado
                System.out.println("Feminino");
                break;
            }
            default:
                System.out.println("Opção Inválida");
                break;
        }
    }
}
