public class Pilha {
    private int topo;
    private int[] pilha;

    public Pilha(int tamanhoPilha) {
        this.topo = 0;
        this.pilha = new int[tamanhoPilha];
    }

    public boolean isEmpty() { // verifica se a pilha está vazia
        if(topo == 0) {
            return true;
        }
        return false;
    }

    public void push(int valor) { // adiciona um elemento na pilha
        if (topo >= pilha.length) {
            resize(pilha.length * 2);
        }
        pilha[topo] = valor;
        topo++;
    }


    public int pop() { // remove um elemento da pilha
        if(isEmpty()) {
            throw new RuntimeException("Underflow");
        }
        else {
            topo --;
            int item = pilha[topo];
            if(topo > 0 && topo == pilha.length / 4) {
                resize(pilha.length * 2);
            }
            return item;
        }
    }

    public void resize(int tamanho) { // redimensiona o tamanho da pilha
        int[] temp = new int[tamanho];
        for(int i = 0;i <= topo-1;i++) {
            temp[i] = pilha[i];
        }
        pilha = temp;
    }
}
