public class Main {
    public static void main(String[] args) {

        Livro livro1 = new Livro();
        livro1.setTitulo("O Senhor dos Anéis");
        livro1.setPaginas(1178);

        Livro livro2 = new Livro();
        livro2.setTitulo("O Hobbit");
        livro2.setPaginas(310);

        Livro[] livros = {livro1, livro2};

        Saga saga = new Saga(livros, 5);

        saga.adicionarLivros(livros);

        System.out.println("Livros na saga:");
        saga.listarLivros();

        Saga[] sagas = {saga};
        Autor autor = new Autor("J.R.R. Tolkien", sagas);

        System.out.println("\nSagas do autor:");
        autor.listarSagas();
    }
}
