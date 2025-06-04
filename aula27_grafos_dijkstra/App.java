package aula27_grafos_dijkstra;

import java.util.HashMap;

public class App {
    public static void main(String[] args) {
        DigrafoPonderado grafo = new DigrafoPonderado(5);
        grafo.adicionarAresta(0, 1, 5);
        grafo.adicionarAresta(0, 2, 3);
        grafo.adicionarAresta(1, 2, 2);
        grafo.adicionarAresta(1, 3, 6);
        grafo.adicionarAresta(2, 3, 20);
        grafo.adicionarAresta(2, 4, 30);
        grafo.adicionarAresta(3, 4, 2);

        /*
                digraph G {
                    0 -> 1 [label=5];
                    0 -> 2 [label=3];
                    1 -> 2 [label=2];
                    1 -> 3 [label=6];
                    2 -> 3 [label=7];
                    2 -> 4 [label=4];
                    3 -> 4 [label=2];
                }
         */
        // Adicionando arestas com pesos

        // Imprimindo o grafo
        grafo.imprimir();

        // Convertendo para formato DOT
        String dotRepresentation = grafo.toDot();
        System.out.println(dotRepresentation);

        Dijkstra dijkstra = new Dijkstra(grafo, 0);
        dijkstra.imprimirCaminhos();

    }
}
