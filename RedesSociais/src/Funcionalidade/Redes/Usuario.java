package Funcionalidade.Redes;

import java.util.HashSet;

public class Usuario {

    private String nome;
    private String email;

    HashSet<RedeSocial> redes = new HashSet<>();


    public Usuario(HashSet<RedeSocial> redes) {
        this.redes = redes;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

