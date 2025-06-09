package aula29_grafos_bellmanford;

import aula27_grafos_dijkstra.DigrafoPonderado;

public class BellmanFord {
    private DigrafoPonderado grafo;
    private int origem;
    private boolean[] visitados;
    private int[] anteriores;
    private int[] distancia;

    public BellmanFord(DigrafoPonderado grafo, int origem) {
        this.grafo = grafo;
        this.origem = origem;
        visitados = new boolean[this.grafo.getNumVertices()];
        anteriores = new int[this.grafo.getNumVertices()];
        distancia = new int[this.grafo.getNumVertices()];


        for (int v = 0; v < anteriores.length; v++) {
            anteriores[v] = -1;
        }

        rodarBellmanFord();
    }

    private void rodarBellmanFord() {
        for (int i = 0; i < anteriores.length; i++) {
          distancia[i] = Integer.MAX_VALUE;
        }
        distancia[this.origem] = 0;

        for (int n = 0; n < this.grafo.getNumVertices(); n++) {
            for (int v = 0; v < this.grafo.getNumVertices(); v++) {
                for(DigrafoPonderado.Aresta e : grafo.getArestasAdjacentes(v)) {
                    int w = e.getDestino();
                    int peso = e.getPeso();
                    if (distancia[v] + peso < distancia[w]) {
                        distancia[w] = distancia[v] + peso;
                        anteriores[w] = v;
                    }
                }
            }
        }
    }

    public void imprimirCaminhos() {
        System.out.println("Caminhos mais curtos a partir do vértice " + origem + ":");
        System.out.println("Vértice, Anterior, Distância");
        for (int v = 0; v < anteriores.length ; v++) {
            System.out.println(v + "," + anteriores[v] + "," + distancia[v]);
        }
    }


}
