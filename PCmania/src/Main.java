import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MemoriaUSB memoriaUSB = new MemoriaUSB();
        Computador [] comp = new Computador[3];
        Cliente cliente = new Cliente();

        for (int i = 0; i < comp.length; i++) {
            comp[i] = new Computador();
        }
        int y;
        boolean x = true;
        float mat = 1845;

        //PROMOÇÃO 1
        comp[0].marca = "Positivo";
        comp[0].preco = mat;
        comp[0].harBas[0].nome = "Pentium Core I3";
        comp[0].harBas[0].capacidade = 2200;
        comp[0].harBas[1].capacidade = 8;
        comp[0].harBas[2].capacidade = 500;
        comp[0].sisOp.nome = "Linux Ubuntu";
        comp[0].sisOp.tipo = 32;
        comp[0].memUSB.nome = "Pen-drive";
        comp[0].memUSB.capacidade = 16;

        //PROMOÇÃO 2
        comp[1].marca = "Acer";
        comp[1].preco = mat + 1234;
        comp[1].harBas[0].nome = "Pentium Core I5";
        comp[1].harBas[0].capacidade = 3370;
        comp[1].harBas[1].capacidade = 16;
        comp[1].harBas[2].capacidade = 1;
        comp[1].sisOp.nome = "Windows 8";
        comp[1].sisOp.tipo = 64;
        comp[1].memUSB.nome = "Pen-drive";
        comp[1].memUSB.capacidade = 32;

        //PROMOÇÃO 3
        comp[2].marca = "Vaio";
        comp[2].preco = mat + 5678;
        comp[2].harBas[0].nome = "Pentium Core I7";
        comp[2].harBas[0].capacidade = 4500;
        comp[2].harBas[1].capacidade = 32;
        comp[2].harBas[2].capacidade = 2;
        comp[2].sisOp.nome = "Windows 10";
        comp[2].sisOp.tipo = 64;
        comp[2].memUSB.nome = "HD";
        comp[2].memUSB.capacidade = 1;

        System.out.println("Digite seu nome: ");
        cliente.nome = sc.nextLine();
        System.out.println("Digite seu CPF: ");
        cliente.cpf = sc.nextLong();

        System.out.println();
        System.out.println("Bem vindo "+ cliente.nome + " !");
        System.out.println("Temos as seguintes promoções: ");
        System.out.println();
        System.out.println("Promoção 1: ");
        comp[0].mostraPCConfig();
        System.out.println();
        System.out.println("Promoção 2: ");
        comp[1].mostraPCConfig();
        System.out.println();
        System.out.println("Promoção 3:");
        comp[2].mostraPCConfig();
        System.out.println();


        while (x){

            System.out.println("Para adicionar ao carrinho, digite o numero referente a promoção ou 0 para fechar o carrinho: ");
            y = sc.nextInt();

            switch (y){
                case 0:
                    x = false;
                    System.out.println("Carrinho fechado!");
                    System.out.println();
                break;
                case 1:
                    for(int i = 0; i < cliente.computadores.length; i++){
                        if(cliente.computadores[i] == null){
                            cliente.computadores[i] = comp[0];
                            System.out.println("Promoção 1 adicionada ao carrinho!");
                            System.out.println();
                            break;
                        }
                    }
                break;
                case 2:
                    for(int i = 0; i < cliente.computadores.length; i++){
                        if(cliente.computadores[i] == null){
                            cliente.computadores[i] = comp[1];
                            System.out.println("Promoção 2 adicionada ao carrinho!");
                            System.out.println();
                            break;
                        }
                    }
                break;
                case 3:
                    for(int i = 0; i < cliente.computadores.length; i++){
                        if(cliente.computadores[i] == null){
                            cliente.computadores[i] = comp[2];
                            System.out.println("Promoção 3 adicionada ao carrinho!");
                            System.out.println();
                            break;
                        }
                    }
                break;
            }
        }


        System.out.println("Caro "+ cliente.nome);
        System.out.printf("O total da compra foi de: R$ %.2f%n", cliente.calculaTotalCompra());




    }
}