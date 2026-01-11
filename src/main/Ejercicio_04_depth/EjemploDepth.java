package main.Ejercicio_04_depth;

import main.Materia.Models.Node;

public class EjemploDepth {

    public static void main(String[] args) {

        Depth depthCalculator = new Depth();
        Node root = new Node(1);
        root.setLeft(new Node(2));
        root.setRight(new Node(3));

        root.getLeft().setLeft(new Node(4));
        root.getLeft().getLeft().setLeft(new Node(5));
        int depth = depthCalculator.maxDepth(root);

        System.out.println("Profundidad máxima del árbol: " + depth);
    }
}