package main.Ejercicio_01_insert;

import main.Materia.Models.Node;

public class EjemploInsertBST {

    public static void main(String[] args) {

        InsertBST insertBST = new InsertBST();
        Node root = null;

        root = insertBST.insert(root, 8);
        root = insertBST.insert(root, 3);
        root = insertBST.insert(root, 10);
        root = insertBST.insert(root, 1);
        root = insertBST.insert(root, 6);
        root = insertBST.insert(root, 14);
        root = insertBST.insert(root, 4);
        root = insertBST.insert(root, 7);
        root = insertBST.insert(root, 13);

        System.out.println("Recorrido InOrder (BST):");
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