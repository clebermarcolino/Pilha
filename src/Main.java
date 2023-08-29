public class Main {
    public static void main(String[] args) {
        Pilha pilha = new Pilha(5);
        System.out.println(pilha.isEmpty());
        pilha.push(3);
        System.out.println(pilha.pop());
        pilha.push(4);
        pilha.push(6);
        pilha.push(2);
        pilha.push(23);
        pilha.push(30);
        System.out.println(pilha.pop());
        System.out.println(pilha.isEmpty());
        pilha.resize(9);
    }
}