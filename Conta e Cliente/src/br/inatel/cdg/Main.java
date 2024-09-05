package br.inatel.cdg;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Conta[] contas = new Conta[10];
        contas[2] = new Conta();
        contas[1] = new Conta();

        contas[1].clientes[1].setNome("Luiz");
        contas[1].clientes[2].setNome("Maria");

        contas[1].clientes[1].setCpf(123);
        contas[1].clientes[2].setCpf(555);

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite numero da conta");
        int numC = sc.nextInt();
        System.out.println("1- TITULAR 2-SEGUNDO TITULAR");
        int num2 = sc.nextInt();
        System.out.println("Bem vindo "+contas[numC].clientes[num2].getNome());
        System.out.println("1- DEPOSITO 2- SAQUE");
        int num = sc.nextInt();
        if(num == 1){
            System.out.println("Digite a quantia: ");
            int quantia = sc.nextInt();
            contas[numC].deposita(quantia);
        }else if(num == 2){
            System.out.println("Digite a quantia: ");
            int quantia = sc.nextInt();
            contas[numC].sacar(quantia);
        }


    }
}