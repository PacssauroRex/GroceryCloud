package br.com.grocerycloud.grocerycloud.negocio.excecoes.vendas;

/** 
 * @author Arthur de Sá Tenório
 * @category Classe de exceção da aplicação
*/

public class ProdutoInsuficienteException extends Exception {
    private static final long serialVersionUID = 1L;
    
    public ProdutoInsuficienteException(){
        super("Produto com quantidades insuficientes em estoque.");
    }
}
