package aula23_grafos_lista_adjacencia;


import aula20_grafos.Digrafo;

public class App {
    public static void main(String[] args) {
        GrafoListaAdjacencia grafo = new GrafoListaAdjacencia(5, false);
        grafo.adicionarAresta(0, 1);
        grafo.adicionarAresta(0, 2);
        grafo.adicionarAresta(1, 3);
        grafo.adicionarAresta(2, 4);
        System.out.println(grafo.toString());
        System.out.println(grafo.toDot());

        GrafoListaAdjacencia digrafo = new GrafoListaAdjacencia(5, true);
        digrafo.adicionarAresta(0,1);
        digrafo.adicionarAresta(0,2);
        digrafo.adicionarAresta(3, 1);
        digrafo.adicionarAresta(3,2);
        digrafo.adicionarAresta(4,1);
        System.out.println(digrafo.toDot());

        BuscaEmProfundidade profundidade = new BuscaEmProfundidade(grafo, 0);
        profundidade.mostrarResultado();
    }
}
