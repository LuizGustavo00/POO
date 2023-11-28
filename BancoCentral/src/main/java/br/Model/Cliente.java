package br.Model;

import br.DAO.Database;

import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Cliente extends Database {

    public boolean authCliente(String nome, String senha) { //login para verificar se o cliente possui uma conta
        boolean aux = true;
        connectToDB();
        String sql = "SELECT * FROM Cliente WHERE nome=? AND senha=?";

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

    public void funcoes(String nome) { //Funçoes do cliente
        Scanner entrada = new Scanner(System.in);
        int aux;
        boolean saida = false;
        boolean loop = true;
        while (loop) {
            System.out.println("O que deseja fazer? ");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3- Consultar informações");
            System.out.println("4- Solicitar emprestimo");
            System.out.println("5- Sair");

            while (loop) {

                try { //menu de opçoes
                    aux = entrada.nextInt();
                    switch (aux) {
                        case 1:
                            System.out.println("Qual o valor a ser depositado: ");
                            float quantia = entrada.nextFloat();
                            depositar(nome, quantia);
                            loop = false;
                            break;
                        case 2:
                            System.out.println("Qual o valor a ser sacado: ");
                            float saque = entrada.nextFloat();
                            sacar(nome,saque);
                            loop = false;
                            break;
                        case 3:
                            consulta(nome);
                            loop = false;
                            break;
                        case 4:
                            System.out.println("Qual o valor do emprestimo: ");
                            float emp = entrada.nextFloat();
                            emprestimo(nome,emp);
                            loop = false;
                            break;
                        case 5:
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

    public void depositar(String nome, float quantia) { //funçao de sacar
        connectToDB();
        String sql = "UPDATE Conta SET Saldo = Saldo + ? WHERE Cliente_nome = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setFloat(1, quantia);
            pst.setString(2, nome);
            pst.execute();
            System.out.println("Valor depositado com sucesso\n");

        } catch (SQLException ex) {
            System.out.println("Erro = " + ex.getMessage());
        } finally {
            try {
                con.close();
                pst.close();
            } catch (SQLException exc) {
                System.out.println("Erro: " + exc.getMessage());
            }

        }
    }

    public void sacar(String nome, float saque){
        int op;
        Scanner entrada = new Scanner(System.in);
        connectToDB();
        String sql = "SELECT Saldo FROM Conta WHERE Cliente_nome = ?";//solicitação para o mysql
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, nome); //paramentro ? na solicitaçao
            rs = pst.executeQuery();

            while (rs.next()) {
                if(rs.getFloat("Saldo")<saque) {//verificando a possiblidade de sacar
                    System.out.println("Saldo insuficiente");
                    System.out.println("O saldo atual é de "+rs.getFloat("Saldo")+"\n"); //retorna o saldo da conta caso nao seja possivel sacar
                    float saldo1 = rs.getFloat("Saldo");
                    System.out.println("Deseja usar o cheque especial? \n");
                    boolean auxloop = true;
                    while (auxloop){

                        System.out.println("1- Sim");
                        System.out.println("2- Não");

                        op = entrada.nextInt();

                        switch (op){
                            case 1:
                                chequeEspecial(nome,saldo1,saque); //chamando funçao de cheque especial
                                auxloop = false;
                                break;
                            case 2:
                                System.out.println("Saldo insuficiente");
                                System.out.println("O saldo atual é de "+rs.getFloat("Saldo")+"\n");
                                auxloop = false;
                                break;
                        }


                    }
                }else if (rs.getFloat("Saldo")>=saque){
                    saqueAux(nome,saque);
                }
            }

        }catch (SQLException exc){
            System.out.println("Erro: " + exc.getMessage());
        }

    }
    public void saqueAux(String nome, Float saque) throws SQLException { // auxilia do saque
        connectToDB();
        String sql = "UPDATE Conta SET Saldo = Saldo - ? WHERE Cliente_nome = ?"; // atualizando valor da conta onde foi sacado
        try {
            pst = con.prepareStatement(sql);
            pst.setFloat(1, saque);
            pst.setString(2, nome);
            pst.execute();
            System.out.println("Valor sacado com sucesso\n");

        }catch (SQLException exc) {
            System.out.println("Erro: " + exc.getMessage());
        }
    }
    public void chequeEspecial(String nome,Float saldo,Float saque){ // quando usado, zera o saldo da conta e adiciona a quantia em debitos
        connectToDB();
        float dif;
        saque = (float) (saque*1.03);
        dif = saque - saldo;
        String sql = "UPDATE Conta SET Debitos = Debitos + ?,Saldo = '0' WHERE Cliente_nome = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setFloat(1, dif);
            pst.setString(2, nome);
            pst.execute();
            System.out.println("Cheque especial utilizado ");
            System.out.println("Valor sacado com sucesso \n");

        }catch (SQLException exc) {
            System.out.println("Erro: " + exc.getMessage());
        }
    }
    public void consulta(String nome){ //verificando dados
        connectToDB();

        String sql = "SELECT * FROM Conta WHERE Cliente_nome = ? ";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, nome);
            rs = pst.executeQuery();
            while (rs.next()){
                System.out.println("Conta: " + rs.getInt("idConta") + "\n"+ "Nome: "+ rs.getString("Cliente_nome") + "\n"+"Saldo: "+ rs.getFloat("Saldo"));
                if(rs.getFloat("Debitos")!=0){
                    consuAux(nome);
                }else {
                    System.out.println("Debitos: 0\n");
                }
            }

        }catch (SQLException exc) {
            System.out.println("Erro: " + exc.getMessage());
        }
    }

    public void consuAux(String nome){
        connectToDB();
        Scanner entrada = new Scanner(System.in);
        String sql = "SELECT * FROM Conta WHERE Cliente_nome = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, nome);
            rs = pst.executeQuery();
            while (rs.next()){
                System.out.println("Você possui R$"+rs.getFloat("Debitos")+" em debito com o banco\n");
                System.out.println("1- Pagar os debitos");
                System.out.println("2- Sair");
                int op = 0;
                op = entrada.nextInt();
                switch (op){
                    case 1:
                        if(rs.getFloat("saldo")>=rs.getFloat("Debitos")){
                            consuAux1(nome);
                        }else {
                            System.out.println("Você não possui saldo suficiente para realizar o pagamento\n");
                        }
                        break;
                    case 2 :
                        break;
                }
            }

        }catch (SQLException exc) {
            System.out.println("Erro: " + exc.getMessage());
        }
    }
    public void consuAux1(String nome){
        connectToDB();
        String sql = "UPDATE Conta SET Saldo = Saldo - Debitos,Debitos = '0' WHERE Cliente_nome = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, nome);
            pst.execute();
            System.out.println("Todos os debitos foram pagos\n");
        }catch (SQLException exc) {
            System.out.println("Erro: " + exc.getMessage());
        }
    }

    public void emprestimo(String nome,Float quantia){ //soma valor ao saldo e ao debitos
        connectToDB();
        String sql = "SELECT Debitos FROM Conta WHERE Cliente_nome = ?";
        Scanner entrada = new Scanner(System.in);
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, nome); //parametro ? na solicitaçao
            rs = pst.executeQuery();

            while (rs.next()){
                if(rs.getFloat("Debitos")==0.0) {//verificando a possiblidade de sacar
                    float quantiaJuros = (float) (quantia*1.03);
                    System.out.println("O valor total a ser pago do empretimo será de "+quantiaJuros +"\n");
                    System.out.println("Deseja realizar a operação? ");
                    System.out.println("1- Sim");
                    System.out.println("2- Não");
                    int op = 0;
                    op = entrada.nextInt();
                    switch (op) {
                        case 1:
                            empresAux(nome, quantia, quantiaJuros);
                            break;
                        case 2:
                            break;
                    }
                }else{
                    System.out.println("Emprestimo recusado!");
                    System.out.println("Você possui debitos com o banco\n");

                }
            }

        }catch (SQLException exc){
            System.out.println("Erro: " + exc.getMessage());
        }
    }

    public void empresAux(String nome, Float quantia,Float quantiaJuros){
        connectToDB();
        String sql = "UPDATE Conta SET Saldo = Saldo + ?,Debitos = Debitos + ? WHERE Cliente_nome = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setFloat(1, quantia);//parametro ? na solicitaçao
            pst.setFloat(2, quantiaJuros);
            pst.setString(3, nome);
            pst.execute();
            System.out.println("Emprestimo realizado com sucesso\n");


        }catch (SQLException exc){
            System.out.println("Erro: " + exc.getMessage());
        }
    }
}
