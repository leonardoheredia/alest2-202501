package aula21_grafos_caminhamento.matriz_adjacencia;

import aula20_grafos.Grafo;

public class App {
    public static void main(String[] args) {
        Grafo g = new Grafo(5);
        g.adicionarAresta(0,1);
        g.adicionarAresta(1,2);
        g.adicionarAresta(2,3);
        g.adicionarAresta(2,4);
        g.adicionarAresta(3,4);

        BuscaEmProfundidade buscaOrigem4 = new BuscaEmProfundidade(g, 4);
        buscaOrigem4.mostrarResultado();

        System.out.println("Caminho do 4 para o 0");
        buscaOrigem4.caminhoPara(0);

    }
}
