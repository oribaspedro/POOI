public class UsaTest {
    public static void main(String[] args) {
        Test test1 = new Test(5);
        Test test2 = new Test(10);
        System.out.println("Antes da troca");
        System.out.println("ob1.a = " + test1.getA());
        System.out.println("ob2.a = " + test2.getA());
        troca(test1, test2);
        System.out.println("Depois da troca");
        System.out.println("ob1.a = " + test1.getA());
        System.out.println("ob2.a = " + test2.getA());
    }

    public static void troca(Test ob1, Test ob2) {
        Test temp = new Test(0);
        /*
        temp = ob1;
        ob1 = ob2;
        ob2 = temp;
         */
        temp.setA(ob1.getA());
        ob1.setA(ob2.getA());
        ob2.setA(temp.getA());
        System.out.println("Durante a troca:");
        System.out.println("ob1.a = " + ob1.getA());
        System.out.println("ob2.a = " + ob2.getA());
        /*
        Fazendo a troca entre as variáveis passadas pelos parâmetros do metodo, a troca que estará
        sendo feita não será dos valores dos atributos dos objetos, mas sim das referências que foram
        passadas para as variáveis locais dos métodos, dessa forma, depois que o metodo se encerra,
        nada muda, pois os atributos não foram alterados. Para resolver isso é preciso usar os métodos
        setA() e getA(), para acessar e alterar os atributos dos objetos para as quais as variáveis
        locais guardam as referências.
        */
    }
}