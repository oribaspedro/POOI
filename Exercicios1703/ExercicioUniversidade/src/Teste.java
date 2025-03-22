public class Teste {
    public static void main(String[] args) {
        Universidade universidade1 = new Universidade();
        Aluno aluno1 = new Aluno();
        universidade1.nome = "Unicentro";
        universidade1.cidade = "Guarapuava";
        universidade1.estado = "Parana";
        aluno1.nome = "Pedro Ribas";
        aluno1.curso = "Ciencia da computacao";

        universidade1.exibeDados();
        aluno1.exibeDados();
    }
}