package aula20_grafos;

public class Digrafo {
    private boolean[][] matriz;
    private int nVertices;
    private int nArestas;

    public Digrafo(int nVertices) {
        this.nVertices = nVertices;
        matriz = new boolean[this.nVertices][this.nVertices];
        nArestas = 0;
    }
    public void adicionarAresta(int v, int w) {
        if(matriz[v][w]) return; //se ja existir cai fora
        matriz[v][w] = true;
        nArestas++;
    }
    public String gerarDot() {
        StringBuilder sb = new StringBuilder("digraph { ").append(System.lineSeparator());
        for (int v = 0; v < nVertices; v++) {
            for (int w = 0; w < nVertices; w++) {
                if(matriz[v][w]) sb.append(v).append("->").append(w).append(System.lineSeparator());
            }
        }
        sb.append("}");
        return sb.toString();
    }

}
