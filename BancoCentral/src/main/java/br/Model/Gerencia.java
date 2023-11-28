package br.Model;

import br.DAO.Database;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;


public class Gerencia extends Database{

    public boolean authGerencia(String nome, String senha) { //login para verificar se o cliente possui uma conta
        boolean aux = true;
        connectToDB();
        String sql = "SELECT * FROM Gerencia WHERE nome=? AND senha=?";

        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, nome);
            pst.setString(2, senha);
            rs = pst.executeQuery();

            while (rs.next()) {
                aux = false;
            }

        } catch (SQLException e) {
            System.out.println("Erro " + e.getMessage());
        } finally {
            try {
                con.close();
                pst.close();
                rs.close();
            } catch (SQLException e) {
                System.out.println("Erro ao fechar conexão " + e.getMessage());
            }
        }


        return aux;
    }

    public void funcoes(String nome) { //Funçoes do gerente
        Scanner entrada = new Scanner(System.in);
        int aux;
        String senha;
        boolean saida = false;
        boolean loop = true;
        while (loop) {
            System.out.println("O que deseja fazer? ");
            System.out.println("1 - Verificar Contas");
            System.out.println("2 - Gerenciar clientes");
            System.out.println("3 - Sair");

            while (loop) {

                try { //menu de opçoes
                    aux = entrada.nextInt();
                    switch (aux) {
                        case 1:
                            mostrarClientes(nome);
                            loop = false;
                            break;
                        case 2:
                            System.out.println("Deseja adicionar ou excluir uma conta?");
                            System.out.println("1- Adicionar");
                            System.out.println("2- Excluir");
                            System.out.println("3- Sair");
                            int opc=0;
                            opc = entrada.nextInt();
                            entrada.nextLine();
                            switch (opc){
                                case 1:
                                    System.out.println("Insira o nome do cliente: ");
                                    nome = entrada.nextLine();
                                    System.out.println("Insira a nova senha: ");
                                    senha = entrada.nextLine();
                                    addCliente(nome, senha);
                                    break;
                                case 2:
                                    System.out.println("Insira o nome do cliente que deseja remover: \n");
                                    mostrarClientes(nome);
                                    nome = entrada.nextLine();
                                    delConta(nome);
                                    break;
                                case 3:
                                    break;
                            }
                            loop = false;
                            break;
                        case 3:
                            loop = false;
                            System.out.println("Voltando ao menu inicial");
                            saida = true;
                            break;
                    }
                } catch (InputMismatchException e) { //validando erro
                    System.out.println("Dados de entrada inválidos. Tente novamente!");
                    entrada.nextLine();
                }
            }if(saida){
                loop = false; // caso 5 retorna ao menu principal
            } else {
                loop = true;
            }

        }
    }
    public void mostrarClientes(String nome){
        connectToDB();
        String sql = "SELECT Cliente_nome,Idconta FROM Conta";
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            System.out.println("Lista de Clientes: ");
            while(rs.next()){
                System.out.println(rs.getString("Cliente_nome") + " - Conta: " +rs.getInt("Idconta"));
            }
            System.out.println();
        }catch (SQLException e){
            System.out.println("Erro de operação: " + e.getMessage());
        }
    }
    public void addCliente(String nome, String senha){
        connectToDB();
        String sql = "INSERT INTO Cliente (Nome,senha) VALUES (?,?)"; //adicionar na tabela cliente e conta
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, nome);
            pst.setString(2, senha);
            pst.execute();
            criaConta(nome);

        } catch (SQLException e) {
            System.out.println("Erro " + e.getMessage());
        }
    }
    public void criaConta(String nome){
        Random random = new Random();
        int ale= random.nextInt(900) + 100;
        connectToDB();
        String sql = "INSERT INTO Conta (Idconta,Debitos,Saldo,Cliente_nome) VALUES (?,'0.00','0.00',?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, ale);
            pst.setString(2, nome);
            pst.execute();
            System.out.println("Conta criada com sucesso!\n");

        } catch (SQLException e) {
            System.out.println("Erro " + e.getMessage());
        }
    }
    public void delCliente(String nome){
        connectToDB();
        String sql = "DELETE FROM Cliente WHERE nome = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, nome);
            pst.execute();

        } catch (SQLException e) {
            System.out.println("Erro " + e.getMessage());
        }
    }
    public void delConta(String nome){
        connectToDB();
        String sql = "DELETE FROM Conta WHERE Cliente_nome = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, nome);
            pst.execute();
            System.out.println("Conta deletada com sucesso!");
            delCliente(nome);

        } catch (SQLException e) {
            System.out.println("Erro " + e.getMessage());
        }
    }
}
