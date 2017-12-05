/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controles;

import entidades.Produto;

/**
 *
 * @author luis.assulfi
 */
public class CadastroController {

    //métodos
    /**
     * Método para verificar se um produto foi cadastrado com sucesso
     *
     * @param p parametro referente ao produto que está sendo cadastrado
     * @return
     */
    public boolean cadastrarProduto(Produto p) {
        
        boolean result = false;

        if (p != null && p.getNome().length() > 0 && p.getPrecoCusto() != 0.0f
                && p.getPrecoVenda() != 0.0f
                && p.getEspecificacoes().length() > 0) {
            
            //Seta o codigo valido
            p.setCodigo(RepositorioManager.getInstance().getContadorProdutos());
            
            //insere o modelo no banco de dados
            RepositorioManager.getInstance().cadastrarProduto(p);
            
            System.out.println(p.toString());
            
            result = true;
        }

        return result;
    }

public boolean atualizarProduto(Produto p){
    
    boolean result = false;
    
    if (p != null && p.getNome().length() > 0 && p.getPrecoCusto() != 0.0f
                && p.getPrecoVenda() != 0.0f
                && p.getEspecificacoes().length() > 0) {
            
            //Seta o codigo valido
            p.setCodigo(RepositorioManager.getInstance().getContadorProdutos());
            
            //Atualiza o modelo no banco de dados
            RepositorioManager.getInstance().modificarProduto(p);
            
            System.out.println(p.toString());
            
            result = true;
        }
    
    return result;
    
}    

}
