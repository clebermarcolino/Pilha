package main.pilha;

import main.pilha.Pilha;

public class Main {
    public static void main(String[] args) {
        Pilha pilha = new Pilha(5);

        pilha.push(10);
        pilha.push(20);
        pilha.push(30);

        System.out.println("Pilha está vazia? " + pilha.isEmpty());
        System.out.println("Elemento retirado: " + pilha.pop());

        pilha.push(40);
        pilha.push(50);
        pilha.push(60);

        System.out.println("Pilha está vazia? " + pilha.isEmpty());

        while (!pilha.isEmpty()) {
            System.out.println("Elemento retirado: " + pilha.pop());
        }

        System.out.println("Pilha está vazia? " + pilha.isEmpty());
    }
}
