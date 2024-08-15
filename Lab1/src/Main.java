import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o numero");
        int num = sc.nextInt();

        System.out.println("Os numeros pares entre 0 e "+ num +" são: ");
        mostraPares(num);
        System.out.println("O fatorial é "+ calculaFatorial(num));

    }

    public static int calculaFatorial(int num) {
        if (num == 1)
            return 1;
        else
            return num * calculaFatorial(num - 1);
    }


    public static void mostraPares(int n){
        for(int i = 0; i <= n; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}