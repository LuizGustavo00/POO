package org.example;

import br.Model.*;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        boolean flag = true;

        Scanner entrada = new Scanner(System.in); //leitura de dados

        while(flag){
            System.out.println("------------------------------");
            System.out.println("Bem vindo ao Banco Central!");
            System.out.println("1 - Area do cliente");
            System.out.println("2 - Area do gerente");
            System.out.println("3 - Sair");
            System.out.println("------------------------------");

            int opLogin = entrada.nextInt();
            entrada.nextLine();

            while (opLogin != 1 && opLogin != 2 && opLogin != 3) {
                System.out.println("Opção invalida, tente novamente!");
                opLogin = entrada.nextInt();

            }
            if (opLogin == 1){
                Cliente cliente = new Cliente();
                System.out.println("Area do cliente! ");
                boolean acesso = true;
                while (acesso) {
                    String nome = "";
                    String senha = "";
                    while (acesso) {
                        try {
                            System.out.println("Insira seu nome: ");
                            nome = entrada.nextLine();
                            System.out.println("Senha: ");
                            senha = entrada.nextLine();
                            acesso = false;

                        } catch (InputMismatchException e) {

                        }
                    }
                    acesso = cliente.authCliente(nome,senha);
                    if (acesso){
                        System.out.println("Nome ou senha incorretos. Tente novamente!");
                    }
                    else {
                        System.out.println("Bem Vindo "+ nome);
                        cliente.funcoes(nome);
                    }
                }
            } else if (opLogin == 2) {
                Gerencia gerencia = new Gerencia();
                System.out.println("Area da gerencia! ");
                boolean acesso = true;
                while (acesso) {
                    String nome = "";
                    String senha = "";
                    while (acesso) {
                        try {
                            System.out.println("Insira seu nome ");
                            nome = entrada.nextLine();
                            System.out.println("Senha: ");
                            senha = entrada.nextLine();
                            acesso = false;

                        } catch (InputMismatchException e) {

                        }
                    }
                    acesso = gerencia.authGerencia(nome,senha);
                    if (acesso){
                        System.out.println("Nome ou senha incorretos. Tente novamente!");
                    }
                    else {
                        System.out.println("Bem Vindo "+ nome);
                        gerencia.funcoes(nome);
                    }
                }

            }else if (opLogin == 3) {
                System.out.println("Encerrando atendimento!");
                flag = false;
            }
            }

        }









    }
