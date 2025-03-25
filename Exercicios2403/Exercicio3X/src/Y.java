public class Y {
    public static void main (String[ ] args) {
        X ob = new X();
        ob.cont = 10;
        //ob.setCont(10); versao corrigida
    }
}
/*
Este código está errado porque o valor de cont de ob está tentando ser alterado através do acesso
direto do atributo na main, o que não pode ser feito pois ele tem modificador de acesso private.
Portanto, a atribuição correta seria através do metodo setCont da classe X.
*/