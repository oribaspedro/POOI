public class Livro {
    private String titulo, autor;

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setAutor(String novoAutor) {
        autor = novoAutor;
    }

    public void setTitulo(String novoTitulo) {
        titulo = novoTitulo;
    }

    void mostrarDados() {
        System.out.println("Autor: " + getAutor());
        System.out.println("Livro: " + getTitulo());
    }
}