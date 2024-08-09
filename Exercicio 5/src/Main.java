import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int x;
        int y;
        boolean t = false;

        Random rand = new Random();
        x = rand.nextInt(10) + 1;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("tente acertar o numero que estou pensando: ");
            y = sc.nextInt();
            if(y == x){
                System.out.println("Acertou !");
                t = true;
            }else if(y<x){
                System.out.println("Meu numero é um pouco maior.");
            }else
                System.out.println("Meu numero é um pouco menor");
        }while(t == false);

    }
}