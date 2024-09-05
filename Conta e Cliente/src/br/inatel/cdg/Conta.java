package br.inatel.cdg;

public class Conta {
    private int numero;
    private float saldo;
    private float limite;
    Cliente[] clientes;

    public Conta() {
        clientes = new Cliente[10];
        clientes[1] = new Cliente();
        clientes[2] = new Cliente();
    }

    public void sacar(float quantia){
        if(quantia <= saldo){
            this.saldo -= quantia;
            System.out.println("Voce sacou "+quantia);
        }
    }

    public void deposita(float quantia){
        this.saldo += quantia;
        System.out.println("Voce depositou "+quantia);
    }
}
