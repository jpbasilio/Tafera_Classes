package br.com.jsilva;
/**
 * @author joao
 */
public class Mod7 {

    public static void main(String[] args) {

        Caneta caneta = new Caneta();
        caneta.setModelo("Montblanc");
        caneta.setCor("Azul");
        caneta.setPonta(0.7f);
        caneta.setFuncao("Caneta Esferográfica");

        System.out.println(caneta.getModelo());
        System.out.println(caneta.getCor());
        System.out.println(caneta.getPonta());
        System.out.println(caneta.getFuncao());

    }
}
