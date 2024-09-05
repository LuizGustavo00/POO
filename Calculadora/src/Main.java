import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double raio;

        Scanner sc = new Scanner(System.in);
        System.out.println("O que deseja calcular: ");
        System.out.println("1- Circuferencia");
        System.out.println("2- Volume da esfera");
        System.out.println("3- Volume do cilindro");

        int op = sc.nextInt();

        switch (op) {
            case 1:
                System.out.println("Circuferencia");
                System.out.println("Digite o raio: ");
                raio = sc.nextDouble();
                System.out.println("A circuferencia é: "+ Calculadora.circuferencia(raio));
                break;
            case 2:
                System.out.println("Volume da esfera");
                System.out.println("Digite o raio: ");
                raio = sc.nextDouble();
                System.out.println("O volume da esfera é: "+ Calculadora.volumeEsfera(raio));
                break;
            case 3:
                System.out.println("Volume do cilindro");
                System.out.println("Digite o raio: ");
                raio = sc.nextDouble();
                System.out.println("Digite a altura: ");
                double altura = sc.nextDouble();
                System.out.println("O volume do cilindro é: "+ Calculadora.volumeCilindro(raio,altura));
                break;

        }


    }
}