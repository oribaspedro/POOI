public class Retangulo {
    private double comprimento, largura;
    private static int qtdRetangulos = 0;

    public Retangulo() {
        comprimento = 1;
        largura = 1;
        qtdRetangulos++;
    }
    public Retangulo(double comprimento, double largura) {
        this.comprimento = comprimento;
        this.largura = largura;
        qtdRetangulos++;
    }

    public static int getQtdRetangulos() {
        return qtdRetangulos;
    }

    public double calcularPerimetro() {
        return (comprimento * 2) + (largura * 2);
    }

    public double calcularArea() {
        return comprimento * largura;
    }

    public void mostrarPerimetro() {
        System.out.println("Perimetro do retangulo: " + calcularPerimetro() + " metros");
    }

    public void mostrarArea() {
        System.out.println("Area do retangulo: " + calcularArea() + " metros quadrados");
    }

    public boolean isQuadrado() {
        if(comprimento == largura)
            return true;
        else
            return false;
    }

    public double getComprimento() {
        return comprimento;
    }

    public double getLargura() {
        return largura;
    }

    public void setComprimento(double comprimento) {
        if(comprimento > 0)
            this.comprimento = comprimento;
        else
            System.out.println("Erro ao fazer a alteração, o comprimento deve ser maior do que 0");
    }

    public void setLargura(double largura) {
        if (largura > 0)
            this.largura = largura;
        else
            System.out.println("Erro ao fazer a alteração, o comprimento deve ser maior do que 0");
    }
}
