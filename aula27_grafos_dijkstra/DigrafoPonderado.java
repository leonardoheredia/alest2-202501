package aula27_grafos_dijkstra;

import java.util.ArrayList;

public class DigrafoPonderado {
    private class Aresta {
        int destino;
        int peso;

        Aresta(int destino, int peso) {
            this.destino = destino;
            this.peso = peso;
        }
    }
    private int numVertices;
    private ArrayList<Aresta>[] listaAdjacencia;

    public DigrafoPonderado(int numVertices) {
        this.numVertices = numVertices;
        listaAdjacencia = new ArrayList[numVertices];
        for (int i = 0; i < numVertices; i++) {
            listaAdjacencia[i] = new ArrayList<>();
        }
    }
    public void adicionarAresta(int origem, int destino, int peso) {
        if (origem < 0 || origem >= numVertices || destino < 0 || destino >= numVertices) {
            throw new IllegalArgumentException("Índices de vértices inválidos.");
        }
        listaAdjacencia[origem].add(new Aresta(destino, peso));
    }
    public ArrayList<Aresta> getArestasAdjacentes(int vertice) {
        if (vertice < 0 || vertice >= numVertices) {
            throw new IllegalArgumentException("Índice de vértice inválido.");
        }
        return listaAdjacencia[vertice];
    }

    public void imprimir() {
        for (int i = 0; i < numVertices; i++) {
            System.out.print("Vértice " + i + ": ");
            for (Aresta aresta : listaAdjacencia[i]) {
                System.out.print(" -> " + aresta.destino + " (Peso: " + aresta.peso + ")");
            }
            System.out.println();
        }
    }
    public String toDot() {
        StringBuilder sb = new StringBuilder();
        sb.append("digraph G {\n");
        for (int i = 0; i < numVertices; i++) {
            for (Aresta aresta : listaAdjacencia[i]) {
                sb.append("    ").append(i).append(" -> ").append(aresta.destino)
                  .append(" [label=\"").append(aresta.peso).append("\"];\n");
            }
        }
        sb.append("}\n");
        return sb.toString();
    }
}
