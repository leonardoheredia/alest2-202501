package aula25_grafos_ponderados;

public class Aresta {
    private int v;
    private int w;
    private int peso;
    public Aresta(int v, int w, int peso) {
        this.v = v;
        this.w = w;
        this.peso = peso;
    }
    public int getV() {
        return v;
    }

    public int getW() {
        return w;
    }

    public int getPeso() {
        return peso;
    }

    @Override
    public String toString() {
        return v + " -- " + w + "(" + peso + ")";
    }
}
