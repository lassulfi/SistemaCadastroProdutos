/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controles;

import entidades.Produto;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author luis.assulfi
 */
public class RepositorioManager {
    
    //Criando uma constante para verificar se o RepositorioManager foi criado
    //ou não.
    private static RepositorioManager INSTANCE;
    
    //Contador de produtos
    private long contadorProdutos = 1;
    
    //Criando um ArrayList para armazenar os produtos cadastrados
    private ArrayList<Produto> listaProdutos;
        
    
    //Construtor private
    private RepositorioManager(){
        listaProdutos = new ArrayList<Produto>();
        loadProdutosParaTestes();
    }
    
    //Singleton
    public static RepositorioManager getInstance() {
        if (INSTANCE == null){
            INSTANCE = new RepositorioManager();
        }
        return INSTANCE;
    }
    
    public void cadastrarProduto(Produto p){
        
        //Adicionando a lista de produtos para a lista
        listaProdutos.add(p);
        //atualizando contador de produtos
        contadorProdutos ++;
        System.out.println(p.toString());
        
    }

    /**
     * Método usado para obter o contador atual de produtos
     * @return contadorProdutos é o número atual do contador
     */
    public long getContadorProdutos() {
        return contadorProdutos;
    }
    
    public ArrayList<Produto> obterListaProdutos(){
        return listaProdutos;
    }
    
    /**
     * Lista com Dummy Data para testes
     */
    private void loadProdutosParaTestes(){
        
        for (int i = 0; i < 20; i++){
            Produto p = new Produto(
                new Long(contadorProdutos),     //Código
                "PC" + (i+1),                   //nome do produto
                "...",                          //especificacoes
                500.0f,                         //Preço de venda
                300.0f,                         //Preço de custo
                false);                         //habilitado
            
            contadorProdutos++;
            listaProdutos.add(p);
        }
    }
    
    /**
     * Método para alterar o produto
     * @param p é o produto a ser alterado
     */
    
    public void modificarProduto(Produto p){
        if (listaProdutos.contains(p)){
            int index = listaProdutos.indexOf(p);
            listaProdutos.set(index, p);
        }
    }
    
    
    
}
