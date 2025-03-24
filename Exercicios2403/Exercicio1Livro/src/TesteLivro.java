public class TesteLivro {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        Livro livro2 = new Livro("Arthur Miller", "All My Sons");

        livro1.exibeDados();
        livro2.exibeDados();
        Livro.getContador();
    }
}