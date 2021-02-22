package desafio01;

import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {
        
        List<Produto> lista = new ArrayList<>();
        int[] quantidades = {3, 7, 1, 20, 3, 4};

        Caixa caixa = new Caixa();

        Produto produto01 = new Produto("Banana", 0.99, 2);
        Produto produto02 = new Produto("Energético", 5.49, 3);
        Produto produto03 = new Produto("Arroz", 20.0, 1);
        Produto produto04 = new Produto("Chocolate", 4.5, 1);
        Produto produto05 = new Produto("Leite", 3.73, 3);
        Produto produto06 = new Produto("Abacaxi", 2.4, 2);

        lista.add(produto01);
        lista.add(produto02);
        lista.add(produto03);
        lista.add(produto04);
        lista.add(produto05);
        lista.add(produto06);
        
        for(int i = 0 ; i < lista.size() ; i++) {
            Produto produto = lista.get(i);
            System.out.printf("nome: %s valor: %.3f\n", produto.getNome(), caixa.calculaValorFinal(produto, quantidades[i]));
        }


    }

}
