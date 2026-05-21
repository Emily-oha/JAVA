package BibliotecaAss;

import java.util.ArrayList;
import java.util.List;

public class Livro {
    private String titulo;
    private String isbn;
    private Autor autor;

    // Composição: Capitulo faz parte de Livro
    private List<Capitulo> capitulos;

    public Livro(String titulo, String isbn, Autor autor) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.capitulos = new ArrayList<>();
    }

    public void adicionarCapitulo(String titulo, int numero) {
        Capitulo capitulo = new Capitulo(titulo, numero);
        capitulos.add(capitulo);
    }

    public String getTitulo() {
        return titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public List<Capitulo> getCapitulos() {
        return capitulos;
    }
}