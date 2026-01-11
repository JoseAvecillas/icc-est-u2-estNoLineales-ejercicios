package main.Ejercicio_02_invert;

import main.Materia.Models.Node;

public class EjemploInvertBinaryTree {
    public static void main(String[] args) {

        InvertBinaryTree inverter = new InvertBinaryTree();
        // Construimos el árbol manualmente
        Node root = new Node(4);
        root.setLeft(new Node(2));
        root.setRight(new Node(7));

        root.getLeft().setLeft(new Node(1));
        root.getLeft().setRight(new Node(3));

        root.getRight().setLeft(new Node(6));
        root.getRight().setRight(new Node(9));

        System.out.println("Árbol original (InOrder):");
        inOrder(root);

        // Invertimos el árbol
        inverter.invertTree(root);

        System.out.println("\nÁrbol invertido (InOrder):");
        inOrder(root);
    }

    private static void inOrder(Node node) {
        if (node != null) {
            inOrder(node.getLeft());
            System.out.print(node.getValue() + " ");
            inOrder(node.getRight());
        }
    }
}