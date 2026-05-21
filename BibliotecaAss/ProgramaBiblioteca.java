package BibliotecaAss;

public class ProgramaBiblioteca {
    public static void main(String[] args) {
        Autor autor = new Autor("Machado de Assis", "Brasileiro");

        Livro livro = new Livro("O Alienista", "978-85-359-0277-5", autor);
        livro.adicionarCapitulo("Do título", 1);
        livro.adicionarCapitulo("Do livro", 2);

        Biblioteca biblioteca = new Biblioteca("Biblioteca USP");
        biblioteca.adicionarLivro(livro);

        biblioteca.listarLivros();
    }
}
