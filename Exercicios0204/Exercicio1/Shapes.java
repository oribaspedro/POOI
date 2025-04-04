public class Shapes {
    public static void main(String[] args) {
        Triangulo t1 = new Triangulo();
        Triangulo t2 = new Triangulo();

        t1.setLargura(4.0);
        t1.setAltura(4.0);
        t1.setEstilo("cheio");

        t2.setLargura(8.0);
        t2.setAltura(12.0);
        t2.setEstilo("contorno");

        System.out.println("Info para t1: ");
        t1.mostraEstilo();
        t1.mostraDim();
        System.out.println("Area = " + t1.area());
        System.out.println();
        System.out.println("Info para t2: ");
        t2.mostraEstilo();
        t2.mostraDim();
        System.out.println("Area = " + t2.area());
        System.out.println();

        Retangulo r1 = new Retangulo();
        r1.setAltura(4);
        r1.setLargura(4);

        if(r1.checkQuadrado())
            System.out.println("r1 é um quadrado");
        else
            System.out.println("r1 nao é um quadrado");

        System.out.println("Largura de r1: " + r1.getLargura());
        System.out.println("Altura de r1: " + r1.getAltura());
        r1.mostraDim();
    }
}