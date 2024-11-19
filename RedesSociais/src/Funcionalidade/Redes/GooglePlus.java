package Funcionalidade.Redes;
import Exceções.QuantidadeInsuficiente;
import Interfaces.*;

public class GooglePlus extends RedeSocial implements VideoConferencia,Compartilhamento{


    public GooglePlus(String senha, int numAmigos) throws QuantidadeInsuficiente {
        super(senha, numAmigos);
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhou no Google Plus");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Fez Live no Google Plus");
    }

    @Override
    public void postarVideo() {
        System.out.println("postou um video no Google Plus");
    }

    @Override
    public void postarComentario() {
        System.out.println("postou um comentario no Google Plus");
    }

    @Override
    public void curtirPublicação() {
        System.out.println("Curtiu uma publicação no Google Plus");
    }

    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no Google Plus");
    }
}
