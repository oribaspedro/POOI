public class Compositor {
    private String codigo, nome;

    public Compositor() {
        codigo = "undefined";
        nome = "Anonimo";
    }
    public Compositor(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }
    public String getNome() {
        return nome;
    }

}
