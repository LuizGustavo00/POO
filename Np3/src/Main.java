import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        Scanner sc = new Scanner(System.in);

        aluno.nome = "Luiz";
        aluno.matricula = 1845;
        aluno.periodo = 6;

        System.out.println("Entre com a NP1: ");
        aluno.NP1 = sc.nextInt();
        System.out.println("Entre com a NP2: ");
        aluno.NP2 = sc.nextInt();

        aluno.calculaMedia();
        System.out.println(aluno.toString());

    }
}