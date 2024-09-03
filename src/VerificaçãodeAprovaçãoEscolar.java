import java.util.Scanner;

public class VerificaçãodeAprovaçãoEscolar {
    public static void main(String[] args) {
        double media= 0.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a média do aluno: ");
        media = sc.nextDouble();
        if (media >= 7.0) {
            System.out.println("Aprovado");
        } else if (media >= 5.0 && media < 7) {
            System.out.println("Recuperação");
        } else if (media < 5) {
            System.out.println("Reprovado");
        }
    }
}
