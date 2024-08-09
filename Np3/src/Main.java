import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        float NPA;
        float NP3;
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com a NPA: ");
        NPA = sc.nextFloat();

        if (NPA > 60){
            System.out.println("Aprovado");
        }else if (NPA < 30){
            System.out.println("Reprovado");
        }else {
            System.out.println("Digite a nota da NP3: ");
            NP3 = sc.nextFloat();

            NPA = (NP3 + NPA)/2;

            if(NPA > 50){
                System.out.println("Aprovado");
            }
            else if (NPA < 50){
                System.out.println("Reprovado");
            }
        }


    }
}