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

        buscarEmProfundidadeRecursivo(this.origem);
    }
    private void buscarEmProfundidadeRecursivo(int v) {
        percorridos[v] = true;
        for(int w:grafo.obterAdjacentes(v)) {
            if(!percorridos[w]) {
                anteriores[w] = v;
                buscarEmProfundidadeRecursivo(w);
            }
        }
    }
    public void mostrarResultado() {
        System.out.println("vertice;percorrido;anterior");
        for (int v = 0; v < grafo.getNumVertices(); v++) {
            System.out.print(v + " " + percorridos[v] + " " + anteriores[v]);
            System.out.println();
        }
        System.out.println();
    }
}
