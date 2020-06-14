package com.mwave.eco;

import javax.persistence.*;

@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "chavedeacesso")
    private String chaveDeAcesso;
    @Column(name = "produto")
    private String produto;
    @Column(name = "codigo")
    private String codigo;
    @Column(name = "unidade")
    private String unidade;
    @Column(name = "valorunitario")
    private String valorUnitario;
    @Column(name = "quantidade")
    private String quantidade;
    @Column(name = "valortotal")
    private String valorTotal;

    public Item() {
    }

    public String getChaveDeAcesso() {
        return chaveDeAcesso;
    }

    public void setChaveDeAcesso(String chaveDeAcesso) {
        this.chaveDeAcesso = chaveDeAcesso;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public String getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(String valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public String getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(String valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {

        String resultado;

        resultado = "Chave: " + getChaveDeAcesso() + "\n";
        resultado = resultado + "Código: " + getCodigo() + "\n";
        resultado = resultado + "Produto: " + getProduto() + "\n";
        resultado = resultado +"Unidade: " + getUnidade()+ "\n";
        resultado = resultado +"Valor Unitário: " + getValorUnitario() + "\n";
        resultado = resultado +"Quantidade: " + getQuantidade() + "\n";
        resultado = resultado +"Valor Total: " + getValorTotal() + "\n";

        return resultado;

    }
}
