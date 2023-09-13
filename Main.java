import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Computer[] computers = new Computer[100];
        Client client = new Client();

        client.cpf = 111;
        client.name = "Luiz";

        double total = 0;

        boolean flag = true;
        int i = 0;
        while (flag){
            System.out.println("------ Escolha a promoção ------");
            System.out.println("1 - Promoção 1");
            System.out.println("2 - Promoção 2");
            System.out.println("3 - Promoção 3");
            System.out.println("0 - Finalizar");

            int option = input.nextInt();
            input.nextLine();
            switch (option){
                case 0 -> {
                    flag = false;
                    break;
                }
                case 1 -> {
                    computers[i] = new Computer("Positivo", 2300F);
                    computers[i].mostraPCConfigs();
                    break;
                }
                case 2 -> {
                    computers[i] = new Computer("Acer", 5800F);
                    computers[i].mostraPCConfigs();
                    break;
                }

                case 3 -> {
                    computers[i] = new Computer("Vaio", 1800F);
                    computers[i].mostraPCConfigs();
                    break;
                }
                default -> {
                    System.out.println("Entrada invalida");
                    break;
                }
            }
            total = total + client.calculaTotalCompra(option);
            i++;
        }
        input.close();
        client.showAllBuy(total);
    }
}