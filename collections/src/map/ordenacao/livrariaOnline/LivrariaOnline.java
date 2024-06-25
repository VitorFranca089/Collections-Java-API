package map.ordenacao.livrariaOnline;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LivrariaOnline {

    private Map<String, Livro> livrosMap;

    public LivrariaOnline(){
        this.livrosMap = new HashMap<>();
    }

    public void adicionarLivro(String link, String titulo, String autor, double preco){
        livrosMap.put(autor, new Livro(titulo, autor, preco));
    }

    public void removerLivro(String titulo){
        String removeLivro = null;
        // Map.Entry<String, Livro> l : livrosMap.entrySet()
        for(var l : livrosMap.entrySet()){
            if(l.getValue().getTitulo().equalsIgnoreCase(titulo)){
                removeLivro = l.getKey();
            }
            break;
        }
        livrosMap.remove(removeLivro);
    }

    public void exibirLivrosOrdenadosPorPreco(){
        List<Livro> livrosOrdenadosPreco = new ArrayList<>(livrosMap.values());
        livrosOrdenadosPreco.sort(Comparator.comparingDouble(Livro::getPreco));
        for(Livro l : livrosOrdenadosPreco){
            System.out.println(l);
        }
    }

    public void pesquisarLivrosPorAutor(String autor){
        List<Livro> livrosAutor = new ArrayList<>();
        for(Livro l : livrosMap.values()){
            if(l.getAutor().equalsIgnoreCase(autor)){
                livrosAutor.add(l);
            }
        }
        System.out.println("Livros de " + autor + ":");
        for (Livro l : livrosAutor) {
            System.out.println(l);
        }
    }

    public void obterLivroMaisCaro(){
        Livro livroMaisCaro = null;
        double maisCaro = Double.MIN_VALUE;
        for(Livro l : livrosMap.values()){
            if(l.getPreco() > maisCaro){
                livroMaisCaro = l;
                maisCaro = l.getPreco();
            }
        }
        System.out.println(livroMaisCaro);
    }

    public void obterLivroMaisBarato(){
        Livro livroMaisBarato = null;
        double maisBarato = Double.MAX_VALUE;
        for(Livro l : livrosMap.values()){
            if(l.getPreco() < maisBarato){
                livroMaisBarato = l;
                maisBarato = l.getPreco();
            }
        }
        System.out.println(livroMaisBarato);
    }

}
