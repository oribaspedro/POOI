public class JavaApp {
    public static void main (String[] args){
        /*Java é a classe*/Java javaObj = new Java("Java 11"); //esta é uma instância de um objeto da classe Java
        System.out.println(javaObj.getNome());//.getNome() é um metodo getter, que acessa o valor do atributo nome do objeto javaObj que é da classe Java
    }
}

/*
Uma classe é um conceito abstrato de um tipo de objeto
Um objeto é uma instância de uma classe, a realização concreta do conceito, com seus atributos e características
Um metodo é um bloco de codigo que pertence às classes e que fazem coisas nos objetos dessa classe, como mostrar os dados do objeto ou alterá-los
 */