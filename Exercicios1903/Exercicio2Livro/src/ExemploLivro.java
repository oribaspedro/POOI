public class ExemploLivro {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        Livro livro2 = new Livro();


        livro1.setAutor("Arthur Miller");
        livro1.setTitulo("All My Sons");
        livro1.mostrarDados();

        livro2.setAutor("Douglas Adams");
        livro2.setTitulo("Guia do Mochileiro das Galaxias");
        System.out.println("Autor: " + livro2.getAutor());
        System.out.println("Livro: " + livro2.getTitulo());
    }
}