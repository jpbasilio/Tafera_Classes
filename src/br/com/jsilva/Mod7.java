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

        System.out.println("\t**Caneta**");
        System.out.println("Modelo: " + caneta.getModelo());
        System.out.println("Cor: " + caneta.getCor());
        System.out.println("Ponta(m.m): " + caneta.getPonta());
        System.out.println("Função: " + caneta.getFuncao());

    }
}
