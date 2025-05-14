package aula21_grafos_caminhamento.matriz_adjacencia;

import aula20_grafos.Grafo;

public class App {
    public static void main(String[] args) {
        Grafo g = new Grafo(5);
        g.adicionarAresta(0,1);
        g.adicionarAresta(1,2);
        g.adicionarAresta(1,3);
        g.adicionarAresta(2, 4);

        BuscaEmLargura largura = new BuscaEmLargura(g, 0);

        largura.mostrarResultados();


    }
}
