import java.util.HashMap;
import java.util.Map;
import Exception.*;

public class Fetin {

    private Map<String,Double> mapaFetin;

    public Fetin()
    {
        this.mapaFetin = new HashMap<>();
    }

    //funcao add nome do projeto e a nota
    public void addFetin (String nome, double nota) throws NomeException {
        if (mapaFetin.containsKey(nome)) {
            throw new NomeException("Projeto com o nome  " + nome + " já existente");
        }

        if (nota < 6.0) {
            throw new NotaInsuficienteException("Nota Insuficiente para a aprovação na FETIN");
        }

        mapaFetin.put(nome, nota);
    }

    //buscar elemento atraves do get(chave)
    public Double getNota(String nome) {
        return mapaFetin.get(nome);
    }
}