package Funcionalidade.Redes;
import Exceções.QuantidadeInsuficiente;
import Interfaces.Compartilhamento;

public class Twitter extends RedeSocial implements Compartilhamento {


    public Twitter(String senha, int numAmigos) throws QuantidadeInsuficiente {
        super(senha, numAmigos);
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhou no Twitter");
    }

    @Override
    public void curtirPublicação() {
        System.out.println("Curtiu uma publicação no Twitter");
    }

    @Override
    public void postarComentario() {
        System.out.println("postou um comentario no Twitter");
    }

    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no Twitter");
    }

    @Override
    public void postarVideo() {
        System.out.println("postou um video no Twitter");
    }
}
