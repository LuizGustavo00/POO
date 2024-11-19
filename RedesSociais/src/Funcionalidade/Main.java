package Funcionalidade;

import Exceções.QuantidadeInsuficiente;
import Exceções.SenhaInvalida;
import Funcionalidade.Redes.*;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        HashSet <RedeSocial> redes = new HashSet<>();
        Usuario u1 = new Usuario(redes);
        
        Facebook f = null;
        Twitter t = null;

        
        u1.setNome("Joao");
        u1.setEmail("joao@gmail.com");

        try {
            f = new Facebook("12345678",-9); //forçando exceção de amigos insuficientes
            redes.add(f);
        }catch (SenhaInvalida | QuantidadeInsuficiente e){
            System.out.println(e.getMessage());
        }

        try {
            f = new Facebook("1234567",-9); //forçando exceção de senha incorreta
            redes.add(f);
        }catch (SenhaInvalida | QuantidadeInsuficiente e){
            System.out.println(e.getMessage());
        }

        try {
            f = new Facebook("12345678",9); //criando Facebook
            redes.add(f);
        }catch (SenhaInvalida | QuantidadeInsuficiente e){
            System.out.println(e.getMessage());
        }

        try {
            t = new Twitter("12345678",12); //criando Twitter
            redes.add(t);
        }catch (SenhaInvalida | QuantidadeInsuficiente e){
            System.out.println(e.getMessage());
        }

        f.curtirPublicação();
        f.fazStreaming();
        f.postarVideo();

        System.out.println();

        t.postarFoto();
        t.postarComentario();
        t.compartilhar();





    }
}