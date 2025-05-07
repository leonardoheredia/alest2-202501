package aula20_grafos;

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
        matriz[v][w] = true;
        matriz[w][v] = true;
        nArestas++;
    }
    public String gerarDot() {
        StringBuilder sb = new StringBuilder("graph {");
        sb.append(System.lineSeparator());
        for (int v = 0; v < matriz.length; v++) {
            for(int w = 0; w < matriz.length; w++) {
                if(matriz[v][w]) sb.append(v).append("--").append(w).append(System.lineSeparator());
            }
        }
        sb.append(System.lineSeparator());
        sb.append("}");
        return sb.toString();
    }
    public void removerAresta(int v, int w) {
        //implementar
    }

}
