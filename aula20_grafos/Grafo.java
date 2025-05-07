package aula20_grafos;

import java.util.ArrayList;

public class Grafo {
    private boolean[][] matriz;
    private int nVertices;
    private int nArestas;

    public Grafo(int nVertices) {
        this.nVertices = nVertices;
        matriz = new boolean[this.nVertices][this.nVertices];
        nArestas = 0;
    }
    public void adicionarAresta(int v, int w) {
        if(existeAresta(v,w)) return;
        matriz[v][w] = true;
        matriz[w][v] = true;
        nArestas++;
    }
    public String gerarDot() {
        StringBuilder sb = new StringBuilder("graph {");
        sb.append(System.lineSeparator());
        for (int v = 0; v < matriz.length; v++) {
            for(int w = v; w < matriz.length; w++) {
                if(matriz[v][w]) sb.append(v).append("--").append(w).append(System.lineSeparator());
            }
        }
        sb.append(System.lineSeparator());
        sb.append("}");
        return sb.toString();
    }
    public boolean existeAresta(int v, int w) {
        return matriz[v][w];
    }
    public void removerAresta(int v, int w) {
        if(existeAresta(v,w)) {
            matriz[v][w] = false;
            matriz[w][v] = false;
            nArestas--;
        }
    }

    public int obterGrau(int v) {
        int grau = 0;
        for (int w = 0; w < nVertices; w++) {
            if(matriz[v][w]) grau++;
        }
        return grau;
    }
    public ArrayList<Integer> adjacentes(int v) {
        //retorna uma lista com os vertices adjacentes ao v
        ArrayList<Integer> a = new ArrayList<>();
        for (int w = 0; w < nVertices; w++) {
            if(matriz[v][w]) a.add(w);
        }
        return a;
    }

}
