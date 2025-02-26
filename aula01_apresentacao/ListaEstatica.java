package aula01_apresentacao;

public class ListaEstatica {

    private String[] elementos;
    private int tamanho;
    private int CAPACIDADE;

    public ListaEstatica() {
        CAPACIDADE = 10;
        elementos = new String[CAPACIDADE];
        this.tamanho = 0;
    }

    public void adicionar(String elemento) {
        elementos[tamanho] = elemento;
        tamanho++;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tamanho; i++) {
            sb.append(elementos[i]).append(" ");
        }
        return sb.toString();
    }
}
