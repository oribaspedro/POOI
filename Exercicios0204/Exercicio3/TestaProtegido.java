public class TestaProtegido {
    public static void main(String[] args) {
        Protegido exemplo = new Protegido(8);
        System.out.println("x: "+ exemplo.getI());

        ProtegidoSub exemplo1 = new ProtegidoSub(4);
        exemplo1.ajustar(12);
        exemplo.ajustar(10);
        System.out.println("x: "+ exemplo.getI());
        System.out.println("x: "+ exemplo1.getI());
    }
}