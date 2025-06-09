package aula29_grafos_bellmanford;

import aula27_grafos_dijkstra.DigrafoPonderado;

public class App {
    public static void main(String[] args) {
        DigrafoPonderado grafo = new DigrafoPonderado(5);
        grafo.adicionarAresta(0, 1, 5);
        grafo.adicionarAresta(0, 2, 3);
        grafo.adicionarAresta(1, 2, 2);
        grafo.adicionarAresta(1, 3, -60);
        grafo.adicionarAresta(2, 3, 20);
        grafo.adicionarAresta(2, 4, 30);
        grafo.adicionarAresta(3, 4, 2);

        String dotRepresentation = grafo.toDot();
        System.out.println(dotRepresentation);

        BellmanFord bellmanFord = new BellmanFord(grafo, 0);
        bellmanFord.imprimirCaminhos();
    }
}
