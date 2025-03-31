public class TesteCompositor {
    public static void main(String[] args) {
        Compositor compositor1 = new Compositor();
        Compositor compositor2 = new Compositor("Tyler Joseph", "2121");
        Compositor[] compositores = new Compositor[2];

        compositores[0] = compositor1;
        compositores[1] = compositor2;

        for(int i = 0; i < 2; i++) {
            System.out.println("Compositor 1: " + compositores[i].getNome() + " ||  Codigo: " + compositores[i].getCodigo());
        }
    }
}
