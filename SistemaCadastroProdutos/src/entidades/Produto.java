/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author luis.assulfi
 */
public class Produto {
        
    //atributos da classe
    
    private Long codigo;
    private String nome;
    private String especificacoes;
    private float precoVenda;
    private float precoCusto;
    private boolean habilitadoVendas;
    
    //construtor padrao
    public Produto(Long codigo, String nome, String especificacoes, float precoVenda, float precoCusto, boolean habilitadoVendas) {
        this.codigo = codigo;
        this.nome = nome;
        this.especificacoes = especificacoes;
        this.precoVenda = precoVenda;
        this.precoCusto = precoCusto;
        this.habilitadoVendas = habilitadoVendas;
    }
    
    //metodos da classe
    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecificacoes() {
        return especificacoes;
    }

    public void setEspecificacoes(String especificacoes) {
        this.especificacoes = especificacoes;
    }

    public float getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(float precoVenda) {
        this.precoVenda = precoVenda;
    }

    public float getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(float precoCusto) {
        this.precoCusto = precoCusto;
    }

    public boolean isHabilitadoVendas() {
        return habilitadoVendas;
    }

    public void setHabilitadoVendas(boolean habilitadoVendas) {
        this.habilitadoVendas = habilitadoVendas;
    }

    @Override
    public String toString() {
        String valores = "codigo=" + codigo + 
                ", nome=" + nome + 
                ", especificacoes=" + especificacoes + 
                ", precoVenda=" + precoVenda + 
                ", precoCusto=" + precoCusto + 
                ", habilitadoVendas=" + habilitadoVendas;
        
        return valores;
    }
    
    
    
}
