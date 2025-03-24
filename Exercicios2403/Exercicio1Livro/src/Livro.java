public class Livro {
    private String titulo, autor;
    private static int contador = 0;

    public Livro() {
        titulo = "Desconhecido";
        autor = "Anonimo";
        contador++;
    }

    public Livro(String autor, String titulo) {
        this.autor = autor;
        this.titulo = titulo;
        contador++;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public static int getContador() {
        return contador;
    }

    public void exibeDados() {
        System.out.println("Autor: " + autor);
        System.out.println("Titulo: " + titulo);
    }
}