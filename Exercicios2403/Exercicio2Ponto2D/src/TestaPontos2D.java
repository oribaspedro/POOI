public class TestaPontos2D {
    public static void main(String[] args) {
        System.out.println("Quantidade de pontos criados: " + Ponto2D.getContador());

        Ponto2D p1 = new Ponto2D();
        System.out.println("Quantidade de pontos criados: " + Ponto2D.getContador());

        Ponto2D p2 = new Ponto2D(5, 2);
        System.out.println("Quantidade de pontos criados: " + Ponto2D.getContador());

        System.out.println("Coordenadas de p1: (" + p1.getX() + ", " + p1.getY() + ")");
        System.out.println("Coordenadas de p2: (" + p2.getX() + ", " + p2.getY() + ")");
        System.out.println("Quantidade de pontos criados: " + Ponto2D.getContador());
    }
}