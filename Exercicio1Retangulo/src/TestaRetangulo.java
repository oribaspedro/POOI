public class TestaRetangulo {
    public static void main(String[] args) {
        Retangulo retangulo1 = new Retangulo(5, 10);
        Retangulo retangulo2 = new Retangulo();

        //retangulo1
        System.out.println("Comprimento do retangulo1: " + retangulo1.getComprimento());
        System.out.println("Largura do retangulo1: " + retangulo1.getLargura());
        retangulo1.mostrarPerimetro();
        retangulo1.mostrarArea();

        if(retangulo1.isQuadrado() == true)
            System.out.println("O retangulo1 e um quadrado");
        else
            System.out.println("O retangulo1 nao e uma quadrado");

        retangulo1.setComprimento(0);
        retangulo1.setLargura(0);
        retangulo1.setComprimento(30);
        retangulo1.setLargura(20);
        System.out.println("Comprimento do retangulo1: " + retangulo1.getComprimento());
        System.out.println("Largura do retangulo1: " + retangulo1.getLargura());

        //retangulo2
        System.out.println("Comprimento do retangulo2: " + retangulo2.getComprimento());
        System.out.println("Largura do retangulo2: " + retangulo2.getLargura());
        retangulo2.mostrarPerimetro();
        retangulo2.mostrarArea();

        if(retangulo2.isQuadrado() == true)
            System.out.println("O retangulo2 e um quadrado");
        else
            System.out.println("O retangulo2 nao e uma quadrado");

        retangulo2.setComprimento(-4);
        retangulo2.setLargura(-6);
        retangulo2.setComprimento(4);
        retangulo2.setLargura(2);
        System.out.println("Comprimento do retangulo2: " + retangulo2.getComprimento());
        System.out.println("Largura do retangulo2: " + retangulo2.getLargura());

        System.out.println("Quantidade de retangulos criados: " + Retangulo.getQtdRetangulos());
    }
}