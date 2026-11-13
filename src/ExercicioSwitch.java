import java.sql.SQLOutput;

public class ExercicioSwitch {
    public static void main(String[] args) {
        // Dado os valores de 1 a 7, imprima se é dia útil ou final de semana
        // considerando 1 como domingo

        byte diaSemana = 2;
        String tipoDiaSemana = "";

        if (diaSemana > 1 && diaSemana < 7) {
            tipoDiaSemana = "Dia útil";
        } else {
            tipoDiaSemana = "Final de Semana";
        }

        switch (diaSemana) {
            case 1:
                System.out.println(tipoDiaSemana);
                break;
            case 2:
                System.out.println(tipoDiaSemana);
                break;
            case 3:
                System.out.println(tipoDiaSemana);
                break;
            case 4:
                System.out.println(tipoDiaSemana);
                break;
            case 5:
                System.out.println(tipoDiaSemana);
                break;
            case 6:
                System.out.println(tipoDiaSemana);
                break;
            case 7:
                System.out.println(tipoDiaSemana);
                break;
            default:
                System.out.println("Este valor não se refere a nenhum dia da semana");
        }
    }
}
