package list.operacoesBasicas.carrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itensCompra;

    public CarrinhoDeCompras() {
        this.itensCompra = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        itensCompra.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itensRemovidos = new ArrayList<>();
        for(Item i : itensCompra){
            if(i.getNome().equalsIgnoreCase(nome)){
                itensRemovidos.add(i);
            }
        }
        itensCompra.removeAll(itensRemovidos);
    }

    public double calcularValorTotal(){
        double total = 0;
        for(Item i : itensCompra){
            total += i.getPreco()*i.getQuantidade(); 
        }
        return total;
    }

    public void exibirItens() {
        for(Item i : itensCompra){
            System.out.println(i.toString());
        }
    }

}
