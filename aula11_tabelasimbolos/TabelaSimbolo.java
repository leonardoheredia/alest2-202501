package aula11_tabelasimbolos;

public class TabelaSimbolo<Chave, Valor> {
    private class Nodo<Chave, Valor> {
        public Chave chave;
        public Valor valor;
        public Nodo proximo;
        public Nodo(Chave chave, Valor valor) {
            this.chave = chave;
            this.valor = valor;
        }
    }
    private Nodo inicio;
    public TabelaSimbolo() {
        //nada
    }
    public void atualizar(Chave chave, Valor valor) {
        Nodo aux = inicio;
        while(aux!=null) {
            if(aux.chave.equals(chave)) {
                aux.valor = valor;
                return;
            }
            aux = aux.proximo;
        }
        aux = new Nodo(chave, valor);
        aux.proximo = inicio;
        inicio = aux;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Nodo aux = inicio;
        while(aux!=null) {
            sb.append(aux.chave).append(" - ").append(aux.valor).append(System.lineSeparator());
            aux = aux.proximo;
        }
        return sb.toString();
    }
}