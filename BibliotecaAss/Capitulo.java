package BibliotecaAss;

public class Capitulo {
    private String titulo;
    private int numero;

    public Capitulo(String titulo, int numero) {
        this.titulo = titulo;
        this.numero = numero;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getNumero() {
        return numero;
    }
}
