public class Notebook extends Computador {
    private int codigo;
    public Notebook(int ano, int codigo) {
        super(ano);
        System.out.println("Notebook()");
        this.codigo = codigo;
        ligar();
    }
    public void ligar() {
        System.out.println("Código: " + codigo);
    }
}
