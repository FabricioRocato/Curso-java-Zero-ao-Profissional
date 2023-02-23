package oo.composicao;

import java.util.ArrayList;

public class Compra {

    public String cliente;
    public ArrayList<Item> itens = new ArrayList<Item>();

    void adicionarItem(String nome, int quantidade, double preco){
        this.adicionarItem(new Item(nome, quantidade, preco));
    }
    public void adicionarItem(Item item){
        this.itens.add(item);
        item.compra = this;
    }

    public double obterValorTotal(){
        double total = 0;

        for(Item item: itens){
            total += item.quantidade * item.preco;
        }
        return total;
    }
}
