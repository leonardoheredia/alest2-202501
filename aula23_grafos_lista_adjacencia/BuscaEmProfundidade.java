package aula23_grafos_lista_adjacencia;

public class BuscaEmProfundidade {
    private GrafoListaAdjacencia grafo;
    private int origem;
    private boolean[] percorridos;
    private int[] anteriores;
    public BuscaEmProfundidade(GrafoListaAdjacencia grafo, int origem) {
        this.grafo = grafo;
        this.origem = origem;
        percorridos = new boolean[this.grafo.getNumVertices()];
        anteriores = new int[this.grafo.getNumVertices()];
        for(int v=0;v<this.grafo.getNumVertices();v++) anteriores[v] = -1;

    }
    private void buscarEmProfundidadeRecursivo(int v) {
        //IMPLEMENTAR
    }
}
