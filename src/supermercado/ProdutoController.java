/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermercado;

/**
 *
 * @author venec
 */
public class ProdutoController {

    public boolean salvarProduto(ProdutoEntity produto) {
        
        return this.validacao(produto); //... salvar no banco de dados ..//
    }
    
    
    public boolean validacao(ProdutoEntity produto){
        
        return !produto.getNome().equals("");
        
    }
        
}
