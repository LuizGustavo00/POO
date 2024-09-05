import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        boolean a = false;
        int x = rand.nextInt(2);
        int y = rand.nextInt(2);

        Scanner sc = new Scanner(System.in);

        boolean[][] matriz;
        matriz = new boolean[2][2];
        matriz[x][y] = true;


        while(!a) {
            System.out.println("Digite o Valor de X: ");
            x = sc.nextInt();
            System.out.println("Digite o Valor de Y: ");
            y = sc.nextInt();

            if (matriz[x][y]) {
                System.out.println("Bomba");
                a = true;
            }

        }
    }
}