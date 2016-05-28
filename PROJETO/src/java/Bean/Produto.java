/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

/**
 *
 * @author Douglas
 */
public class Produto {
    
    private String descricao;
    private double precoUnidade;
    private int quantidade;
    private String imagem;
    private double centro;

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the precoUnidade
     */
    public double getPrecoUnidade() {
        return precoUnidade;
    }

    /**
     * @param precoUnidade the precoUnidade to set
     */
    public void setPrecoUnidade(double precoUnidade) {
        this.precoUnidade = precoUnidade;
    }

    /**
     * @return the quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * @return the imagem
     */
    public String getImagem() {
        return imagem;
    }

    /**
     * @param imagem the imagem to set
     */
    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    /**
     * @return the centro
     */
    public double getCentro() {
        return centro;
    }

    /**
     * @param centro the centro to set
     */
    public void setCentro(double centro) {
        this.centro = centro;
    }
}
