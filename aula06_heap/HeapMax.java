package aula06_heap;

public class HeapMax {

    private int[] chaves;
    private int capacidade = 50;
    private int tamanho;

    public HeapMax() {
        tamanho = 0;
        chaves = new int[capacidade];
    }

    public void inserir(int chave) {
        chaves[tamanho] = chave;
        //chamar o swim/subir/heapfy-up
        swim(tamanho);
        tamanho++;
    }
    public void swim(int posicao) {
        if(posicao==0) return;
        int posicao_pai = (posicao - 1) / 2;
        if(chaves[posicao] > chaves[posicao_pai]) {
            trocar(posicao, posicao_pai);
        }
        swim(posicao_pai);
    }
    private void trocar(int posicaoA, int posicaoB) {
        int temp = chaves[posicaoA];
        chaves[posicaoA] = chaves[posicaoB];
        chaves[posicaoB] = temp;
    }

    public int removerMaximo() {
        trocar(0, tamanho-1);
        heapfy(0);
        tamanho--;
        return -1;
    }

    private void heapfy(int posicao) {
        int posMaior = posicao;
        int posEsquerda = posicao*2 + 1;
        int posDireita = posicao*2 + 2;

        if(chaves[posEsquerda] > chaves[posMaior]) posMaior = posEsquerda;
        if(chaves[posDireita] > chaves[posMaior]) posMaior = posDireita;

        trocar(posicao, posMaior);

    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tamanho; i++) {
            sb.append(chaves[i]).append(" ");
        }
        return sb.toString();
    }


}
