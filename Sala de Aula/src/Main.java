import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numAlunos;

        System.out.println("Digite o numero de Alunos: ");
        numAlunos = sc.nextInt();

        switch (numAlunos) {
            case 10:
            case 20:
                System.out.println("Sala 16");
            break;

            case 30:
                System.out.println("Sala 22");
            break;

            default:
                System.out.println("Sempre será executado");

        }

    }
}