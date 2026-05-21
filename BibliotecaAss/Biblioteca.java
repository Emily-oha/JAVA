package BibliotecaAss;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nome;

    // Agregação: Biblioteca possui livros,
    // mas Livro pode existir fora dela
    private List<Livro> livros;

    public Biblioteca(String nome) {
        this.nome = nome;
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void listarLivros() {
        System.out.println("Biblioteca: " + nome);

        for (Livro livro : livros) {
            System.out.println("Livro: " + livro.getTitulo());
            System.out.println("ISBN: " + livro.getIsbn());
            System.out.println("Autor: " + livro.getAutor().getNome());

            for (Capitulo capitulo : livro.getCapitulos()) {
                System.out.println("  Capítulo " + capitulo.getNumero() + ": " + capitulo.getTitulo());
            }

            System.out.println();
        }
    }
}
