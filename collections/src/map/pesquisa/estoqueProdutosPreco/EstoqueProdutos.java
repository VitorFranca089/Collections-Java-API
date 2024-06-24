package map.pesquisa.estoqueProdutosPreco;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long, Produto> estoqueMap;

    public EstoqueProdutos() {
        this.estoqueMap = new HashMap<>();
    }

    public void adicionarProduto(Long cod, String nome, int quantidade, double preco){
        estoqueMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProduto(){
        System.out.println(estoqueMap);
    }

    public double calcularValorTotalEstoque(){
        double valorTotalEstoque = 0;
        if(!estoqueMap.isEmpty()){
            for (Produto p : estoqueMap.values()) {
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro(){
        Produto maisCaro = null;
        if(!estoqueMap.isEmpty()){
            double maiorPreco = 0;
            for(Produto p : estoqueMap.values()){
                if(p.getPreco() > maiorPreco){
                    maiorPreco = p.getPreco();  // Atualiza o maior preço
                    maisCaro = p;
                }
            }
        }
        return maisCaro;
    }

    public Produto obterProdutoMaisBarato(){
        Produto maisBarato = null;
        if(!estoqueMap.isEmpty()){
            double menorPreco = Double.MAX_VALUE;
            for(Produto p : estoqueMap.values()){
                if(p.getPreco() < menorPreco){
                    menorPreco = p.getPreco();
                    maisBarato = p;
                }
            }
        }
        return maisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
        Produto maiorQProduto = null;
        if(!estoqueMap.isEmpty()){
            double maiorQuantidadeValorTotal = 0;
            for(Produto p : estoqueMap.values()){
                double valorTotal = p.getQuantidade() * p.getPreco();
                if(valorTotal > maiorQuantidadeValorTotal){
                    maiorQuantidadeValorTotal = valorTotal;  // Atualiza o maior valor total
                    maiorQProduto = p;
                }
            }
        }
        return maiorQProduto;
    }

}
