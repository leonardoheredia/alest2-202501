package aula23_grafos_lista_adjacencia;

import java.util.ArrayList;

public class GrafoListaAdjacencia {
    private ArrayList<Integer>[] listaAdjacencia;
    private int numVertices;
    private int numArestas;
    private boolean direcionado;

    public GrafoListaAdjacencia(int numVertices, boolean direcionado) {
        this.numVertices = numVertices;
        this.direcionado = direcionado;
        listaAdjacencia = new ArrayList[numVertices];
        for (int i = 0; i < numVertices; i++) {
            listaAdjacencia[i] = new ArrayList<>();
        }
    }
    public void adicionarAresta(int v, int w) {
        if (v < 0 || v >= numVertices || w < 0 || w >= numVertices) {
            throw new IllegalArgumentException("Vértice inválido");
        }
        listaAdjacencia[v].add(w);
        if (!direcionado) {
            listaAdjacencia[w].add(v);
        }
        numArestas++;
    }
    public void removerAresta(int v, int w) {
        if (v < 0 || v >= numVertices || w < 0 || w >= numVertices) {
            throw new IllegalArgumentException("Vértice inválido");
        }
        listaAdjacencia[v].remove(Integer.valueOf(w));
        if (!direcionado) {
            listaAdjacencia[w].remove(Integer.valueOf(v));
        }
        numArestas--;
    }
    public ArrayList<Integer> obterAdjacentes(int v) {
        if (v < 0 || v >= numVertices) {
            throw new IllegalArgumentException("Vértice inválido");
        }
        return listaAdjacencia[v];
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numVertices; i++) {
            sb.append(i).append(": ");
            for (int j : listaAdjacencia[i]) {
                sb.append(j).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
    public String toDot() {
        // Gera a representação em formato DOT
        StringBuilder sb = new StringBuilder();
        sb.append("digraph G {\n");
        for (int i = 0; i < numVertices; i++) {
            for (int j : listaAdjacencia[i]) {
                sb.append(i).append(" -> ").append(j).append(";\n");
            }
        }
        sb.append("}\n");
        return sb.toString();
    }
    public int getNumVertices() {
        return numVertices;
    }
    public int getNumArestas() {
        return numArestas;
    }
    public int obterGrau(int v) {
        if (v < 0 || v >= numVertices) {
            throw new IllegalArgumentException("Vértice inválido");
        }
        return listaAdjacencia[v].size();
    }
}
