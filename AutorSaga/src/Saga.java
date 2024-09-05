public class Saga {
    private int nota;
    Livro[] livros;

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public Saga(Livro[] livros, int nota) {
        this.nota = nota;
        this.livros = new Livro[livros.length];
        for (int i = 0; i < livros.length; i++) {
            this.livros[i] = livros[i];
        }
    }

    public void adicionarLivros(Livro[] livros) {
        for (int i = 0; i < livros.length; i++) {
            if (livros[i] == null) {
                livros[i] = new Livro();
            }
        }
    }

    public void listarLivros(){
        for(int i=0;i<livros.length;i++){
            if(livros[i]!=null){
                System.out.println(livros[i].getTitulo()+" paginas: "+livros[i].getPaginas());
            }
        }
    }
}
