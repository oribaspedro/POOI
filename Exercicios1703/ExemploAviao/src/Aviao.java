public class Aviao {
    /*private*/ String fabricante, modelo;
    /*private*/ int qtdAssentos;
    /*Quando o modificador de acesso private é adicionado aos atributos da classe Aviao, eles não ficam acessíveis por classes de fora da classe Aviao.
    O resultado no console foi:
    fabricante has private access in Aviao
    modelo has private access in Aviao
    qtdAssentos has private access in Aviao*/

    public void ligar() {
        System.out.println("Ligar aviao " + fabricante + " " + modelo + " com " + qtdAssentos + " assentos.");
    }
}