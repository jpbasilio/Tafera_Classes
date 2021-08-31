package br.com.jsilva;
/**
 * Exercício 7:
 * Exercício onde trago um objeto do mundo real, acrescento suas
 * propriedades e alguns comentários
 * @author joao
 *
 * @class br.com.jsilva.Caneta
 */
public class Caneta {

    //Declarando variáveis
    private String modelo;
    private String cor;
    private String funcao;
    private float ponta;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }
}
